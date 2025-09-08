package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SignupActivity extends AppCompatActivity {

    private EditText signupName, signupEmail, signupPassword;
    private Button signupButton;
    private TextView loginRedirectText, skipText;
    private FirebaseAuth mAuth;
    private DatabaseReference databaseRef;

    private static final String TAG = "SignupActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();
        databaseRef = FirebaseDatabase.getInstance().getReference("Users");

        // Bind UI elements
        signupName = findViewById(R.id.signup_name);
        signupEmail = findViewById(R.id.signup_email);
        signupPassword = findViewById(R.id.signup_password);
        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        skipText = findViewById(R.id.skip_text);

        // Set click listeners
        signupButton.setOnClickListener(view -> registerUser());
        loginRedirectText.setOnClickListener(view -> navigateToLogin());
        skipText.setOnClickListener(view -> skipSignup());
    }

    private void registerUser() {
        String name = signupName.getText().toString().trim();
        String email = signupEmail.getText().toString().trim();
        String password = signupPassword.getText().toString().trim();

        // 🔥 Validate Input Fields
        if (!validateInputs(name, email, password)) return;

        // 🔥 Firebase Signup Process
        mAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        if (user != null) {
                            saveUserToDatabase(user.getUid(), name, email);
                        }
                    } else {
                        handleSignupError(task.getException());
                    }
                });
    }

    private boolean validateInputs(String name, String email, String password) {
        if (TextUtils.isEmpty(name)) {
            signupName.setError("Name is required");
            signupName.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(email)) {
            signupEmail.setError("Email is required");
            signupEmail.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            signupPassword.setError("Password is required");
            signupPassword.requestFocus();
            return false;
        }
        if (password.length() < 6) {
            signupPassword.setError("Password must be at least 6 characters");
            signupPassword.requestFocus();
            return false;
        }
        return true;
    }

    private void saveUserToDatabase(String userId, String name, String email) {
        User user = new User(name, email);
        databaseRef.child(userId).setValue(user)
                .addOnSuccessListener(aVoid -> {
                    showToast("Signup Successful! Please login.");
                    navigateToLogin(); // ✅ Now redirects to LoginActivity after signup
                })
                .addOnFailureListener(e -> {
                    showToast("Failed to store data: " + e.getMessage());
                    Log.e(TAG, "Database Error: ", e);
                });
    }

    private void handleSignupError(Exception exception) {
        if (exception instanceof FirebaseAuthUserCollisionException) {
            showToast("This email is already registered. Try logging in.");
        } else {
            showToast("Signup Failed: " + (exception != null ? exception.getMessage() : "Unknown error"));
        }
        Log.e(TAG, "Signup Error: ", exception);
    }

    private void navigateToLogin() {
        startActivity(new Intent(SignupActivity.this, LoginActivity.class));
        finish();
    }

    private void skipSignup() {
        startActivity(new Intent(SignupActivity.this, HomeActivity.class));
        finish();
    }

    private void showToast(String message) {
        Toast.makeText(SignupActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}

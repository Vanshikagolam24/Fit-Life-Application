package com.example.fit_life;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.FirebaseNetworkException;

public class LoginActivity extends AppCompatActivity {

    private EditText loginEmail, loginPassword;
    private Button loginButton;
    private TextView signupRedirectText, skipText;
    private FirebaseAuth mAuth;
    private static final String TAG = "LoginActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Initialize Firebase Auth
        mAuth = FirebaseAuth.getInstance();

        // Link UI components
        loginEmail = findViewById(R.id.login_username);
        loginPassword = findViewById(R.id.login_password);
        loginButton = findViewById(R.id.login_button);
        signupRedirectText = findViewById(R.id.signupRedirectText);
        skipText = findViewById(R.id.skip_text);

        // Button Listeners
        loginButton.setOnClickListener(view -> loginUser());
        signupRedirectText.setOnClickListener(view -> navigateToSignup());
        skipText.setOnClickListener(view -> skipLogin());
    }

    private void navigateToSignup() {
        startActivity(new Intent(LoginActivity.this, SignupActivity.class));
    }

    private void skipLogin() {
        startActivity(new Intent(LoginActivity.this, HomeActivity.class));
        finish();
    }

    private void loginUser() {
        String email = loginEmail.getText().toString().trim();
        String password = loginPassword.getText().toString().trim();

        // 🔥 Check for Internet Connection
        if (!isInternetAvailable()) {
            showToast("No Internet! Please check your connection.");
            return;
        }

        // 🔥 Validate Email & Password
        if (!validateInput(email, password)) return;

        // 🔥 Attempt Firebase Login
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        FirebaseUser user = mAuth.getCurrentUser();
                        if (user != null) {
                            Log.d(TAG, "Login successful: " + user.getEmail());
                            showToast("Login Successful!");
                            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
                            finish();
                        }
                    } else {
                        handleLoginError(task.getException());
                    }
                });
    }

    private boolean validateInput(String email, String password) {
        if (TextUtils.isEmpty(email)) {
            loginEmail.setError("Email is required");
            loginEmail.requestFocus();
            return false;
        }
        if (TextUtils.isEmpty(password)) {
            loginPassword.setError("Password is required");
            loginPassword.requestFocus();
            return false;
        }
        return true;
    }

    private void handleLoginError(Exception exception) {
        if (exception instanceof FirebaseNetworkException) {
            showToast("No Internet! Please check your connection.");
        } else if (exception instanceof FirebaseAuthInvalidUserException) {
            showToast("No account found with this email.");
            loginEmail.setError("No account found");
        } else if (exception instanceof FirebaseAuthInvalidCredentialsException) {
            showToast("Invalid password! Please try again.");
            loginPassword.setError("Wrong password");
        } else {
            showToast("Login Failed: " + exception.getMessage());
        }
        Log.e(TAG, "Login Error: ", exception);
    }

    private void showToast(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_SHORT).show();
    }

    // ✅ Improved Internet Check (Works on All Android Versions)
    private boolean isInternetAvailable() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                NetworkCapabilities capabilities = cm.getNetworkCapabilities(cm.getActiveNetwork());
                return capabilities != null &&
                        (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) ||
                                capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR));
            } else {
                NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
                return activeNetwork != null && activeNetwork.isConnected();
            }
        }
        return false;
    }
}

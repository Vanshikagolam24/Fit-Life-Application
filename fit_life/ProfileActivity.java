package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ProfileActivity extends AppCompatActivity {

    private TextView tvUserName, tvUserEmail;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;
    private static final String TAG = "ProfileActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        // Initialize UI Components
        tvUserName = findViewById(R.id.tv_user_name);
        tvUserEmail = findViewById(R.id.tv_user_email);
        LinearLayout btnSettings = findViewById(R.id.btnSettings);
        LinearLayout btnShareApp = findViewById(R.id.btnShareApp);
        LinearLayout btnAbout = findViewById(R.id.btnAbout);
        LinearLayout btnContactUs = findViewById(R.id.btnContactUs);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);

        // Initialize Firebase
        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference("Users");

        // Load user data
        loadUserData();

        // Button Actions
        btnSettings.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, SettingsActivity.class)));
        btnShareApp.setOnClickListener(v -> shareApp());
        btnAbout.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, AboutActivity.class)));
        btnContactUs.setOnClickListener(v -> startActivity(new Intent(ProfileActivity.this, ContactUsActivity.class)));

        // Bottom Navigation Actions
        bottomNavigationView.setSelectedItemId(R.id.nav_profile); // Highlight Profile tab

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            int id = item.getItemId();

            if (id == R.id.nav_home) {
                // Navigate to Home Activity
                startActivity(new Intent(ProfileActivity.this, HomeActivity.class));
                finish(); // Ensure ProfileActivity is finished
                return true;
            } else if (id == R.id.nav_water) {
                    startActivity(new Intent(this, WaterTrackerActivity.class));
                    finish();
                    return true;
            } else if (id == R.id.nav_profile) {
                return true; // Stay on Profile screen
            } else if (id == R.id.nav_tips) {
                startActivity(new Intent(ProfileActivity.this, TipsActivity.class));
                finish();
                return true;
            }
            return false;
        });
    }

    // Load User Data from Firebase
    private void loadUserData() {
        FirebaseUser currentUser = firebaseAuth.getCurrentUser();

        if (currentUser != null) {
            String userId = currentUser.getUid();
            String userEmail = currentUser.getEmail();
            tvUserEmail.setText(userEmail != null ? userEmail : "No Email Available");

            Log.d(TAG, "Fetching user data for UID: " + userId);

            databaseReference.child(userId).addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    if (snapshot.exists()) {
                        String name = snapshot.child("name").getValue(String.class);
                        if (name != null && !name.isEmpty()) {
                            tvUserName.setText(name); // Set the name in UI
                        } else {
                            tvUserName.setText("User Not Found"); // Handle missing name
                        }
                        Log.d(TAG, "User found: " + name);
                    } else {
                        tvUserName.setText("User Not Found");
                        Log.d(TAG, "User Not Found in Database");
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    tvUserName.setText("Error: " + error.getMessage());
                    Log.e(TAG, "Database Error: " + error.getMessage());
                    Toast.makeText(ProfileActivity.this, "Failed to load user data", Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            tvUserName.setText("Guest User");
            tvUserEmail.setText("Please sign in");
        }
    }

    // Share App Method
    private void shareApp() {
        String appPackageName = getPackageName();
        String shareMessage = "Check out this amazing app: https://play.google.com/store/apps/details?id=" + appPackageName;

        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
        startActivity(Intent.createChooser(shareIntent, "Share via"));
    }
}

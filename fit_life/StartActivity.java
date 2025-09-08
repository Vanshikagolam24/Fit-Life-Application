package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.button.MaterialButton; // ✅ Import MaterialButton

public class StartActivity extends AppCompatActivity {

    private static final String TAG = "StartActivity"; // Debugging tag

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start); // Load layout

        Log.d(TAG, "StartActivity launched"); // Debug log

        // MaterialButton
        MaterialButton btnStart = findViewById(R.id.btnStart);

        //click listener
        btnStart.setOnClickListener(v -> {
            try {
                Log.d(TAG, "Start button clicked, navigating to SignupActivity");

                // Navigate to SignupActivity
                Intent intent = new Intent(StartActivity.this, SignupActivity.class);
                startActivity(intent);

                // Apply animation for smooth transition
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                // Finish StartActivity so user can't go back
                finish();
            } catch (Exception e) {
                Log.e(TAG, "Error navigating to SignupActivity: " + e.getMessage());
            }
        });
    }

    // Handle the back button press
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finishAffinity(); // Close all activities
    }
}

package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME = 6000; // 6 seconds for splash screen

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Set the splash layout

        // Handler to transition to the next activity after a delay
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start StartActivity after splash screen
                Intent intent = new Intent(SplashActivity.this, StartActivity.class);
                startActivity(intent);
                finish(); // Finish SplashActivity to remove it from the back stack
            }
        }, SPLASH_TIME); // 6-second delay (can adjust this value as needed)
    }
}

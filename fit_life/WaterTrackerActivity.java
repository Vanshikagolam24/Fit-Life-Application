package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class WaterTrackerActivity extends AppCompatActivity {

    private CircularProgressView circularProgressView;
    private TextView mlText;
    private int currentMl = 0;
    private int goalMl = 1500;  // Default goal, can be changed by the user.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_tracker);

        // Setting up the toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Initializing the CircularProgressView and TextView
        circularProgressView = findViewById(R.id.circularProgressView);
        mlText = findViewById(R.id.mlText);

        // Initializing water intake buttons
        Button btn50ml = findViewById(R.id.btn50ml);
        Button btn100ml = findViewById(R.id.btn100ml);
        Button btn150ml = findViewById(R.id.btn150ml);
        Button btn250ml = findViewById(R.id.btn250ml);
        Button btn350ml = findViewById(R.id.btn350ml);
        Button btn500ml = findViewById(R.id.btn500ml);
        Button resetButton = findViewById(R.id.resetButton);

        // Setting onClickListeners for each water intake button
        btn50ml.setOnClickListener(v -> addWater(50));
        btn100ml.setOnClickListener(v -> addWater(100));
        btn150ml.setOnClickListener(v -> addWater(150));
        btn250ml.setOnClickListener(v -> addWater(250));
        btn350ml.setOnClickListener(v -> addWater(350));
        btn500ml.setOnClickListener(v -> addWater(500));

        // Reset button listener
        resetButton.setOnClickListener(v -> resetWater());

        // Bottom Navigation setup
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_water); // Highlight Water tab

        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            if (id == R.id.nav_home) {
                startActivity(new Intent(WaterTrackerActivity.this, HomeActivity.class));
                finish();
                return true;
            } else if (id == R.id.nav_tips) {
                startActivity(new Intent(WaterTrackerActivity.this, TipsActivity.class));
                finish();
                return true;
            } else if (id == R.id.nav_water) {
                return true; // Already on Water page
            } else if (id == R.id.nav_profile) {
                startActivity(new Intent(WaterTrackerActivity.this, ProfileActivity.class));
                finish();
                return true;
            }
            return false;
        });
    }

    // Method to add water intake
    private void addWater(int amount) {
        currentMl += amount;
        if (currentMl > goalMl) {
            currentMl = goalMl;
        }
        updateProgress();

        if (currentMl == goalMl) {
            Toast.makeText(this, "You completed your goal of 1500 ml!", Toast.LENGTH_LONG).show();
        }
    }

    // Method to reset the water intake
    private void resetWater() {
        currentMl = 0;
        updateProgress();
    }

    // Method to update the circular progress and display the current water intake
    private void updateProgress() {
        int percentage = (currentMl * 100) / goalMl;
        circularProgressView.setProgress(percentage);
        mlText.setText(currentMl + " ml");
    }
}


//package com.example.fit_life;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//
//public class WaterTrackerActivity extends AppCompatActivity {
//
//    private CircularProgressView circularProgressView;
//    private TextView mlText;
//    private int currentMl = 0;
//    private int goalMl = 1500;  // Default goal, can be changed by the user.
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_water_tracker);
//
//        // Setting up the toolbar
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // Initializing the CircularProgressView and TextView
//        circularProgressView = findViewById(R.id.circularProgressView);
//        mlText = findViewById(R.id.mlText);
//
//        // Initializing water intake buttons
//        Button btn50ml = findViewById(R.id.btn50ml);
//        Button btn100ml = findViewById(R.id.btn100ml);
//        Button btn150ml = findViewById(R.id.btn150ml);
//        Button btn250ml = findViewById(R.id.btn250ml);
//        Button btn350ml = findViewById(R.id.btn350ml);
//        Button btn500ml = findViewById(R.id.btn500ml);
//        Button resetButton = findViewById(R.id.resetButton);
//
//        // Setting onClickListeners for each water intake button
//        btn50ml.setOnClickListener(v -> addWater(50));   // Add 50ml
//        btn100ml.setOnClickListener(v -> addWater(100));  // Add 100ml
//        btn150ml.setOnClickListener(v -> addWater(150));  // Add 150ml
//        btn250ml.setOnClickListener(v -> addWater(250));  // Add 250ml
//        btn350ml.setOnClickListener(v -> addWater(350));  // Add 350ml
//        btn500ml.setOnClickListener(v -> addWater(500));  // Add 500ml
//
//        // Reset button listener to reset the progress
//        resetButton.setOnClickListener(v -> resetWater());
//
//        // Bottom Navigation
//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
//        bottomNavigationView.setSelectedItemId(R.id.nav_water); // Highlight Water page
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
//            int id = item.getItemId();
//            if (id == R.id.nav_home) {
//                startActivity(new Intent(WaterTrackerActivity.this, HomeActivity.class));
//                finish();
//                return true;
//            } else if (id == R.id.nav_tips) {
//                startActivity(new Intent(WaterTrackerActivity.this, ProfileActivity.class));
//                finish();
//                return true;
//            } else if (id == R.id.nav_water) {
//                startActivity(new Intent(WaterTrackerActivity.this, ProfileActivity.class));
//                finish();
//                return true;
//            } else if (id == R.id.nav_profile) {
//                return true; // Already on Water page
//            }
//            return false;
//        });
//    }
//
//    // Method to add water intake
//    private void addWater(int amount) {
//        currentMl += amount;
//        if (currentMl > goalMl) {
//            currentMl = goalMl; // Cap the current intake at the goal
//        }
//        updateProgress(); // Update the circular progress view and text
//
//        // Show Toast when the user completes the goal of 1500ml
//        if (currentMl == goalMl) {
//            Toast.makeText(this, "You completed your goal of 1500 ml!", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    // Method to reset the water intake
//    private void resetWater() {
//        currentMl = 0;
//        updateProgress();
//    }
//
//    // Method to update the circular progress and display the current water intake
//    private void updateProgress() {
//        int percentage = (currentMl * 100) / goalMl; // Calculate the progress percentage
//        circularProgressView.setProgress(percentage); // Update the circular progress view
//        mlText.setText(currentMl + " ml"); // Update the text to show the current intake
//    }
//}



//package com.example.fit_life;
//
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//
//public class WaterTrackerActivity extends AppCompatActivity {
//
//    private CircularProgressView circularProgressView;
//    private TextView mlText;
//    private int currentMl = 0;
//    private int goalMl = 1500;  // Default goal, can be changed by the user.
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_water_tracker);
//
//        // Setting up the toolbar
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        // Initializing the CircularProgressView and TextView
//        circularProgressView = findViewById(R.id.circularProgressView);
//        mlText = findViewById(R.id.mlText);
//
//        // Initializing water intake buttons
//        Button btn50ml = findViewById(R.id.btn50ml);
//        Button btn100ml = findViewById(R.id.btn100ml);
//        Button btn150ml = findViewById(R.id.btn150ml);
//        Button btn250ml = findViewById(R.id.btn250ml);
//        Button btn350ml = findViewById(R.id.btn350ml);
//        Button btn500ml = findViewById(R.id.btn500ml);
//        Button resetButton = findViewById(R.id.resetButton);
//
//        // Setting onClickListeners for each water intake button
//        btn50ml.setOnClickListener(v -> addWater(50));   // Add 50ml
//        btn100ml.setOnClickListener(v -> addWater(100));  // Add 100ml
//        btn150ml.setOnClickListener(v -> addWater(150));  // Add 150ml
//        btn250ml.setOnClickListener(v -> addWater(250));  // Add 250ml
//        btn350ml.setOnClickListener(v -> addWater(350));  // Add 350ml
//        btn500ml.setOnClickListener(v -> addWater(500));  // Add 500ml
//
//        // Reset button listener to reset the progress
//        resetButton.setOnClickListener(v -> resetWater());
//    }
//
//    // Method to add water intake
//    private void addWater(int amount) {
//        currentMl += amount;
//        if (currentMl > goalMl) {
//            currentMl = goalMl; // Cap the current intake at the goal
//        }
//        updateProgress(); // Update the circular progress view and text
//
//        // Show Toast when the user completes the goal of 1500ml
//        if (currentMl == goalMl) {
//            Toast.makeText(this, " You completed your goal of 1500 ml!", Toast.LENGTH_LONG).show();
//        }
//    }
//
//    // Method to reset the water intake
//    private void resetWater() {
//        currentMl = 0; // Reset the water intake to 0
//        updateProgress(); // Update the circular progress view and text
//    }
//
//    // Method to update the circular progress and display the current water intake
//    private void updateProgress() {
//        int percentage = (currentMl * 100) / goalMl; // Calculate the progress percentage
//        circularProgressView.setProgress(percentage); // Update the circular progress view
//        mlText.setText(currentMl + " ml"); // Update the text to show the current intake
//    }
//}
//

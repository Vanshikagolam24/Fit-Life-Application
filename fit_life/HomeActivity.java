package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.ImageButton;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    private ImageButton btnExercise, btnYoga, btnBMI, btnDietPlan, btnStepCounter;
    private ViewFlipper viewFlipper;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Bottom Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setSelectedItemId(R.id.nav_home);


        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                if (itemId == R.id.nav_profile) {
                    startActivity(new Intent(HomeActivity.this, ProfileActivity.class));
                    finish();
                    return true;
                } else if (itemId == R.id.nav_water) {
                    startActivity(new Intent(HomeActivity.this, WaterTrackerActivity.class));
                    finish();
                    return true;
                } else if (itemId == R.id.nav_tips) {
                    startActivity(new Intent(HomeActivity.this, TipsActivity.class));
                    finish();
                    return true;
                }

                return true; // default true to keep Home active
            }
        });

        // Initialize buttons
        btnYoga = findViewById(R.id.btnYoga);
        btnExercise = findViewById(R.id.exerciseButton);
        btnBMI = findViewById(R.id.btnBMI);
        btnDietPlan = findViewById(R.id.btnDietPlan);
        btnStepCounter = findViewById(R.id.btnStepCounter);

        // Set click listeners
        btnYoga.setOnClickListener(v -> openActivity(YogaActivity.class));
        btnExercise.setOnClickListener(v -> openActivity(ExerciseActivity.class));
        btnBMI.setOnClickListener(v -> openActivity(BMICalculatorActivity.class));
        btnDietPlan.setOnClickListener(v -> openActivity(DietPlanActivity.class));
        btnStepCounter.setOnClickListener(v -> openActivity(StepCounterActivity.class));

        // ViewFlipper
        viewFlipper = findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(5000);
        viewFlipper.startFlipping();

        gestureDetector = new GestureDetector(this, new GestureDetector.SimpleOnGestureListener() {
            @Override
            public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
                if (e1.getX() > e2.getX()) {
                    viewFlipper.showNext(); // Swipe left
                } else {
                    viewFlipper.showPrevious(); // Swipe right
                }
                return true;
            }
        });
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return gestureDetector.onTouchEvent(event);
    }

    private void openActivity(Class<?> activityClass) {
        startActivity(new Intent(HomeActivity.this, activityClass));
    }
}



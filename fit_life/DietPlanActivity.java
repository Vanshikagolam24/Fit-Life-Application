package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;

public class DietPlanActivity extends AppCompatActivity {
    private ImageButton btnWeightLoss, btnMuscleGain, btnHealthyDiet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);

        Log.d("DietPlanActivity", "Diet Plan Activity Opened");

        // Initialize buttons as ImageButton
        btnWeightLoss = findViewById(R.id.btnWeightLoss);
        btnMuscleGain = findViewById(R.id.btnMuscleGain);
        btnHealthyDiet = findViewById(R.id.btnHealthyDiet);

        // Set click listeners
        btnWeightLoss.setOnClickListener(v -> openActivity(WeightLossActivity.class, "weight_loss"));
        btnMuscleGain.setOnClickListener(v -> openActivity(MuscleGainActivity.class, "muscle_gain"));
        btnHealthyDiet.setOnClickListener(v -> openActivity(HealthyDietActivity.class, "healthy_diet"));
    }

    private void openActivity(Class<?> activityClass, String category) {
        Intent intent = new Intent(this, activityClass);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}



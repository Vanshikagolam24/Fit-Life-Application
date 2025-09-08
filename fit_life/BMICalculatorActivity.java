package com.example.fit_life;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class BMICalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bmicalculator);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Show back arrow
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        EditText editTextWeight = findViewById(R.id.weight);
        EditText editTextHeight = findViewById(R.id.height);
        Button button = findViewById(R.id.btnSubmit);
        TextView textView = findViewById(R.id.result);
        TextView dietSuggestion = findViewById(R.id.diet_suggestion); // New TextView for Diet Suggestion

        button.setOnClickListener(v -> {
            try {
                float height = Float.parseFloat(editTextHeight.getText().toString()) / 100; // Convert cm to meters
                float weight = Float.parseFloat(editTextWeight.getText().toString());
                float bmi = weight / (height * height); // BMI Formula

                // Determine BMI Category
                String category;
                String dietAdvice;
                int color;

                if (bmi < 18.5) {
                    category = "[Underweight]";
                    dietAdvice = "You need a Muscle Gain Diet.";
                    color = Color.BLACK;
                } else if (bmi >= 18.5 && bmi < 24.9) {
                    category = "[Normal Weight]";
                    dietAdvice = "You need a Healthy Diet.";
                    color = Color.BLACK;
                } else if (bmi >= 25 && bmi < 29.9) {
                    category = "[Overweight]";
                    dietAdvice = "You need a Weight Loss Diet.";
                    color = Color.BLACK;
                } else {
                    category = "[Obesity]";
                    dietAdvice = "You need a Proper Health Consultation.";
                    color = Color.BLACK;
                }

                // Update Result Text & Color
                textView.setText(String.format("BMI: %.2f\n%s", bmi, category));
                textView.setTextColor(color);

                // Show Diet Suggestion
                dietSuggestion.setText(dietAdvice);
                dietSuggestion.setTextColor(Color.BLACK);
                dietSuggestion.setVisibility(View.VISIBLE); // Make it visible

                // Log Values (Debugging)
                Log.d("BMI_DEBUG", "Height: " + height + " Weight: " + weight + " BMI: " + bmi + " Category: " + category);

            } catch (Exception e) {
                textView.setText("Please enter valid values!");
                textView.setTextColor(Color.BLACK);
                dietSuggestion.setVisibility(View.GONE); // Hide diet suggestion if invalid input
                Log.e("BMI_ERROR", "Invalid input: " + e.getMessage());
            }
        });
    }
}

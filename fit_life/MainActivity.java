package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    // Firebase Database reference
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure the correct layout file

        // Initialize Firebase
        try {
            FirebaseApp.initializeApp(this);
        } catch (Exception e) {
            Log.e("FirebaseError", "Firebase initialization failed", e);
        }

        // Initialize Firebase Realtime Database
        try {
            database = FirebaseDatabase.getInstance().getReference();
            database.child("testMessage").setValue("Hello, Firebase!")
                    .addOnSuccessListener(aVoid -> Log.d("Firebase", "Data written successfully"))
                    .addOnFailureListener(e -> Log.e("Firebase", "Error writing data", e));
        } catch (Exception e) {
            Log.e("FirebaseError", "Firebase Database initialization failed", e);
        }

        // Initialize buttons and set click listeners
        setupButton(R.id.btnYoga, YogaActivity.class);
        setupButton(R.id.exerciseButton, ExerciseActivity.class);
        setupButton(R.id.btnBMI, BMICalculatorActivity.class);
        setupButton(R.id.btnDietPlan, DietPlanActivity.class);
    }

    // Helper method to set up button click listeners
    private void setupButton(int buttonId, Class<?> activityClass) {
        Button button = findViewById(buttonId);
        if (button != null) {
            button.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, activityClass)));
        } else {
            Log.e("ButtonError", "Button is null: " + activityClass.getSimpleName());
        }
    }
}

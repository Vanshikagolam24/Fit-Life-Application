package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
//import android.widget.CardView;
import androidx.cardview.widget.CardView;
import androidx.appcompat.app.AppCompatActivity;

public class MuscleGainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_gain);

        Log.d("MuscleGainActivity", "MuscleGainActivity opened");

        // Find meal cards
        CardView cardBreakfast = findViewById(R.id.cardBreakfast);
        CardView cardLunch = findViewById(R.id.cardLunch);
        CardView cardDinner = findViewById(R.id.cardDinner);
        CardView cardSnacks = findViewById(R.id.cardSnacks);

        // Set click listeners
        cardBreakfast.setOnClickListener(v -> openRecipeDetail("Breakfast"));
        cardLunch.setOnClickListener(v -> openRecipeDetail("Lunch"));
        cardDinner.setOnClickListener(v -> openRecipeDetail("Dinner"));
        cardSnacks.setOnClickListener(v -> openRecipeDetail("Snacks"));
    }

    private void openRecipeDetail(String mealType) {
        Intent intent = new Intent(MuscleGainActivity.this, RecipeDetailActivity.class);
        intent.putExtra("mealType", mealType);  // Sending meal type
        intent.putExtra("category", "muscle_gain");  // Adding category
        startActivity(intent);
    }

}


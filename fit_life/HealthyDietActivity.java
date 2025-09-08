package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
//import android.widget.CardView;
import androidx.cardview.widget.CardView;
import androidx.appcompat.app.AppCompatActivity;

public class HealthyDietActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_diet);

        // Find meal cards
        CardView cardBreakfast = findViewById(R.id.cardBreakfast);
        CardView cardLunch = findViewById(R.id.cardLunch);
        CardView cardDinner = findViewById(R.id.cardDinner);
        CardView cardSnacks = findViewById(R.id.cardSnacks);

        // Set click listeners (Make sure "healthy_diet" is passed)
        cardBreakfast.setOnClickListener(v -> openRecipeDetail("Breakfast", "healthy_diet"));
        cardLunch.setOnClickListener(v -> openRecipeDetail("Lunch", "healthy_diet"));
        cardDinner.setOnClickListener(v -> openRecipeDetail("Dinner", "healthy_diet"));
        cardSnacks.setOnClickListener(v -> openRecipeDetail("Snacks", "healthy_diet"));
    }

    private void openRecipeDetail(String mealType, String category) {
        Intent intent = new Intent(HealthyDietActivity.this, RecipeDetailActivity.class);
        intent.putExtra("mealType", mealType);
        intent.putExtra("category", category);
        startActivity(intent);
    }
}

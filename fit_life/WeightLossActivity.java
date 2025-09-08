package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class WeightLossActivity extends AppCompatActivity {
    private CardView cardBreakfast, cardLunch, cardDinner, cardSnacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_loss);

        Log.d("WeightLossActivity", "WeightLossActivity opened");

        // Initialize cards
        cardBreakfast = findViewById(R.id.cardBreakfast);
        cardLunch = findViewById(R.id.cardLunch);
        cardDinner = findViewById(R.id.cardDinner);
        cardSnacks = findViewById(R.id.cardSnacks);

        // Set click listeners
        cardBreakfast.setOnClickListener(v -> openRecipeDetail("Breakfast"));
        cardLunch.setOnClickListener(v -> openRecipeDetail("Lunch"));
        cardDinner.setOnClickListener(v -> openRecipeDetail("Dinner"));
        cardSnacks.setOnClickListener(v -> openRecipeDetail("Snacks"));
    }

    private void openRecipeDetail(String mealType) {
        Intent intent = new Intent(WeightLossActivity.this, RecipeDetailActivity.class);
        intent.putExtra("mealType", mealType);
        startActivity(intent);
    }
}

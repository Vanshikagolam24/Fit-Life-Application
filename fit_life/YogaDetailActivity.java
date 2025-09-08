package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class YogaDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_detail);

        // Get references to UI components
        TextView yogaName = findViewById(R.id.yogaName);
        ImageView yogaImage = findViewById(R.id.yogaImage);
        TextView yogaDescription = findViewById(R.id.yogaDescription);

        // Get data from intent
        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("name") && intent.hasExtra("image") && intent.hasExtra("description")) {
            yogaName.setText(intent.getStringExtra("name"));
            yogaImage.setImageResource(intent.getIntExtra("image", R.drawable.default_image)); // Set default if no image
            yogaDescription.setText(intent.getStringExtra("description"));
        }
    }
}

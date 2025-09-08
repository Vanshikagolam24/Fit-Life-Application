//package com.example.fit_life;
//
//import android.os.Bundle;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.appcompat.app.AppCompatActivity;
//
//public class ExerciseDetailActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_exercise_detail); // Make sure this layout exists
//
//        // Get references to UI elements
//        ImageView imageView = findViewById(R.id.imageView);
//        TextView textViewName = findViewById(R.id.textViewName);
//        TextView textViewDesc = findViewById(R.id.textViewDesc);
//
//        // Get data from Intent
//        String name = getIntent().getStringExtra("name");
//        String description = getIntent().getStringExtra("description");
//        int imageResId = getIntent().getIntExtra("image", -1);
//
//        // Set data to UI elements
//        textViewName.setText(name);
//        textViewDesc.setText(description);
//        if (imageResId != -1) {
//            imageView.setImageResource(imageResId);
//        }
//    }
//}
package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ExerciseDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise_detail);

        ImageView exerciseImage = findViewById(R.id.exerciseImageDetail);
        TextView exerciseName = findViewById(R.id.exerciseNameDetail);
        TextView exerciseDescription = findViewById(R.id.exerciseFullDescription);

        Intent intent = getIntent();
        if (intent != null) {
            exerciseName.setText(intent.getStringExtra("exerciseName"));
            exerciseDescription.setText(intent.getStringExtra("exerciseDescription"));
            exerciseImage.setImageResource(intent.getIntExtra("exerciseImage", R.drawable.default_image));
        }
    }
}

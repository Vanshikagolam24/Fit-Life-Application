//package com.example.fit_life;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.util.Log;
//import android.widget.ImageView;
//import android.widget.TextView;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import java.util.HashMap;
//import java.util.Map;
//
//public class RecipeDetailActivity extends AppCompatActivity {
//
//    private static final String TAG = "RecipeDetailActivity"; // Debugging Tag
//
//    private ImageView recipeImage;
//    private TextView mealTitle, mealDescription;
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recipe_detail);
//
//        // Initialize UI elements
//        recipeImage = findViewById(R.id.recipeImage);
//        mealTitle = findViewById(R.id.mealTitle);
//        mealDescription = findViewById(R.id.mealDescription);
//
//        // Get data from Intent safely
//        Intent intent = getIntent();
//        String mealType = intent.getStringExtra("mealType");
//        String category = intent.getStringExtra("category");
//
//        // Debugging Logs
//        Log.d(TAG, "Received mealType: " + mealType);
//        Log.d(TAG, "Received category: " + category);
//
//        // Handle missing values
//        if (mealType == null || mealType.trim().isEmpty()) mealType = "snacks"; // Default
//        if (category == null || category.trim().isEmpty()) category = "healthy_diet"; // Default
//
//        // Normalize values
//        mealType = mealType.trim().toLowerCase();
//        category = category.trim().toLowerCase();
//
//        // Set Meal Title
//        mealTitle.setText(capitalizeFirstLetter(mealType));
//
//        // Get Image & Description based on category and mealType
//        int imageResId = getMealImage(category, mealType);
//        String description = getMealDescription(category, mealType);
//
//        // Update UI
//        recipeImage.setImageResource(imageResId);
//        mealDescription.setText(description);
//
//        // Debugging Logs
//        Log.d(TAG, "Final Image Resource ID: " + imageResId);
//        Log.d(TAG, "Final Description: " + description);
//    }
//
//    // Capitalize the first letter of a string
//    private String capitalizeFirstLetter(String text) {
//        if (text == null || text.isEmpty()) return "";
//        return text.substring(0, 1).toUpperCase() + text.substring(1);
//    }
//
//    // 🔹 Method to get the correct image resource
//    private int getMealImage(String category, String mealType) {
//        Map<String, Integer> weightLossImages = new HashMap<>();
//        weightLossImages.put("breakfast", R.drawable.breakfastweight);
//        weightLossImages.put("lunch", R.drawable.lunchweight);
//        weightLossImages.put("dinner", R.drawable.dinnerweight);
//        weightLossImages.put("snacks", R.drawable.snacksweight);
//
//        Map<String, Integer> muscleGainImages = new HashMap<>();
//        muscleGainImages.put("breakfast", R.drawable.breakfastmuscle);
//        muscleGainImages.put("lunch", R.drawable.lunchmuscle);
//        muscleGainImages.put("dinner", R.drawable.dinnermuscle);
//        muscleGainImages.put("snacks", R.drawable.snacksmuscle);
//
//        Map<String, Integer> healthyDietImages = new HashMap<>();
//        healthyDietImages.put("breakfast", R.drawable.breakfasthealthy);
//        healthyDietImages.put("lunch", R.drawable.lunchhealthy);
//        healthyDietImages.put("dinner", R.drawable.dinnerhealthy);
//        healthyDietImages.put("snacks", R.drawable.snackshealthy);
//
//        switch (category) {
//            case "weight_loss":
//                return weightLossImages.getOrDefault(mealType, R.drawable.default_image);
//            case "muscle_gain":
//                return muscleGainImages.getOrDefault(mealType, R.drawable.default_image);
//            case "healthy_diet":
//                return healthyDietImages.getOrDefault(mealType, R.drawable.default_image);
//            default:
//                Log.e(TAG, "Unknown category received: " + category);
//                return R.drawable.default_image;
//        }
//    }
//
//    // 🔹 Method to get the correct description
//    private String getMealDescription(String category, String mealType) {
//        Map<String, String> weightLossDescriptions = new HashMap<>();
//        weightLossDescriptions.put("breakfast", "Low-calorie breakfast for weight loss.");
//        weightLossDescriptions.put("lunch", "Healthy lunch for weight management.");
//        weightLossDescriptions.put("dinner", "Light dinner for weight control.");
//        weightLossDescriptions.put("snacks", "Healthy weight-loss-friendly snacks.");
//
//        Map<String, String> muscleGainDescriptions = new HashMap<>();
//        muscleGainDescriptions.put("breakfast", "High protein breakfast for muscle gain.");
//        muscleGainDescriptions.put("lunch", "Nutritious lunch for muscle building.");
//        muscleGainDescriptions.put("dinner", "Balanced dinner rich in protein.");
//        muscleGainDescriptions.put("snacks", "Healthy snacks to fuel muscle growth.");
//
//        Map<String, String> healthyDietDescriptions = new HashMap<>();
//        healthyDietDescriptions.put("breakfast", "A balanced and nutritious breakfast.");
//        healthyDietDescriptions.put("lunch", "A wholesome meal full of vitamins.");
//        healthyDietDescriptions.put("dinner", "A light yet fulfilling dinner.");
//        healthyDietDescriptions.put("snacks", "Nutritious and healthy snack options.");
//
//        switch (category) {
//            case "weight_loss":
//                return weightLossDescriptions.getOrDefault(mealType, "No details available.");
//            case "muscle_gain":
//                return muscleGainDescriptions.getOrDefault(mealType, "No details available.");
//            case "healthy_diet":
//                return healthyDietDescriptions.getOrDefault(mealType, "No details available.");
//            default:
//                Log.e(TAG, "Unknown category received: " + category);
//                return "No details available.";
//        }
//    }
//}
package com.example.fit_life;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.HashMap;
import java.util.Map;
import android.text.method.ScrollingMovementMethod;

public class RecipeDetailActivity extends AppCompatActivity {

    private static final String TAG = "RecipeDetailActivity"; // Debugging Tag

    private ImageView recipeImage;
    private TextView mealTitle, mealDescription, mealSteps;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);

        // Initialize UI elements
        recipeImage = findViewById(R.id.recipeImage);
        mealTitle = findViewById(R.id.mealTitle);
        mealDescription = findViewById(R.id.mealDescription);
        mealSteps = findViewById(R.id.mealSteps);  // Initialize Steps TextView


        // Get data from Intent
        Intent intent = getIntent();
        String mealType = intent.getStringExtra("mealType");
        String category = intent.getStringExtra("category");

        mealDescription.setMovementMethod(new ScrollingMovementMethod());
        mealSteps.setMovementMethod(new ScrollingMovementMethod());

        // Debugging Logs
        Log.d(TAG, "Received mealType: " + mealType);
        Log.d(TAG, "Received category: " + category);

        // Handle null or empty values
        if (mealType == null || mealType.trim().isEmpty()) mealType = "snacks"; // Default
        if (category == null || category.trim().isEmpty()) category = "healthy_diet"; // Default

        // Normalize values
        mealType = mealType.trim().toLowerCase();
        category = category.trim().toLowerCase();

        // Set Meal Title
        mealTitle.setText(capitalizeFirstLetter(mealType));

        // Set Image, Description, and Steps
        recipeImage.setImageResource(getMealImage(category, mealType));
        mealDescription.setText(getMealDescription(category, mealType));
        mealSteps.setText(getMealSteps(category, mealType));  // Set Steps

        // Debugging Logs
        Log.d(TAG, "Final Description: " + getMealDescription(category, mealType));
        Log.d(TAG, "Final Steps: " + getMealSteps(category, mealType));
    }

    // Capitalize the first letter of a string
    private String capitalizeFirstLetter(String text) {
        if (text == null || text.isEmpty()) return "";
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    // 🔹 Method to get the correct image resource
    private int getMealImage(String category, String mealType) {
        Map<String, Integer> images = new HashMap<>();

        // Weight Loss Images
        if (category.equals("weight_loss")) {
            images.put("breakfast", R.drawable.breakfastweight);
            images.put("lunch", R.drawable.lunchweight);
            images.put("dinner", R.drawable.dinnerweight);
            images.put("snacks", R.drawable.snacksweight);
        }
        // Muscle Gain Images
        else if (category.equals("muscle_gain")) {
            images.put("breakfast", R.drawable.breakfastmuscle);
            images.put("lunch", R.drawable.lunchmuscle);
            images.put("dinner", R.drawable.dinnermuscle);
            images.put("snacks", R.drawable.snacksmuscle);
        }
        // Healthy Diet Images
        else {
            images.put("breakfast", R.drawable.breakfasthealthy);
            images.put("lunch", R.drawable.lunchhealthy);
            images.put("dinner", R.drawable.dinnerhealthy);
            images.put("snacks", R.drawable.snackshealthy);
        }

        return images.getOrDefault(mealType, R.drawable.default_image);
    }

    // 🔹 Method to get the correct description
    private String getMealDescription(String category, String mealType) {
        Map<String, String> descriptions = new HashMap<>();

        // Weight Loss Descriptions
        if (category.equals("weight_loss")) {
            descriptions.put("breakfast", "Low-calorie breakfast for weight loss.");
            descriptions.put("lunch", "Healthy lunch for weight management.");
            descriptions.put("dinner", "Light dinner for weight control.");
            descriptions.put("snacks", "Healthy weight-loss-friendly snacks.");
        }
        // Muscle Gain Descriptions
        else if (category.equals("muscle_gain")) {
            descriptions.put("breakfast", "High protein breakfast for muscle gain.");
            descriptions.put("lunch", "Nutritious lunch for muscle building.");
            descriptions.put("dinner", "Balanced dinner rich in protein.");
            descriptions.put("snacks", "Healthy snacks to fuel muscle growth.");
        }
        // Healthy Diet Descriptions
        else {
            descriptions.put("breakfast", "A balanced and nutritious breakfast.");
            descriptions.put("lunch", "A wholesome meal full of vitamins.");
            descriptions.put("dinner", "A light yet fulfilling dinner.");
            descriptions.put("snacks", "Nutritious and healthy snack options.");
        }

        return descriptions.getOrDefault(mealType, "No details available.");
    }

    // 🔹 Method to get Cooking Steps
    private String getMealSteps(String category, String mealType) {
        Map<String, String> steps = new HashMap<>();

        // Weight Loss Steps
        if (category.equals("weight_loss")) {
            steps.put("breakfast", "\uD83C\uDF7D\uFE0F Meal: Oatmeal with Chia Seeds, Boiled Eggs & Green Smoothie\n" +
                    "\uD83D\uDCCC Category: Weight Loss\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "\n" +
                    "Start your day with a nutritious and fiber-rich meal! This weight-loss-friendly breakfast includes oatmeal with chia seeds for sustained energy, boiled eggs for protein, and a refreshing green smoothie packed with vitamins. It helps in boosting metabolism and keeping you full for longer.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83E\uDD63 Oatmeal with Chia Seeds:\n" +
                    "✔ ½ cup rolled oats\n" +
                    "✔ 1 tbsp chia seeds\n" +
                    "✔ 1 cup almond milk (or water)\n" +
                    "✔ 1 tsp honey (optional)\n" +
                    "✔ Fresh fruits (banana, berries, etc.)\n" +
                    "\n" +
                    "\uD83E\uDD5A Boiled Eggs:\n" +
                    "✔ 2 eggs\n" +
                    "✔ A pinch of salt & pepper\n" +
                    "\n" +
                    "\uD83E\uDD6C Green Smoothie:\n" +
                    "✔ 1 cup spinach/kale\n" +
                    "✔ ½ banana\n" +
                    "✔ ½ cup Greek yogurt\n" +
                    "✔ ½ cup water or almond milk\n" +
                    "✔ 1 tsp flaxseeds\n" +
                    "\n" +
                    "\uD83C\uDF73 Cooking Steps\n" +
                    "\uD83E\uDD63 Oatmeal with Chia Seeds:\n" +
                    "1\uFE0F⃣ Heat almond milk in a saucepan.\n" +
                    "2\uFE0F⃣ Add rolled oats and cook for 5 minutes.\n" +
                    "3\uFE0F⃣ Stir in chia seeds and let it thicken.\n" +
                    "4\uFE0F⃣ Top with fresh fruits and honey (optional).\n" +
                    "\n" +
                    "\uD83E\uDD5A Boiled Eggs:\n" +
                    "1\uFE0F⃣ Place eggs in a saucepan with water.\n" +
                    "2\uFE0F⃣ Boil for 10 minutes, then transfer to cold water.\n" +
                    "3\uFE0F⃣ Peel, sprinkle with salt & pepper, and serve.\n" +
                    "\n" +
                    "\uD83E\uDD6C Green Smoothie:\n" +
                    "1\uFE0F⃣ Add spinach/kale, banana, Greek yogurt, and flaxseeds to a blender.\n" +
                    "2\uFE0F⃣ Pour in water or almond milk and blend until smooth.\n" +
                    "3\uFE0F⃣ Serve fresh and enjoy!\n" +
                    "\n" +
                    "✅ Health Benefits\n" +
                    "✔ Oatmeal with chia seeds = High in fiber, keeps you full longer\n" +
                    "✔ Boiled eggs = Protein-packed for muscle maintenance\n" +
                    "✔ Green smoothie = Rich in vitamins & antioxidants");

            steps.put("lunch", ":\n" +
                    "\uD83C\uDF7D\uFE0F Meal: \"Grilled Chicken & Steamed Veggies, Quinoa/Brown Rice, and Mixed Salad\"\n" +
                    "\uD83D\uDCCC Category: Weight Loss\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "\n" +
                    "This high-protein, fiber-rich, and nutrient-packed meal is perfect for muscle growth, weight management, and overall health. The grilled chicken is lean and packed with protein, the steamed veggies provide essential vitamins, quinoa or brown rice adds complex carbohydrates for sustained energy, and the mixed salad enhances digestion and hydration.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83C\uDF57 Grilled Chicken & Steamed Veggies\n" +
                    "✔ 1 boneless, skinless chicken breast\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ ½ tsp salt & black pepper\n" +
                    "✔ ½ tsp garlic powder\n" +
                    "✔ ½ tsp paprika\n" +
                    "✔ ½ lemon (for fresh juice)\n" +
                    "✔ Mixed veggies (broccoli, carrots, zucchini, bell peppers, etc.)\n" +
                    "\n" +
                    "\uD83C\uDF5A Quinoa or Brown Rice\n" +
                    "✔ ½ cup quinoa or brown rice\n" +
                    "✔ 1 cup water or vegetable broth\n" +
                    "✔ ½ tsp salt\n" +
                    "\n" +
                    "\uD83E\uDD57 Mixed Salad\n" +
                    "✔ 1 cup leafy greens (lettuce, spinach, or kale)\n" +
                    "✔ ½ cucumber (sliced)\n" +
                    "✔ ½ tomato (chopped)\n" +
                    "✔ ¼ avocado (sliced)\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ 1 tbsp lemon juice or balsamic vinegar\n" +
                    "✔ Salt & pepper to taste\n" +
                    "\n" +
                    "\uD83C\uDF73 Cooking Steps\n" +
                    "1\uFE0F⃣ Grill the Chicken – Season the chicken breast with olive oil, salt, pepper, garlic powder, and paprika. Grill on medium heat for 5–7 minutes per side until fully cooked. Squeeze fresh lemon juice over it before serving.\n" +
                    "2\uFE0F⃣ Steam the Veggies – Steam the mixed vegetables for 5–7 minutes until tender but still slightly crunchy.\n" +
                    "3\uFE0F⃣ Cook Quinoa/Brown Rice – Rinse quinoa or brown rice, then cook in boiling water (or broth) for 15–20 minutes until soft and fluffy.\n" +
                    "4\uFE0F⃣ Prepare Mixed Salad – Toss all salad ingredients together in a bowl and drizzle with olive oil and lemon juice for freshness.\n" +
                    "\n" +
                    "✅ Health Benefits\n" +
                    "\n" +
                    "✔ Grilled Chicken = Lean protein for muscle repair and strength\n" +
                    "✔ Steamed Veggies = Packed with fiber, antioxidants, and vitamins\n" +
                    "✔ Quinoa/Brown Rice = Complex carbs for sustained energy and digestion\n" +
                    "✔ Mixed Salad = Hydrating, rich in fiber, and promotes gut health\n" +
                    "\n" +
                    "This meal is simple, delicious, and perfect for a balanced diet! Let me know if you need any variations. \uD83D\uDE80\uD83C\uDF57\uD83E\uDD66\uD83C\uDF5A\uD83E\uDD57\n"
                     );


            steps.put("dinner", "\uD83C\uDF7D\uFE0F Meal: \"Grilled Salmon with Veggies, Lentil Soup & Herbal Tea\"\n" +
                    "\uD83D\uDCCC Category: Weight Loss\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This nutrient-dense meal combines perfectly grilled salmon with a side of roasted or steamed veggies, a warm bowl of protein-packed lentil soup, and a soothing cup of herbal tea. It’s a well-balanced meal that promotes muscle recovery, heart health, digestion, and overall well-being.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83E\uDD69 Grilled Salmon with Veggies\n" +
                    "✔ 1 salmon fillet\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ ½ tsp salt & black pepper\n" +
                    "✔ ½ tsp garlic powder\n" +
                    "✔ ½ tsp paprika\n" +
                    "✔ ½ lemon (for fresh juice)\n" +
                    "✔ Assorted veggies (broccoli, bell peppers, zucchini, carrots, etc.)\n" +
                    "\n" +
                    "\uD83E\uDD63 Lentil Soup\n" +
                    "✔ ½ cup lentils (red or green)\n" +
                    "✔ 1 small onion (chopped)\n" +
                    "✔ 1 tomato (chopped)\n" +
                    "✔ 2 garlic cloves (minced)\n" +
                    "✔ ½ tsp cumin & turmeric\n" +
                    "✔ 2 cups vegetable broth or water\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ Salt & pepper to taste\n" +
                    "\n" +
                    "\uD83C\uDF75 Herbal Tea\n" +
                    "✔ 1 herbal tea bag (chamomile, peppermint, or green tea)\n" +
                    "✔ 1 cup hot water\n" +
                    "✔ 1 tsp honey (optional)\n" +
                    "\n" +
                    "\uD83C\uDF73 Cooking Steps\n" +
                    "1\uFE0F⃣ Grill the Salmon – Season the salmon fillet with olive oil, salt, pepper, garlic powder, and paprika. Grill on medium heat for 4–5 minutes per side until golden brown. Squeeze fresh lemon juice over it before serving.\n" +
                    "2\uFE0F⃣ Prepare the Veggies – Steam or sauté the mixed vegetables with a little olive oil, salt, and pepper for 5–7 minutes until tender.\n" +
                    "3\uFE0F⃣ Cook Lentil Soup – Heat oil in a pot, sauté onions and garlic, add tomatoes and spices, then add lentils and broth. Simmer for 20–25 minutes until lentils are soft.\n" +
                    "4\uFE0F⃣ Make Herbal Tea – Steep the herbal tea bag in hot water for 5 minutes, add honey if desired, and enjoy!\n" +
                    "\n" +
                    "✅ Health Benefits\n" +
                    "✔ Salmon = Rich in Omega-3s for brain & heart health\n" +
                    "✔ Veggies = High in fiber, vitamins & antioxidants\n" +
                    "✔ Lentils = Excellent plant-based protein & iron source\n" +
                    "✔ Herbal Tea = Aids digestion and relaxation\n" +
                    "\n" +
                    "This meal is flavorful, nutritious, and perfect for a balanced diet! Let me know if you need any variations. \uD83D\uDE80\uD83C\uDF63\uD83E\uDD57\uD83C\uDF75");

            steps.put("snacks", "\uD83C\uDF7D\uFE0F Meal: \"Greek Yogurt with Nuts, Protein Smoothie, and Cucumber with Hummus\"\n" +
                    "\uD83D\uDCCC Category: Weight Loss\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This high-protein, nutrient-dense meal is perfect for muscle recovery, energy boost, and weight management. The Greek yogurt with nuts provides a protein-packed, probiotic-rich start to the day, the protein smoothie fuels your body with essential nutrients, and cucumber with hummus adds fiber and hydration, making it a light yet filling meal.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83E\uDD63 Greek Yogurt with Nuts\n" +
                    "✔ ½ cup Greek yogurt (plain, unsweetened)\n" +
                    "✔ 1 tbsp mixed nuts (almonds, walnuts, cashews)\n" +
                    "✔ ½ tsp honey (optional)\n" +
                    "✔ ¼ tsp cinnamon (for extra flavor)\n" +
                    "\n" +
                    "\uD83E\uDD64 Protein Smoothie\n" +
                    "✔ 1 scoop protein powder (vanilla/chocolate)\n" +
                    "✔ 1 banana (for natural sweetness & energy)\n" +
                    "✔ 1 cup almond milk or regular milk\n" +
                    "✔ ½ cup spinach or kale (optional for added nutrients)\n" +
                    "✔ 1 tbsp peanut butter (optional for healthy fats)\n" +
                    "✔ Ice cubes (as needed)\n" +
                    "\n" +
                    "\uD83E\uDD52 Cucumber with Hummus\n" +
                    "✔ ½ cucumber (sliced into sticks)\n" +
                    "✔ 2 tbsp hummus (classic or flavored)\n" +
                    "✔ ¼ tsp black pepper or paprika (for extra taste)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Prepare Greek Yogurt Bowl – Add Greek yogurt to a bowl, sprinkle with mixed nuts, drizzle with honey, and add cinnamon for flavor.\n" +
                    "2\uFE0F⃣ Blend Protein Smoothie – Blend protein powder, banana, milk, spinach/kale, and peanut butter (if using) until smooth. Pour into a glass and serve.\n" +
                    "3\uFE0F⃣ Serve Cucumber & Hummus – Slice cucumber into sticks and serve with hummus for dipping.\n" +
                    "\n" +
                    "✅ Health Benefits\n" +
                    "✔ Greek Yogurt = High in protein & probiotics for gut health\n" +
                    "✔ Nuts = Healthy fats & antioxidants for brain function\n" +
                    "✔ Protein Smoothie = Builds muscle, provides energy & essential nutrients\n" +
                    "✔ Cucumber & Hummus = Hydrating, rich in fiber & supports digestion\n" +
                    "\n" +
                    "This meal is quick, delicious, and keeps you energized throughout the day! Let me know if you want any variations. \uD83D\uDE80\uD83E\uDD63\uD83E\uDD64\uD83E\uDD52");
        }




        // Muscle Gain Steps
        else if (category.equals("muscle_gain")) {
            steps.put("breakfast", "\uD83C\uDF7D\uFE0F Meal: \"Scrambled Eggs & Avocado Toast, Peanut Butter Smoothie, and Oatmeal with Protein Powder\"\n" +
                    "\uD83D\uDCCC Category: Muscle Gain \n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This protein-rich, energy-boosting breakfast is a perfect combination of healthy fats, fiber, and muscle-building nutrients. Scrambled eggs and avocado toast provide essential proteins and good fats, the peanut butter smoothie adds nutrients for sustained energy, and the oatmeal with protein powder keeps you full and fueled throughout the day.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83C\uDF5E Scrambled Eggs & Avocado Toast\n" +
                    "✔ 2 eggs (whisked)\n" +
                    "✔ ½ avocado (mashed)\n" +
                    "✔ 1 slice whole-grain or sourdough bread\n" +
                    "✔ 1 tsp olive oil or butter (for cooking)\n" +
                    "✔ Salt & pepper (to taste)\n" +
                    "✔ Red chili flakes (optional, for extra flavor)\n" +
                    "\n" +
                    "\uD83E\uDD64 Peanut Butter Smoothie\n" +
                    "✔ 1 banana (for natural sweetness)\n" +
                    "✔ 1 tbsp peanut butter (natural, unsweetened)\n" +
                    "✔ 1 cup almond milk or regular milk\n" +
                    "✔ 1 scoop protein powder (vanilla or chocolate)\n" +
                    "✔ ½ tsp cinnamon (optional for flavor)\n" +
                    "✔ Ice cubes (as needed)\n" +
                    "\n" +
                    "\uD83E\uDD63 Oatmeal with Protein Powder\n" +
                    "✔ ½ cup rolled oats\n" +
                    "✔ 1 scoop protein powder (vanilla/chocolate)\n" +
                    "✔ 1 cup almond milk or water\n" +
                    "✔ 1 tbsp chia seeds or flaxseeds\n" +
                    "✔ ½ tsp honey or maple syrup (optional)\n" +
                    "✔ Fresh berries or banana slices (for topping)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Scrambled Eggs & Avocado Toast\n" +
                    "\n" +
                    "Heat a pan with olive oil or butter, add whisked eggs, and scramble them until fluffy.\n" +
                    "Toast the whole-grain bread and spread mashed avocado on top.\n" +
                    "Top with scrambled eggs, salt, pepper, and red chili flakes (optional).\n" +
                    "2\uFE0F⃣ Peanut Butter Smoothie\n" +
                    "\n" +
                    "Blend banana, peanut butter, milk, protein powder, cinnamon, and ice until smooth.\n" +
                    "Pour into a glass and serve.\n" +
                    "3\uFE0F⃣ Oatmeal with Protein Powder\n" +
                    "\n" +
                    "Cook oats with milk/water until soft.\n" +
                    "Stir in protein powder and mix well.\n" +
                    "Top with chia seeds, honey, and fresh berries.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Scrambled Eggs & Avocado = Rich in protein, healthy fats & keeps you full longer\n" +
                    "✔ Peanut Butter Smoothie = Great for muscle recovery & sustained energy\n" +
                    "✔ Oatmeal with Protein Powder = High in fiber & supports digestion\n" +
                    "\n" +
                    "This meal is delicious, nutritious, and keeps you energized all morning! Let me know if you need any modifications. \uD83E\uDD51\uD83C\uDF5E\uD83E\uDD5A\uD83E\uDD64\uD83E\uDD63\uD83D\uDE80");


            steps.put("lunch", "\uD83C\uDF7D\uFE0F Meal: \"Grilled Chicken with Brown Rice, Roasted Sweet Potatoes, and Green Salad with Olive Oil\"\n" +
                    "\uD83D\uDCCC Category: Muscle Gain \n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This balanced and nutrient-dense meal is perfect for muscle recovery, sustained energy, and overall health. The grilled chicken is a lean protein source essential for muscle building, brown rice provides slow-digesting complex carbohydrates for energy, roasted sweet potatoes are rich in fiber and vitamins, and the green salad with olive oil adds healthy fats and antioxidants for overall well-being.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83C\uDF57 Grilled Chicken & Brown Rice\n" +
                    "✔ 1 boneless, skinless chicken breast\n" +
                    "✔ 1 tsp olive oil\n" +
                    "✔ ½ tsp garlic powder\n" +
                    "✔ ½ tsp paprika\n" +
                    "✔ Salt & pepper (to taste)\n" +
                    "✔ ½ cup cooked brown rice\n" +
                    "\n" +
                    "\uD83C\uDF60 Roasted Sweet Potatoes\n" +
                    "✔ 1 medium sweet potato (cubed)\n" +
                    "✔ 1 tsp olive oil\n" +
                    "✔ ½ tsp paprika\n" +
                    "✔ ½ tsp black pepper\n" +
                    "✔ ½ tsp cinnamon (optional for sweetness)\n" +
                    "\n" +
                    "\uD83E\uDD57 Green Salad with Olive Oil\n" +
                    "✔ 1 cup mixed greens (lettuce, spinach, arugula)\n" +
                    "✔ ½ cucumber (sliced)\n" +
                    "✔ ½ tomato (chopped)\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ ½ tsp lemon juice\n" +
                    "✔ Salt & pepper (to taste)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Grilled Chicken & Brown Rice\n" +
                    "\n" +
                    "Season the chicken breast with olive oil, garlic powder, paprika, salt, and pepper.\n" +
                    "Heat a grill or pan and cook for 5-7 minutes on each side until fully cooked.\n" +
                    "Serve with ½ cup of cooked brown rice.\n" +
                    "2\uFE0F⃣ Roasted Sweet Potatoes\n" +
                    "\n" +
                    "Preheat oven to 200°C (400°F).\n" +
                    "Toss cubed sweet potatoes with olive oil, paprika, black pepper, and cinnamon.\n" +
                    "Roast for 20-25 minutes, flipping halfway through.\n" +
                    "3\uFE0F⃣ Green Salad with Olive Oil\n" +
                    "\n" +
                    "In a bowl, mix lettuce, cucumber, and tomato.\n" +
                    "Drizzle with olive oil and lemon juice, then season with salt & pepper.\n" +
                    "Toss well and serve.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Grilled Chicken = Lean protein for muscle repair & growth\n" +
                    "✔ Brown Rice = Slow-digesting carbs for sustained energy\n" +
                    "✔ Roasted Sweet Potatoes = Rich in fiber & essential vitamins\n" +
                    "✔ Green Salad with Olive Oil = Healthy fats & antioxidants\n" +
                    "\n" +
                    "This meal is nutrient-packed, delicious, and perfect for an active lifestyle! Let me know if you want any modifications. \uD83C\uDF57\uD83C\uDF5A\uD83E\uDD57\uD83D\uDE80");

            steps.put("dinner", "\uD83C\uDF7D\uFE0F Meal: \"Grilled Salmon with Quinoa, Steamed Broccoli & Carrots, and Greek Yogurt with Honey\"\n" +
                    "\uD83D\uDCCC Category: Muscle Gain \n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This nutrient-rich and well-balanced meal is ideal for muscle recovery, heart health, and overall wellness. Grilled salmon is packed with omega-3 fatty acids and high-quality protein, quinoa provides fiber, plant-based protein, and essential amino acids, while steamed broccoli and carrots add vitamins, minerals, and antioxidants. The Greek yogurt with honey serves as a light and protein-rich dessert that supports digestion and boosts energy.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83D\uDC1F Grilled Salmon & Quinoa\n" +
                    "✔ 1 salmon fillet (4-6 oz)\n" +
                    "✔ 1 tsp olive oil\n" +
                    "✔ ½ tsp garlic powder\n" +
                    "✔ ½ tsp paprika\n" +
                    "✔ ½ tsp black pepper\n" +
                    "✔ Salt (to taste)\n" +
                    "✔ ½ lemon (for juice)\n" +
                    "✔ ½ cup cooked quinoa\n" +
                    "\n" +
                    "\uD83E\uDD66 Steamed Broccoli & Carrots\n" +
                    "✔ ½ cup broccoli florets\n" +
                    "✔ ½ cup carrot slices\n" +
                    "✔ ½ tsp olive oil (optional)\n" +
                    "✔ Pinch of salt & pepper\n" +
                    "\n" +
                    "\uD83C\uDF6F Greek Yogurt with Honey\n" +
                    "✔ ½ cup plain Greek yogurt\n" +
                    "✔ 1 tsp raw honey\n" +
                    "✔ 1 tbsp chopped nuts (almonds/walnuts) (optional)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Grilled Salmon & Quinoa\n" +
                    "\n" +
                    "Preheat the grill or pan over medium heat.\n" +
                    "Season the salmon fillet with olive oil, garlic powder, paprika, black pepper, salt, and lemon juice.\n" +
                    "Grill for 4-5 minutes per side until golden and cooked through.\n" +
                    "Serve with ½ cup of cooked quinoa.\n" +
                    "2\uFE0F⃣ Steamed Broccoli & Carrots\n" +
                    "\n" +
                    "In a steamer, cook broccoli and carrot slices for 5-7 minutes until tender.\n" +
                    "Drizzle with a little olive oil, salt, and pepper before serving.\n" +
                    "3\uFE0F⃣ Greek Yogurt with Honey\n" +
                    "\n" +
                    "In a bowl, add Greek yogurt.\n" +
                    "Drizzle with honey and top with chopped nuts for added crunch.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Grilled Salmon = Rich in omega-3s for heart & brain health\n" +
                    "✔ Quinoa = Complete protein + fiber for digestion & muscle repair\n" +
                    "✔ Steamed Broccoli & Carrots = High in vitamins & antioxidants\n" +
                    "✔ Greek Yogurt with Honey = Probiotics for gut health & natural energy\n" +
                    "\n" +
                    "This meal is delicious, nourishing, and perfect for a healthy lifestyle! \uD83C\uDF7D\uFE0F\uD83D\uDC1F\uD83E\uDD66\uD83C\uDF6F Let me know if you need adjustments!");

            steps.put("snacks", "\uD83E\uDD5C Protein Bar, Almonds & Walnuts, and Banana with Peanut Butter\n" +
                    "\uD83D\uDCCC Category: Muscle Gain \n" +
                    "\uD83C\uDF5B Meal Type: Pre-Workout / Post-Workout\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This high-protein, energy-boosting snack is perfect for muscle recovery, sustained energy, and overall health. A protein bar provides quick protein and essential nutrients, almonds and walnuts supply healthy fats, fiber, and antioxidants, while a banana with peanut butter offers a natural source of energy, potassium, and protein. This combination helps support muscle growth, maintain satiety, and enhance workout performance.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83C\uDF6B Protein Bar\n" +
                    "✔ 1 store-bought or homemade protein bar (low sugar, high protein)\n" +
                    "\n" +
                    "\uD83E\uDD5C Almonds & Walnuts\n" +
                    "✔ 10 almonds\n" +
                    "✔ 5 walnut halves\n" +
                    "\n" +
                    "\uD83C\uDF4C Banana with Peanut Butter\n" +
                    "✔ 1 medium banana\n" +
                    "✔ 1 tbsp natural peanut butter (unsweetened)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Protein Bar\n" +
                    "\n" +
                    "Choose a low-sugar, high-protein bar with at least 10-15g of protein.\n" +
                    "If making at home, use oats, protein powder, nuts, and honey.\n" +
                    "2\uFE0F⃣ Almonds & Walnuts\n" +
                    "\n" +
                    "Eat raw or roasted for a crunchy, healthy snack.\n" +
                    "3\uFE0F⃣ Banana with Peanut Butter\n" +
                    "\n" +
                    "Slice the banana and spread peanut butter on top.\n" +
                    "Optionally, sprinkle chia seeds or cinnamon for extra nutrients.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Protein Bar = Quick protein boost for muscle recovery\n" +
                    "✔ Almonds & Walnuts = Rich in healthy fats & brain-boosting nutrients\n" +
                    "✔ Banana & Peanut Butter = Provides potassium, fiber, and sustained energy\n" +
                    "\n" +
                    "This nutrient-packed snack is perfect for staying energized and fueling your body! \uD83E\uDD5C\uD83C\uDF4C\uD83C\uDF6B Let me know if you need modifications! ");
        }
        // Healthy Diet Steps
        else {
            steps.put("breakfast", "\uD83E\uDD51 Oatmeal with Fruits & Nuts, Whole Grain Avocado Toast, and Greek Yogurt with Honey\n" +
                    "\uD83D\uDCCC Category: Healthy Diet \n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This wholesome, nutrient-dense breakfast is a perfect balance of fiber, healthy fats, protein, and natural sweetness. Oatmeal with fruits and nuts provides slow-releasing energy, avocado toast on whole grain bread delivers essential healthy fats and fiber, and Greek yogurt with honey offers probiotics and a natural touch of sweetness. This meal is great for weight management, muscle gain, and overall well-being.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83E\uDD63 Oatmeal with Fruits & Nuts\n" +
                    "✔ ½ cup rolled oats\n" +
                    "✔ 1 cup almond milk or water\n" +
                    "✔ ½ banana (sliced)\n" +
                    "✔ 5-6 almonds or walnuts (chopped)\n" +
                    "✔ 1 tbsp chia seeds\n" +
                    "✔ 1 tsp honey (optional)\n" +
                    "\n" +
                    "\uD83E\uDD51 Whole Grain Toast with Avocado\n" +
                    "✔ 1 slice whole grain bread\n" +
                    "✔ ½ ripe avocado (mashed)\n" +
                    "✔ ½ tsp lemon juice\n" +
                    "✔ A pinch of salt & black pepper\n" +
                    "✔ Red chili flakes (optional)\n" +
                    "\n" +
                    "\uD83C\uDF6F Greek Yogurt with Honey\n" +
                    "✔ ½ cup Greek yogurt\n" +
                    "✔ 1 tsp honey\n" +
                    "✔ A handful of mixed berries (strawberries, blueberries)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Oatmeal with Fruits & Nuts\n" +
                    "\n" +
                    "Cook oats with almond milk or water until soft.\n" +
                    "Top with banana slices, nuts, and chia seeds.\n" +
                    "Drizzle with honey for extra sweetness.\n" +
                    "2\uFE0F⃣ Whole Grain Toast with Avocado\n" +
                    "\n" +
                    "Toast the whole grain bread until crispy.\n" +
                    "Mash avocado with lemon juice, salt, and pepper.\n" +
                    "Spread on toast and sprinkle chili flakes (optional).\n" +
                    "3\uFE0F⃣ Greek Yogurt with Honey\n" +
                    "\n" +
                    "In a bowl, mix Greek yogurt with honey.\n" +
                    "Top with fresh berries for extra flavor.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Oatmeal with Fruits & Nuts = High in fiber, vitamins, and antioxidants\n" +
                    "✔ Avocado Toast = Packed with healthy fats & fiber for heart health\n" +
                    "✔ Greek Yogurt with Honey = Rich in probiotics, calcium & protein\n" +
                    "\n" +
                    "This balanced, delicious breakfast keeps you full, energized, and nourished throughout the day! \uD83E\uDD51\uD83C\uDF6F\uD83E\uDD63  ");

            steps.put("lunch", "\uD83E\uDD57 Grilled Salmon with Quinoa, Spinach & Kale Salad, and Lentil Soup with Whole Grain Bread\n" +
                    "\uD83D\uDCCC Category: Healthy Diet \n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This nutrient-rich and protein-packed meal is a perfect combination of lean protein, healthy fats, fiber, and complex carbohydrates. Grilled salmon with quinoa provides high-quality protein and omega-3 fatty acids, while spinach and kale salad with nuts adds essential vitamins, minerals, and antioxidants. The lentil soup with whole grain bread completes the meal with plant-based protein, fiber, and slow-digesting carbs, making it an ideal choice for muscle gain, heart health, and weight management.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83D\uDC1F Grilled Salmon with Quinoa\n" +
                    "✔ 1 salmon fillet\n" +
                    "✔ ½ cup quinoa\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ ½ tsp garlic powder\n" +
                    "✔ ½ tsp black pepper\n" +
                    "✔ ½ tsp paprika\n" +
                    "✔ 1 tsp lemon juice\n" +
                    "\n" +
                    "\uD83E\uDD57 Spinach & Kale Salad with Nuts\n" +
                    "✔ 1 cup fresh spinach\n" +
                    "✔ 1 cup chopped kale\n" +
                    "✔ ¼ cup mixed nuts (almonds, walnuts)\n" +
                    "✔ ½ apple (sliced)\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ 1 tsp lemon juice\n" +
                    "✔ A pinch of salt & black pepper\n" +
                    "\n" +
                    "\uD83E\uDD63 Lentil Soup with Whole Grain Bread\n" +
                    "✔ ½ cup red lentils\n" +
                    "✔ 1½ cups vegetable broth\n" +
                    "✔ ½ onion (chopped)\n" +
                    "✔ 1 garlic clove (minced)\n" +
                    "✔ ½ tsp cumin\n" +
                    "✔ ½ tsp turmeric\n" +
                    "✔ 1 slice whole grain bread\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Grilled Salmon with Quinoa\n" +
                    "\n" +
                    "Season the salmon with garlic powder, paprika, black pepper, and lemon juice.\n" +
                    "Heat olive oil in a pan and grill the salmon for 3-4 minutes per side until golden.\n" +
                    "Cook quinoa according to package instructions and serve with salmon.\n" +
                    "2\uFE0F⃣ Spinach & Kale Salad with Nuts\n" +
                    "\n" +
                    "Mix spinach, kale, and apple slices in a bowl.\n" +
                    "Toss with olive oil, lemon juice, salt, and pepper.\n" +
                    "Add mixed nuts for a crunchy texture.\n" +
                    "3\uFE0F⃣ Lentil Soup with Whole Grain Bread\n" +
                    "\n" +
                    "Sauté onion and garlic in a pot until soft.\n" +
                    "Add lentils, vegetable broth, cumin, and turmeric.\n" +
                    "Cook for 20-25 minutes until lentils are soft.\n" +
                    "Serve with a slice of whole grain bread.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Salmon = High in omega-3s & lean protein for heart & muscle health\n" +
                    "✔ Quinoa = A complete plant-based protein rich in fiber & minerals\n" +
                    "✔ Spinach & Kale Salad = Packed with antioxidants & vitamins for immunity\n" +
                    "✔ Lentil Soup = Loaded with fiber & plant protein for digestion & energy\n" +
                    "\n" +
                    "This delicious, well-balanced meal keeps you full, energized, and nourished throughout the day! \uD83E\uDD57\uD83D\uDC1F");

            steps.put("dinner", "\uD83E\uDD57 Stir-Fried Tofu with Veggies, Baked Sweet Potatoes, and Cucumber & Tomato Salad\n" +
                    "\uD83D\uDCCC Category: Healthy Diet\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This wholesome and nutrient-dense meal is a perfect balance of plant-based protein, healthy carbs, and essential vitamins. Stir-fried tofu with colorful veggies provides high-quality protein and antioxidants, while baked sweet potatoes add a dose of complex carbohydrates, fiber, and vitamin A. The refreshing cucumber and tomato salad completes the meal with hydration, minerals, and a light, crisp texture, making it a great option for muscle recovery, digestion, and weight management.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83E\uDD62 Stir-Fried Tofu with Veggies\n" +
                    "✔ ½ cup firm tofu (cubed)\n" +
                    "✔ ½ cup bell peppers (sliced)\n" +
                    "✔ ½ cup broccoli florets\n" +
                    "✔ ½ cup carrots (julienned)\n" +
                    "✔ 1 tbsp olive oil\n" +
                    "✔ 1 tsp soy sauce (low sodium)\n" +
                    "✔ ½ tsp garlic (minced)\n" +
                    "✔ ½ tsp black pepper\n" +
                    "✔ ½ tsp sesame seeds (optional)\n" +
                    "\n" +
                    "\uD83C\uDF60 Baked Sweet Potatoes\n" +
                    "✔ 1 medium sweet potato (sliced)\n" +
                    "✔ 1 tsp olive oil\n" +
                    "✔ ½ tsp cinnamon (optional)\n" +
                    "✔ ½ tsp black pepper\n" +
                    "✔ A pinch of salt\n" +
                    "\n" +
                    "\uD83E\uDD57 Cucumber & Tomato Salad\n" +
                    "✔ ½ cucumber (sliced)\n" +
                    "✔ ½ cup cherry tomatoes (halved)\n" +
                    "✔ 1 tbsp lemon juice\n" +
                    "✔ 1 tsp olive oil\n" +
                    "✔ A pinch of salt & black pepper\n" +
                    "✔ 1 tsp chopped fresh basil or parsley (optional)\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Stir-Fried Tofu with Veggies\n" +
                    "\n" +
                    "Heat olive oil in a pan and sauté garlic for 30 seconds.\n" +
                    "Add tofu cubes and cook until golden brown (3-4 minutes per side).\n" +
                    "Add bell peppers, broccoli, and carrots. Stir-fry for 3-4 minutes.\n" +
                    "Pour soy sauce, sprinkle sesame seeds, and mix well.\n" +
                    "2\uFE0F⃣ Baked Sweet Potatoes\n" +
                    "\n" +
                    "Preheat oven to 200°C (400°F).\n" +
                    "Toss sliced sweet potatoes with olive oil, black pepper, and cinnamon.\n" +
                    "Bake for 25-30 minutes until soft and slightly crispy.\n" +
                    "3\uFE0F⃣ Cucumber & Tomato Salad\n" +
                    "\n" +
                    "Mix sliced cucumbers and cherry tomatoes in a bowl.\n" +
                    "Drizzle with olive oil, lemon juice, salt, and pepper.\n" +
                    "Toss gently and garnish with basil or parsley.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Tofu = Excellent plant-based protein & calcium for muscle & bone health\n" +
                    "✔ Veggies = High in fiber, antioxidants & vitamins for immunity\n" +
                    "✔ Sweet Potatoes = Rich in complex carbs, fiber & vitamin A for energy\n" +
                    "✔ Cucumber & Tomato Salad = Hydrating & full of electrolytes & minerals\n" +
                    "\n" +
                    "This balanced and delicious meal is ideal for muscle recovery, sustained energy, and overall well-being! \uD83E\uDD57\uD83E\uDD62\uD83C\uDF60");


            steps.put("snacks", "\uD83E\uDD57 Mixed Nuts & Seeds, Apple Slices with Almond Butter, and Hummus with Whole Grain Crackers\n" +
                    "\uD83D\uDCCC Category: Healthy Diet \n" +
                    "\uD83C\uDF4F Meal Type: Snack\n" +
                    "\n" +
                    "\uD83D\uDCDD Description\n" +
                    "This nutrient-packed snack platter provides the perfect balance of healthy fats, protein, and fiber to keep you energized throughout the day. Mixed nuts and seeds offer a powerful dose of omega-3 fatty acids, protein, and antioxidants, while apple slices with almond butter deliver natural sweetness, fiber, and healthy fats. The hummus with whole grain crackers adds a delicious boost of plant-based protein and slow-digesting carbohydrates, making this snack ideal for muscle recovery, weight management, and sustained energy.\n" +
                    "\n" +
                    "\uD83D\uDD39 Ingredients\n" +
                    "\uD83E\uDD5C Mixed Nuts & Seeds\n" +
                    "✔ ¼ cup almonds\n" +
                    "✔ ¼ cup walnuts\n" +
                    "✔ 1 tbsp sunflower seeds\n" +
                    "✔ 1 tbsp chia seeds\n" +
                    "\n" +
                    "\uD83C\uDF4F Apple Slices with Almond Butter\n" +
                    "✔ 1 medium apple (sliced)\n" +
                    "✔ 1 tbsp almond butter (unsweetened)\n" +
                    "\n" +
                    "\uD83E\uDD63 Hummus with Whole Grain Crackers\n" +
                    "✔ 2 tbsp hummus\n" +
                    "✔ 5-6 whole grain crackers\n" +
                    "\n" +
                    "\uD83C\uDF73 How to Prepare\n" +
                    "1\uFE0F⃣ Prepare the Mixed Nuts & Seeds\n" +
                    "\n" +
                    "In a small bowl, mix almonds, walnuts, sunflower seeds, and chia seeds.\n" +
                    "2\uFE0F⃣ Prepare the Apple Slices with Almond Butter\n" +
                    "\n" +
                    "Slice the apple into wedges.\n" +
                    "Spread almond butter evenly on each slice.\n" +
                    "3\uFE0F⃣ Serve Hummus with Whole Grain Crackers\n" +
                    "\n" +
                    "Place hummus in a small bowl.\n" +
                    "Arrange whole grain crackers on a plate for dipping.\n" +
                    "✅ Health Benefits\n" +
                    "✔ Mixed Nuts & Seeds = Rich in omega-3s, protein, and fiber for brain and heart health\n" +
                    "✔ Apple with Almond Butter = Natural sugars + healthy fats for steady energy\n" +
                    "✔ Hummus & Whole Grain Crackers = Plant-based protein & slow-digesting carbs for satiety\n" +
                    "\n" +
                    "This quick and nutritious snack is perfect for pre-workout energy, a mid-day pick-me-up, or a healthy treat anytime! \uD83E\uDD5C\uD83C\uDF4F\uD83E\uDD63");
        }

        return steps.getOrDefault(mealType, "No steps available.");
    }
}

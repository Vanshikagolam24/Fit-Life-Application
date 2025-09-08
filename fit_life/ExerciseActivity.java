//package com.example.fit_life;
//
//import android.os.Bundle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ExerciseActivity extends AppCompatActivity {  // ✅ Removed duplicate class definition
//
//    private RecyclerView recyclerView;
//    private ExerciseAdapter adapter;
//    private List<ExerciseModel> exerciseList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_exercise);  // ✅ Make sure this layout exists
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        // ✅ Initialize exercise list
//        exerciseList = new ArrayList<>();
//        exerciseList.add(new ExerciseModel("Push-ups", "Strengthens chest, shoulders, and triceps.", R.drawable.push_ups));
//        exerciseList.add(new ExerciseModel("Squats", "Strengthens legs and glutes.", R.drawable.squats));
//        exerciseList.add(new ExerciseModel("Plank", "Improves core strength and stability.", R.drawable.plank));
//
//        // ✅ Set adapter
//        adapter = new ExerciseAdapter(this, exerciseList);
//        recyclerView.setAdapter(adapter);
//    }
//}
//main/////////////////////////////////////////////////////////////////
//package com.example.fit_life;
//
//import android.os.Bundle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.LinearLayoutManager;
//import androidx.recyclerview.widget.RecyclerView;
//import java.util.ArrayList;
//import java.util.List;
//
//public class ExerciseActivity extends AppCompatActivity {
//    private RecyclerView recyclerView;
//    private ExerciseAdapter adapter;
//    private List<ExerciseModel> exerciseList;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_exercise);
//
//        recyclerView = findViewById(R.id.recyclerView);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        // Adding Exercise Data
//        exerciseList = new ArrayList<>();
//        exerciseList.add(new ExerciseModel("Push-ups", "Strengthens chest, shoulders, and triceps.", R.drawable.push_ups));
//        exerciseList.add(new ExerciseModel("Squats", "Strengthens legs and glutes.", R.drawable.squats));
//        exerciseList.add(new ExerciseModel("Plank", "Improves core strength and stability.", R.drawable.plank));
//        exerciseList.add(new ExerciseModel("Jumping Jacks", "Improves cardiovascular and stability.", R.drawable.jumping_jacks));
//        exerciseList.add(new ExerciseModel("Lunges", "Improves leg and core strength.", R.drawable.lunges));
//        exerciseList.add(new ExerciseModel("Burpees", "A full-body exercise that improves endurance.", R.drawable.burpees));
//        exerciseList.add(new ExerciseModel("Mountain Climbers", "A high-intensity exercise that engages the core.", R.drawable.mountain_climbers));
//        exerciseList.add(new ExerciseModel("Leg Raises", "Strengthens lower abs and core.", R.drawable.leg_raises));
//        exerciseList.add(new ExerciseModel("Russian Twists", "Improves oblique strengths and stability.", R.drawable.russian_twists));
//        exerciseList.add(new ExerciseModel("Bicycle Crunches", "Engages the entire core and improves flexibilty.", R.drawable.bicycle_crunches));
//
//
//
//        adapter = new ExerciseAdapter(this, exerciseList);
//        recyclerView.setAdapter(adapter);
//    }
//}
package com.example.fit_life;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        RecyclerView recyclerViewExercise = findViewById(R.id.recyclerViewExercise);
        recyclerViewExercise.setLayoutManager(new LinearLayoutManager(this));

        List<ExerciseModel> exerciseList = new ArrayList<>();
        exerciseList.add(new ExerciseModel("Push-ups", "Strengthens chest, shoulders, and triceps.", R.drawable.push_ups,
                "\uD83C\uDFCB PUSH-UPS \n" +
                        "\n" +
                        "Overview: This exercise strengthens the chest, shoulders, and triceps while engaging the core for stability.\n" +
                        "\n" +
                        "● STEP 1: GET INTO STARTING POSITION\n" +
                        "\n" +
                        "- Place your hands shoulder-width apart on the floor.\n" +
                        "\n" +
                        "- Extend your legs straight behind you, toes touching the ground.\n" +
                        "\n" +
                        "- Keep your body in a straight line from head to heels.\n" +
                        "\n" +
                        "● STEP 2: ENGAGE YOUR CORE\n" +
                        "\n" +
                        "- Tighten your abs and keep your back straight.\n" +
                        "\n" +
                        "- Avoid sagging your hips or raising your buttocks too high.\n" +
                        "\n" +
                        "● STEP 3: LOWER YOUR BODY\n" +
                        "\n" +
                        "- Bend your elbows and slowly lower your chest toward the ground.\n" +
                        "\n" +
                        "- Keep your elbows at a 45-degree angle from your body.\n" +
                        "\n" +
                        "- Lower yourself until your chest is about an inch from the floor.\n" +
                        "\n" +
                        "● STEP 4: PUSH BACK UP\n" +
                        "\n" +
                        "- Exhale and press through your palms to straighten your arms.\n" +
                        "\n" +
                        "- Return to the starting position while keeping your core tight.\n" +
                        "\n" +
                        "● STEP 5: REPEAT THE MOVEMENT\n" +
                        "\n" +
                        "- Perform 10-15 repetitions in a slow and controlled manner.\n" +
                        "\n" +
                        "- Maintain proper form throughout the exercise.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens chest, shoulders, arms, and core muscles.\n" +
                        "\n" +
                        "✔\uFE0F Improves upper body endurance and stability.\n" +
                        "\n" +
                        "✔\uFE0F Helps enhance posture and functional strength.\n" +
                        "\n" +
                        "✔\uFE0F Can be modified for different fitness levels.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid arching or sagging your lower back – Keep your core engaged.\n" +
                        "\n" +
                        "\uD83D\uDEAB Don't flare your elbows too wide – Keep them at a natural angle.\n" +
                        "\n" +
                        "\uD83D\uDEAB Move slowly and with control – Avoid rushing through reps."));

        exerciseList.add(new ExerciseModel("Squats", "Strengthens legs and glutes.", R.drawable.squats,
                "\uD83C\uDFCB SQUATS \n" +
                        "\n" +
                        "This exercise strengthens the legs and glutes, improving lower body power and stability.\n" +
                        "\n" +
                        "● STEP 1: STAND IN POSITION\n" +
                        "\n" +
                        "- Stand with your feet shoulder-width apart.\n" +
                        "\n" +
                        "- Keep your chest up and back straight.\n" +
                        "\n" +
                        "- Engage your core muscles for stability.\n" +
                        "\n" +
                        "● STEP 2: LOWER YOUR BODY\n" +
                        "\n" +
                        "- Push your hips back as if sitting in a chair.\n" +
                        "\n" +
                        "- Bend your knees and lower yourself until your thighs are parallel to the ground.\n" +
                        "\n" +
                        "- Keep your knees aligned with your toes.\n" +
                        "\n" +
                        "● STEP 3: MAINTAIN PROPER FORM\n" +
                        "\n" +
                        "Keep your chest lifted and avoid rounding your back.\n" +
                        "\n" +
                        "- Ensure your knees don’t go past your toes.\n" +
                        "\n" +
                        "● STEP 4: PUSH BACK UP\n" +
                        "\n" +
                        "- Press through your heels and straighten your legs.\n" +
                        "\n" +
                        "- Engage your glutes as you return to a standing position.\n" +
                        "\n" +
                        "● SSTEP 5: REPEAT THE MOVEMENT\n" +
                        "\n" +
                        "- Perform 10-15 repetitions in a slow, controlled manner.\n" +
                        "\n" +
                        "- Focus on maintaining good posture throughout the movement.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens legs, glutes, and core muscles.\n" +
                        "\n" +
                        "✔\uFE0F Improves balance, mobility, and flexibility.\n" +
                        "\n" +
                        "✔\uFE0F Boosts lower body strength for daily activities.\n" +
                        "\n" +
                        "✔\uFE0F Enhances athletic performance and endurance.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid rounding your back – Keep your chest up.\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t let knees go past toes – Maintain proper alignment.\n" +
                        "\n" +
                        "\uD83D\uDEAB Control your movements – Don’t rush the exercise."));

        exerciseList.add(new ExerciseModel("Plank", "Improves core strength and stability.", R.drawable.plank,
                "\uD83C\uDFCB PLANK \n" +
                        "\n" +
                        "This exercise improves core strength and stability, enhancing balance and overall body control. \n" +
                        "\n" +
                        "● STEP 1: GET INTO POSITION\n" +
                        "\n" +
                        "- Lie face down on the floor or a mat.\n" +
                        "\n" +
                        "- Place your elbows directly under your shoulders.\n" +
                        "\n" +
                        "- Keep your forearms flat on the ground, with hands facing forward.\n" +
                        "\n" +
                        "● STEP 2: LIFT YOUR BODY\n" +
                        "\n" +
                        "- Push through your forearms and lift your body off the ground.\n" +
                        "\n" +
                        "- Keep your body in a straight line from head to heels.\n" +
                        "\n" +
                        "- Engage your core, glutes, and legs to maintain stability.\n" +
                        "\n" +
                        "● STEP 3: MAINTAIN PROPER FORM\n" +
                        "\n" +
                        "- Keep your neck neutral, looking slightly ahead or down.\n" +
                        "\n" +
                        "- Avoid arching your back or letting your hips sag.\n" +
                        "\n" +
                        "- Maintain a tight core throughout the movement.\n" +
                        "\n" +
                        "● STEP 4: HOLD THE POSITION\n" +
                        "\n" +
                        "- Stay in the plank position for 20-60 seconds (or as long as possible).\n" +
                        "\n" +
                        "- Keep breathing steadily to avoid tension.\n" +
                        "\n" +
                        "● STEP 5: LOWER AND REST\n" +
                        "\n" +
                        "- Slowly bring your knees down and relax.\n" +
                        "\n" +
                        "- Take a short break before repeating the exercise.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens core muscles, shoulders, and back.\n" +
                        "\n" +
                        "✔\uFE0F Improves posture and stability.\n" +
                        "\n" +
                        "✔\uFE0F Enhances balance and endurance.\n" +
                        "\n" +
                        "✔\uFE0F Reduces risk of back pain by strengthening the spine.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t let your hips drop – Keep a straight body line.\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid holding your breath – Keep breathing steadily.\n" +
                        "\n" +
                        "\uD83D\uDEAB Engage your core – Don’t let your lower back arch."));


        exerciseList.add(new ExerciseModel("Jumping Jacks", "Improves cardiovascular fitness.", R.drawable.jumping_jacks,
                "\uD83C\uDFCB JUMPING JACKS\n" +
                        "\n" +
                        "This exercise improves cardiovascular fitness, enhancing heart health and overall endurance.\n" +
                        "\n" +
                        "● STEP 1: STARTING POSITION\n" +
                        "\n" +
                        "- Stand up straight with your feet together.\n" +
                        "\n" +
                        "- Keep your arms relaxed by your sides.\n" +
                        "\n" +
                        "- Engage your core and keep your back straight.\n" +
                        "\n" +
                        "● STEP 2: JUMP AND SPREAD\n" +
                        "\n" +
                        "- Jump up slightly and spread your legs shoulder-width apart.\n" +
                        "\n" +
                        "- At the same time, raise your arms overhead until your hands touch.\n" +
                        "\n" +
                        "● STEP 3: RETURN TO START\n" +
                        "\n" +
                        "- Quickly jump back to the starting position.\n" +
                        "\n" +
                        "- Bring your feet together and lower your arms back down.\n" +
                        "\n" +
                        "● STEP 4: REPEAT THE MOVEMENT\n" +
                        "\n" +
                        "- Continue jumping at a steady pace.\n" +
                        "\n" +
                        "- Keep your movements light and controlled.\n" +
                        "\n" +
                        "● STEP 5: MAINTAIN PROPER FORM\n" +
                        "\n" +
                        "- Land softly on your feet to avoid impact on the knees.\n" +
                        "\n" +
                        "- Keep your core engaged and your chest lifted.\n" +
                        "\n" +
                        "- Breathe in rhythm with your jumps.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Improves cardiovascular health.\n" +
                        "\n" +
                        "✔\uFE0F Burns calories and helps with weight loss.\n" +
                        "\n" +
                        "✔\uFE0F Enhances coordination and agility.\n" +
                        "\n" +
                        "✔\uFE0F Strengthens leg, arm, and core muscles.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid jumping on hard surfaces – Use a mat if needed.\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t lock your knees – Keep them slightly bent.\n" +
                        "\n" +
                        "\uD83D\uDEAB Breathe properly – Exhale as you jump, inhale as you land."));


        exerciseList.add(new ExerciseModel("Lunges", "Improves leg and core strength.", R.drawable.lunges,
                "\uD83C\uDFCB LUNGES \n" +
                        "\n" +
                        "This exercise improves leg and core strength, enhancing stability, balance, and overall endurance.\n" +
                        "\n" +
                        "● STEP 1: STARTING POSITION\n" +
                        "\n" +
                        "- Stand tall with feet hip-width apart.\n" +
                        "\n" +
                        "- Keep your chest up and shoulders relaxed.\n" +
                        "\n" +
                        "- Place your hands on your hips or keep them at your sides.\n" +
                        "\n" +
                        "● STEP 2: STEP FORWARD\n" +
                        "\n" +
                        "- Take a big step forward with your right leg.\n" +
                        "\n" +
                        "- Lower your body until your right thigh is parallel to the ground.\n" +
                        "\n" +
                        "- Your left knee should be just above the floor (not touching).\n" +
                        "\n" +
                        "● STEP 3: MAINTAIN PROPER FORM\n" +
                        "\n" +
                        "- Keep your back straight and core engaged.\n" +
                        "\n" +
                        "- Your front knee should not go past your toes.\n" +
                        "\n" +
                        "- Balance your weight evenly between both legs.\n" +
                        "\n" +
                        "● STEP 4: PUSH BACK TO START\n" +
                        "\n" +
                        "- Press through your front heel to push yourself back up.\n" +
                        "\n" +
                        "- Return to the starting position.\n" +
                        "\n" +
                        "● STEP 5: REPEAT ON THE OTHER SIDE\n" +
                        "\n" +
                        "- Step forward with your left leg and repeat the movement.\n" +
                        "\n" +
                        "- Continue alternating for your desired number of reps.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens legs, glutes, and core.\n" +
                        "\n" +
                        "✔\uFE0F Improves balance and coordination.\n" +
                        "\n" +
                        "✔\uFE0F Increases lower body endurance.\n" +
                        "\n" +
                        "✔\uFE0F Enhances hip flexibility and mobility.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t let your front knee go past your toes – Keep it aligned.\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid leaning forward – Keep your upper body straight.\n" +
                        "\n" +
                        "\uD83D\uDEAB Control your movements – Move slowly and steadily."));


        exerciseList.add(new ExerciseModel("Burpees", "A full-body exercise that improves endurance.", R.drawable.burpees,
                "\uD83C\uDFCB BURPEES \n" +
                        "\n" +
                        "This is a full-body exercise that improves endurance, strength, and overall cardiovascular fitness.\n" +
                        "\n" +
                        "● STEP 1: STARTING POSITION\n" +
                        "\n" +
                        "- Stand tall with feet shoulder-width apart.\n" +
                        "\n" +
                        "- Keep your core engaged and back straight.\n" +
                        "\n" +
                        "● STEP 2: SQUAT DOWN\n" +
                        "\n" +
                        "- Lower your body into a squat position.\n" +
                        "\n" +
                        "- Place your hands on the ground in front of you.\n" +
                        "\n" +
                        "● STEP 3: JUMP INTO PLANK\n" +
                        "\n" +
                        "- Jump your feet back to get into a plank position.\n" +
                        "\n" +
                        "- Keep your body straight from head to heels.\n" +
                        "\n" +
                        "● STEP 4: PERFORM A PUSH-UP (Optional)\n" +
                        "\n" +
                        "- Lower your chest toward the ground.\n" +
                        "\n" +
                        "- Push back up to return to the plank position.\n" +
                        "\n" +
                        "● STEP 5: JUMP FORWARD\n" +
                        "\n" +
                        "- Jump your feet back toward your hands.\n" +
                        "\n" +
                        "- Land in a squat position again.\n" +
                        "\n" +
                        "● STEP 6: JUMP UP\n" +
                        "\n" +
                        "- Explode upward into a jump.\n" +
                        "\n" +
                        "- Land softly and get ready for the next rep.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Full-body workout (chest, arms, legs, and core).\n" +
                        "\n" +
                        "✔\uFE0F Improves cardiovascular endurance.\n" +
                        "\n" +
                        "✔\uFE0F Burns calories quickly.\n" +
                        "\n" +
                        "✔\uFE0F Increases strength and agility.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid arching your back – Keep it straight in the plank.\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t rush – Maintain proper form.\n" +
                        "\n" +
                        "\uD83D\uDEAB Soft landing – Reduce impact on your knees."));


        exerciseList.add(new ExerciseModel("Mountain Climbers", "A high-intensity exercise that engages the core.", R.drawable.mountain_climbers,
                "\uD83C\uDFCB MOUNTAIN CLIMBERS \n" +
                        "\n" +
                        "A high-intensity exercise that engages the core, improves strength, and boosts cardiovascular endurance.\n" +
                        "\n" +
                        "● STEP 1: GET INTO PLANK POSITION\n" +
                        "\n" +
                        "- Place your hands shoulder-width apart on the ground.\n" +
                        "\n" +
                        "- Keep your body straight from head to heels.\n" +
                        "\n" +
                        "- Engage your core muscles.\n" +
                        "\n" +
                        "● STEP 2: BRING ONE KNEE FORWARD\n" +
                        "\n" +
                        "- Lift your right knee toward your chest.\n" +
                        "\n" +
                        "- Keep your back straight and hips stable.\n" +
                        "\n" +
                        "● STEP 3: SWITCH LEGS\n" +
                        "\n" +
                        "- Quickly switch legs, bringing your left knee forward.\n" +
                        "\n" +
                        "- Extend your right leg back simultaneously.\n" +
                        "\n" +
                        "● STEP 4: REPEAT IN A RUNNING MOTION\n" +
                        "\n" +
                        "- Continue switching legs quickly.\n" +
                        "\n" +
                        "- Maintain a steady and controlled pace.\n" +
                        "\n" +
                        "- Keep your hips low and core tight.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Improves core strength and stability.\n" +
                        "\n" +
                        "✔\uFE0F Great for cardiovascular endurance.\n" +
                        "\n" +
                        "✔\uFE0F Strengthens legs, arms, and shoulders.\n" +
                        "\n" +
                        "✔\uFE0F Burns calories and fat effectively.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t lift your hips too high – Stay in plank position.\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid bouncing – Keep movements smooth.\n" +
                        "\n" +
                        "\uD83D\uDEAB Engage your core – Prevent lower back strain."));



        exerciseList.add(new ExerciseModel("Leg Raises", "Strengthens lower abs and core.", R.drawable.leg_raises,
                "\uD83C\uDFCB LEG RAISES \n" +
                        "\n" +
                        "Strengthens lower abs and core.\n" +
                        "\n" +
                        "● STEP 1: LIE DOWN FLAT\n" +
                        "\n" +
                        "- Lie on your back with your legs extended.\n" +
                        "\n" +
                        "- Keep your arms by your sides, palms facing down.\n" +
                        "\n" +
                        "- Engage your core muscles.\n" +
                        "\n" +
                        "● STEP 2: LIFT YOUR LEGS UP\n" +
                        "\n" +
                        "- Slowly raise both legs together towards the ceiling.\n" +
                        "\n" +
                        "- Keep your legs straight and avoid bending your knees.\n" +
                        "\n" +
                        "- Lift until your legs form a 90-degree angle with the floor.\n" +
                        "\n" +
                        "● STEP 3: LOWER YOUR LEGS SLOWLY\n" +
                        "\n" +
                        "- Lower your legs back down slowly.\n" +
                        "\n" +
                        "- Keep your core tight and avoid touching the ground completely.\n" +
                        "\n" +
                        "- Stop just before your legs touch the ground, then lift again.\n" +
                        "\n" +
                        "● STEP 4: REPEAT\n" +
                        "\n" +
                        "- Perform 10-15 repetitions per set.\n" +
                        "\n" +
                        "- Keep your movements slow and controlled.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens lower abs and core muscles.\n" +
                        "\n" +
                        "✔\uFE0F Improves hip flexibility and mobility.\n" +
                        "\n" +
                        "✔\uFE0F Helps in toning the lower abdomen.\n" +
                        "\n" +
                        "✔\uFE0F Reduces lower back pain by improving core stability.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t arch your lower back – Keep your back flat on the floor.\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid using momentum – Lift with controlled movements.\n" +
                        "\n" +
                        "\uD83D\uDEAB Engage your core – Prevent unnecessary strain on the spine."));


        exerciseList.add(new ExerciseModel("Russian Twists", "Improves oblique strength and stability.", R.drawable.russian_twists,
                "\uD83C\uDFCB RUSSIAN TWISTS \n" +
                        "\n" +
                        "Improves oblique strength and stability.\n" +
                        "\n" +
                        "● STEP 1: SIT ON THE FLOOR\n" +
                        "\n" +
                        "- Sit down with your knees bent and feet flat on the floor.\n" +
                        "\n" +
                        "- Keep your back straight and engage your core muscles.\n" +
                        "\n" +
                        "● STEP 2: LEAN BACK SLIGHTLY\n" +
                        "\n" +
                        "- Slightly lean your upper body back to create a V-shape with your torso and thighs.\n" +
                        "\n" +
                        "- Keep your spine straight and maintain balance.\n" +
                        "\n" +
                        "● STEP 3: LIFT YOUR FEET (Optional)\n" +
                        "\n" +
                        "- For more difficulty, lift your feet off the floor so your shins are parallel to the ground.\n" +
                        "\n" +
                        "- Keep your legs together and knees slightly bent.\n" +
                        "\n" +
                        "● STEP 4: TWIST YOUR TORSO\n" +
                        "\n" +
                        "- Hold your hands together or use a weight/medicine ball.\n" +
                        "\n" +
                        "- Twist your torso to the right, bringing your hands near your hip.\n" +
                        "\n" +
                        "- Then twist to the left, moving in a controlled motion.\n" +
                        "\n" +
                        "● STEP 5: REPEAT THE TWISTS\n" +
                        "\n" +
                        "- Perform 10-20 twists per set (1 twist = right + left).\n" +
                        "\n" +
                        "- Keep your core engaged throughout the movement.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens core and oblique muscles.\n" +
                        "\n" +
                        "✔\uFE0F Improves balance and posture.\n" +
                        "\n" +
                        "✔\uFE0F Helps in waist toning and defining abs.\n" +
                        "\n" +
                        "✔\uFE0F Increases spinal mobility and flexibility.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t hunch your back – Maintain a straight posture.\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid fast movements – Perform slow and controlled twists.\n" +
                        "\n" +
                        "\uD83D\uDEAB Keep your core engaged – Prevent lower back strain."));



        exerciseList.add(new ExerciseModel("Bicycle Crunches", "Engages the entire core and improves flexibility.", R.drawable.bicycle_crunches,
                "\uD83D\uDEB4\u200D♂\uFE0F BICYCLE CRUNCHES \n" +
                        "\n" +
                        "Improves oblique strength and stability.\n" +
                        "\n" +
                        "● STEP 1: LIE ON YOUR BACK\n" +
                        "\n" +
                        "- Lie down on a flat surface or exercise mat.\n" +
                        "\n" +
                        "- Keep your lower back pressed into the floor.\n" +
                        "\n" +
                        "● STEP 2: LIFT YOUR LEGS & UPPER BODY\n" +
                        "\n" +
                        "- Bring your knees up to a 90-degree angle.\n" +
                        "\n" +
                        "- Place your hands behind your head (don’t pull your neck).\n" +
                        "\n" +
                        "- Slightly lift your shoulders off the ground.\n" +
                        "\n" +
                        "● STEP 3: START THE BICYCLE MOTION\n" +
                        "\n" +
                        "- Extend your right leg straight while twisting your torso.\n" +
                        "\n" +
                        "- Bring your right elbow towards your left knee.\n" +
                        "\n" +
                        "- Switch sides: Extend your left leg straight and bring your left elbow towards your right knee.\n" +
                        "\n" +
                        "● STEP 4: REPEAT THE MOTION\n" +
                        "\n" +
                        "- Keep alternating in a cycling motion.\n" +
                        "\n" +
                        "- Perform 10-20 reps per side (1 rep = right + left).\n" +
                        "\n" +
                        "- Move in a controlled and steady pace.\n" +
                        "\n" +
                        "\uD83C\uDF1F BENEFITS\n" +
                        "\n" +
                        "✔\uFE0F Strengthens abs, obliques, and core muscles.\n" +
                        "\n" +
                        "✔\uFE0F Improves spinal flexibility and balance.\n" +
                        "\n" +
                        "✔\uFE0F Helps burn belly fat and tone the midsection.\n" +
                        "\n" +
                        "✔\uFE0F Enhances overall endurance and stamina.\n" +
                        "\n" +
                        "⚠\uFE0F PRECAUTIONS\n" +
                        "\n" +
                        "\uD83D\uDEAB Don’t pull your neck – Use your core to lift, not your hands.\n" +
                        "\n" +
                        "\uD83D\uDEAB Avoid fast movements – Focus on slow and controlled twists.\n" +
                        "\n" +
                        "\uD83D\uDEAB Keep lower back on the ground – Prevents strain and injury."));

        ExerciseAdapter adapter = new ExerciseAdapter(exerciseList, this);
        recyclerViewExercise.setAdapter(adapter);
    }
}

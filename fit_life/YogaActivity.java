package com.example.fit_life;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class YogaActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga);

        RecyclerView recyclerViewYoga = findViewById(R.id.recyclerViewYoga);
        recyclerViewYoga.setLayoutManager(new LinearLayoutManager(this));

        // ✅ Create a list of yoga poses with full descriptions
        List<YogaPose> yogaPoses = new ArrayList<>();
        yogaPoses.add(new YogaPose("Adho Mukha Svanasana", "Stretches the whole body.", R.drawable.downward_dog, "\uD83E\uDDD8  DOWNWARD DOG POSE (ADHO MUKHA SVANASANA).\n" +
                "\n" +
                "Overview: This pose strengthens the arms and legs while stretching the spine.\n" +
                "\n" +
                "● STEP 1: START IN TABLETOP POSITION\n" +
                "\n" +
                "- Place your hands and knees on the mat.\n" +
                "\n" +
                "- Keep wrists under shoulders and knees under hips.\n" +
                "\n" +
                "● STEP 2: POSITION YOUR HANDS AND FEET\n" +
                "\n" +
                "- Spread your fingers wide and press your palms firmly into the mat.\n" +
                "\n" +
                "- Tuck your toes under and prepare to lift.\n" +
                "\n" +
                "● STEP 3: LIFT YOUR HIPS\n" +
                "\n" +
                "- Exhale and raise your hips toward the ceiling.\n" +
                "\n" +
                "- Try to straighten your legs while keeping a slight bend in the knees if needed.\n" +
                "\n" +
                "● STEP 4: ALIGN YOUR BODY\n" +
                "\n" +
                "- Your body should form an inverted \"V\" shape.\n" +
                "\n" +
                "- Keep your arms and legs straight but avoid locking the knees.\n" +
                "\n" +
                "- Engage your core and relax your shoulders.\n" +
                "\n" +
                "● STEP 5: HEAD AND NECK POSITION\n" +
                "\n" +
                "- Keep your head between your arms.\n" +
                "\n" +
                "- Look towards your navel or the floor.\n" +
                "\n" +
                "● STEP 6: BREATHE AND HOLD THE POSE\n" +
                "\n" +
                "- Take slow, deep breaths while holding for 5-10 breaths.\n" +
                "\n" +
                "- Feel the stretch in your spine and legs.\n" +
                "\n" +
                "● STEP 7: RELEASE THE POSE\n" +
                "\n" +
                "- Slowly lower your knees back to the mat and return to the tabletop position.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS \n" +
                "\n" +
                "✔\uFE0F Strengthens arms, shoulders, and legs.\n" +
                "\n" +
                "✔\uFE0F Stretches the spine, hamstrings, and calves.\n" +
                "\n" +
                "✔\uFE0F Improves blood circulation.\n" +
                "\n" +
                "✔\uFE0F Relieves stress and boosts energy.\n"+
                "\n" +
                "⚠\uFE0F  PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have high blood pressure, glaucoma, or wrist/shoulder injuries.\n" +
                "\n" +
                "\uD83D\uDEAB Bend your knees slightly if hamstrings feel tight.\n" +
                "\n" +
                "\uD83D\uDEAB Use yoga blocks under hands to reduce wrist strain.\n" +
                "\n" +
                "\uD83D\uDEAB Avoid excessive pressure on wrists; distribute weight evenly." ));


//        Gently stretches the hips, thighs, and ankles while reducing stress and fatigue.
        yogaPoses.add(new YogaPose("Balasana", "A relaxing resting pose.", R.drawable.child_pose, "\uD83E\uDDD8 CHILD'S POSE (BALASANA) \n" +
                "\n" +
                "Overview: This pose strengthens the arms and legs while stretching the spine.\n" +
                "\n" +
                "● STEP 1: START IN A KNEELING POSITION\n" +
                "\n" +
                "- Sit on your heels with your knees together or slightly apart.\n" +
                "\n" +
                "- Keep your big toes touching behind you.\n" +
                "\n" +
                "● STEP 2: EXTEND YOUR ARMS FORWARD\n" +
                "\n" +
                "- Slowly bend forward from your hips.\n" +
                "\n" +
                "- Stretch your arms out in front of you with palms facing down.\n" +
                "\n" +
                "● STEP 3: LOWER YOUR FOREHEAD TO THE MAT\n" +
                "\n" +
                "- Let your chest rest between your thighs.\n" +
                "\n" +
                "- Relax your forehead onto the mat.\n" +
                "\n" +
                "● STEP 4: RELAX YOUR SHOULDERS AND HIPS\n" +
                "\n" +
                "- Let your shoulders drop away from your ears.\n" +
                "\n" +
                "- Gently push your hips back toward your heels.\n" +
                "\n" +
                "● STEP 5: FOCUS ON DEEP BREATHING\n" +
                "\n" +
                "- Inhale deeply through your nose.\n" +
                "\n" +
                "- Exhale slowly, feeling your body relax.\n" +
                "\n" +
                "● STEP 6: HOLD AND RELEASE THE POSE\n" +
                "\n" +
                "- Stay in this position for 30 seconds to a few minutes.\n" +
                "\n" +
                "- To come out, walk your hands back and slowly lift your torso.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Stretches the spine, hips, and thighs.\n" +
                "\n" +
                "✔\uFE0F Relieves lower back and neck tension.\n" +
                "\n" +
                "✔\uFE0F Helps calm the mind and reduce stress.\n" +
                "\n" +
                "✔\uFE0F Improves digestion and blood circulation.\n" +
                "\n" +
                "✔\uFE0F A great resting pose for relaxation.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have knee injuries.\n" +
                "\n" +
                "\uD83D\uDEAB Use a cushion under the knees if needed.\n" +
                "\n" +
                "\uD83D\uDEAB Place a block under your forehead if it doesn’t reach the mat."));


//
        yogaPoses.add(new YogaPose("Bhujangasana", "Strengthens the back and spine.", R.drawable.cobra_pose, "\uD83E\uDDD8 COBRA POSE (BHUJANGSANA) \n" +
                "\n" +
                "Overview: Opens up the chest and shoulders while improving flexibility in the spine.\n" +
                "\n" +
                "● STEP 1: START IN A PRONE POSITION\n" +
                "\n" +
                "- Lie flat on your stomach with your legs extended straight behind you.\n" +
                "\n" +
                "- Keep your feet together or hip-width apart, with the tops of your feet pressing into the mat.\n" +
                "\n" +
                "● STEP 2: POSITION YOUR HANDS\n" +
                "\n" +
                "- Place your palms flat on the mat, directly under your shoulders.\n" +
                "\n" +
                "- Keep your elbows close to your ribs, pointing backward.\n" +
                "\n" +
                "● STEP 3: ENGAGE YOU CORE AND HANDS\n" +
                "\n" +
                "- Press the tops of your feet, thighs, and pelvis into the mat.\n" +
                "\n" +
                "- Engage your abdominal muscles to protect your lower back.\n" +
                "\n" +
                "● STEP 4: LIFT YOUR CHEST\n" +
                "\n" +
                "- Inhale deeply and press into your palms.\n" +
                "\n" +
                "- Slowly lift your chest off the mat, keeping your elbows slightly bent.\n" +
                "\n" +
                "● STEP 5: OPEN YOUR SHOULDERS\n" +
                "\n" +
                "- Roll your shoulders back and down, away from your ears.\n" +
                "\n" +
                "- Keep your neck long and gaze slightly upward.\n" +
                "\n" +
                "● STEP 6: HOLD AND BREATHE\n" +
                "\n" +
                "- Hold the pose for 15-30 seconds while breathing deeply.\n" +
                "\n" +
                "- Feel the stretch in your spine, chest, and abdomen.\n" +
                "\n" +
                "● STEP 7: RELEASE THE POSE\n" +
                "\n" +
                "- Exhale and slowly lower your chest back down to the mat.\n" +
                "\n" +
                "- Rest your forehead on the mat and relax.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Strengthens the spine and back muscles.\n" +
                "\n" +
                "✔\uFE0F Opens the chest and improves posture.\n" +
                "\n" +
                "✔\uFE0F Stretches the shoulders, abdomen, and lungs.\n" +
                "\n" +
                "✔\uFE0F Helps relieve lower back pain.\n" +
                "\n" +
                "✔\uFE0F Boosts energy and reduces fatigue.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have severe back or wrist injuries.\n" +
                "\n" +
                "\uD83D\uDEAB Keep your lower back relaxed; do not overarch.\n" +
                "\n" +
                "\uD83D\uDEAB Modify by keeping elbows bent if needed."));


//
        yogaPoses.add(new YogaPose("Virabhadrasana", "Improves balance and strength.", R.drawable.warrior_pose, "\uD83E\uDDD8 WARRIOR POSE (VIRABHADRASANA) \n" +
                "\n" +
                "Overview: Builds stamina and concentration while stretching the hips and shoulders.\n" +
                "\n" +
                "● STEP 1: START IN A STANDING POSITION\n" +
                "\n" +
                "- Stand tall with your feet hip-width apart in Mountain Pose (Tadasana).\n" +
                "\n" +
                "- Keep your arms relaxed by your sides and take a deep breath.\n" +
                "\n" +
                "● STEP 2: STEP ONE FOOT BACK\n" +
                "\n" +
                "- Take a big step back with your right foot, keeping your left foot forward.\n" +
                "\n" +
                "- Position your back foot at a 45-degree angle while ensuring your front knee is bent at 90 degrees.\n" +
                "\n" +
                "● STEP 3: ALIGN YOUR BODY\n" +
                "\n" +
                "- Ensure your front knee is directly above your ankle.\n" +
                "\n" +
                "- Keep your back leg straight and strong, pressing firmly into the mat.\n" +
                "\n" +
                "● STEP 4: RAISE YOUR ARMS\n" +
                "\n" +
                "- Inhale and lift both arms overhead, keeping them straight.\n" +
                "\n" +
                "- Palms should face each other, and shoulders should stay relaxed.\n" +
                "\n" +
                "● STEP 5: ENGAGE YOUR CORE\n" +
                "\n" +
                "- Tighten your abdominal muscles to maintain balance.\n" +
                "\n" +
                "- Keep your chest lifted and spine elongated.\n" +
                "\n" +
                "● STEP 6: HOLD AND BREATHE\n" +
                "\n" +
                "- Stay in the pose for 20-30 seconds while taking deep breaths.\n" +
                "\n" +
                "- Feel the stretch in your legs, arms, and back.\n" +
                "\n" +
                "● STEP 7: RELEASE AND SWITCH SIDES\n" +
                "\n" +
                "- Exhale and lower your arms while straightening your front leg.\n" +
                "\n" +
                "- Step your back foot forward and return to Mountain Pose.\n" +
                "\n" +
                "- Repeat the same steps on the opposite side.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Strengthens the legs, arms, and core.\n" +
                "\n" +
                "✔\uFE0F Improves balance and stability.\n" +
                "\n" +
                "✔\uFE0F Stretches the hips, chest, and shoulders.\n" +
                "\n" +
                "✔\uFE0F Boosts endurance and stamina.\n" +
                "\n" +
                "✔\uFE0F Enhances focus and concentration.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have knee, hip, or ankle injuries.\n" +
                "\n" +
                "\uD83D\uDEAB Keep your front knee aligned with your ankle to prevent strain.\n" +
                "\n" +
                "\uD83D\uDEAB Modify by keeping your hands on your hips for better balance."));


//        Helps to strengthen the legs and core while enhancing stability.
        yogaPoses.add(new YogaPose("Vrikshasana", "Improves balance and posture.", R.drawable.tree_pose, "\uD83E\uDDD8 Tree Pose (Vrikshasana) \n" +
                "\n" +
                "Overview: Helps to strengthen the legs and core while enhancing stability. \n" +
                "\n" +
                "● Step 1: Start in Mountain Pose\n" +
                "\n" +
                "- Stand tall with your feet together and arms at your sides.\n" +
                "\n" +
                "- Keep your spine straight and shoulders relaxed.\n" +
                "\n" +
                "● Step 2: Shift Your Weight\n" +
                "\n" +
                "- Shift your weight onto your left foot.\n" +
                "\n" +
                "- Keep your left leg strong and engaged.\n" +
                "\n" +
                "● Step 3: Lift Your Right Foot\n" +
                "\n" +
                "- Slowly lift your right foot off the ground.\n" +
                "\n" +
                "- Place the sole of your right foot on your inner left thigh or calf (avoid the knee).\n" +
                "\n" +
                "● Step 4: Balance and Align\n" +
                "\n" +
                "- Keep your left leg straight but avoid locking the knee.\n" +
                "\n" +
                "- Engage your core and find a focal point to help with balance.\n" +
                "\n" +
                "● Step 5: Bring Your Hands to Prayer Position\n" +
                "\n" +
                "- Bring your palms together at your chest in Namaste (Anjali Mudra).\n" +
                "\n" +
                "- Keep your elbows relaxed and shoulders down.\n" +
                "\n" +
                "● Step 6: Extend Your Arms (Optional)\n" +
                "\n" +
                "- If comfortable, raise your arms overhead with palms facing each other.\n" +
                "\n" +
                "- Keep your arms straight but relaxed.\n" +
                "\n" +
                "● Step 7: Hold and Breathe\n" +
                "\n" +
                "- Stay in the pose for 20-30 seconds.\n" +
                "\n" +
                "- Take slow, deep breaths and focus on maintaining balance.\n" +
                "\n" +
                "● Step 8: Release and Switch Sides\n" +
                "\n" +
                "- Slowly lower your right foot back to the ground.\n" +
                "\n" +
                "- Return to Mountain Pose and repeat the steps with the opposite leg.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Improves balance and stability.\n" +
                "\n" +
                "✔\uFE0F Strengthens the legs, ankles, and core.\n" +
                "\n" +
                "✔\uFE0F Enhances focus and concentration.\n" +
                "\n" +
                "✔\uFE0F Stretches the thighs, groin, and spine.\n" +
                "\n" +
                "✔\uFE0F Promotes a sense of calm and relaxation.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have ankle or knee injuries.\n" +
                "\n" +
                "\uD83D\uDEAB If balancing is difficult, place your foot lower (on the calf instead of the thigh).\n" +
                "\n" +
                "\uD83D\uDEAB Practice near a wall for support if needed."));


//        Opens up the chest and spine while energizing the body.
        yogaPoses.add(new YogaPose("Setu Bandhasana", "Strengthens the back and glutes.", R.drawable.bridge_pose, "\uD83E\uDDD8 BRIDGE POSE (SETU BANDHASANA) \n" +
                "\n" +
                "Opens up the chest and spine while energizing the body. \n" +
                "\n" +
                "● STEP 1: LIE DOWN ON YOUR BACK\n" +
                "\n" +
                "- Lie flat on your back on a yoga mat.\n" +
                "\n" +
                "- Keep your arms resting beside your body, palms facing down.\n" +
                "\n" +
                "● STEP 2: BEND YOUR KNEES\n" +
                "\n" +
                "- Bend your knees and place your feet flat on the floor.\n" +
                "\n" +
                "- Keep your feet hip-width apart and close to your buttocks.\n" +
                "\n" +
                "● STEP 3: POSITION YOUR ARMS\n" +
                "\n" +
                "- Keep your arms straight alongside your body.\n" +
                "\n" +
                "- Your fingertips should lightly touch your heels.\n" +
                "\n" +
                "● STEP 4: ENGAGE YOUR CORE AND LIFT HIPS\n" +
                "\n" +
                "- Press your feet and arms into the floor.\n" +
                "\n" +
                "- Slowly lift your hips towards the ceiling while engaging your core and glutes.\n" +
                "\n" +
                "● STEP 5: ADJUST YOUR SHOULDER POSITION\n" +
                "\n" +
                "- Roll your shoulders underneath your body.\n" +
                "\n" +
                "- Clasp your hands together under your back (optional).\n" +
                "\n" +
                "● STEP 6: HOLD AND BREATHE\\\n" +
                "\n" +
                "- Hold the pose for 20-30 seconds.\n" +
                "\n" +
                "- Take slow, deep breaths and keep your thighs parallel.\n" +
                "\n" +
                "● STEP 7: RELEASE THE POSE\n" +
                "\n" +
                "- Unclasp your hands (if clasped).\n" +
                "\n" +
                "- Slowly lower your hips back to the mat.\n" +
                "\n" +
                "● STEP 8: RELAX IN SAVASANA\n" +
                "\n" +
                "- Extend your legs and relax in Corpse Pose (Savasana).\n" +
                "\n" +
                "- Breathe deeply and let your body relax.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Strengthens the back, glutes, and legs.\n" +
                "\n" +
                "✔\uFE0F Opens the chest and improves lung capacity.\n" +
                "\n" +
                "✔\uFE0F Stimulates the thyroid and digestive organs.\n" +
                "\n" +
                "✔\uFE0F Helps relieve stress and mild depression.\n" +
                "\n" +
                "✔\uFE0F Improves posture and spinal flexibility.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have neck or back injuries.\n" +
                "\n" +
                "\uD83D\uDEAB Keep your knees aligned with your hips.\n" +
                "\n" +
                "\uD83D\uDEAB Use a yoga block under your lower back for support if needed."));

//        Calms the brain, relieves stress, and stretches the entire backside of the body.
        yogaPoses.add(new YogaPose("Paschimottanasana", "Stretches the spine and hamstrings.", R.drawable.seated_forward_bend, "\uD83E\uDDD8 SEATED FORWARD BEND (PASCHIMOTTANASANA)\n" +
                "\n" +
                "Overview: Calms the brain, relieves stress, and stretches the entire backside of the body. \n" +
                "\n" +
                "● STEP 1: SIT ON THE FLOOR\n" +
                "\n" +
                "- Sit with your legs extended straight in front of you.\n" +
                "\n" +
                "- Keep your back straight and feet together.\n" +
                "\n" +
                "● STEP 2: ENGAGE YOUR CORE\n" +
                "\n" +
                "- Flex your feet so that your toes point upward.\n" +
                "\n" +
                "- Engage your core and lengthen your spine.\n" +
                "\n" +
                "● STEP 3: INHALE AND STRETCH ARMS UP\n" +
                "\n" +
                "- Raise your arms overhead while inhaling.\n" +
                "\n" +
                "- Stretch your body upward to create length.\n" +
                "\n" +
                "● Step 4: EXHALE AND BEND FORWARD\n" +
                "\n" +
                "- Slowly bend forward from your hips, not your waist.\n" +
                "\n" +
                "- Keep your back straight as you move forward.\n" +
                "\n" +
                "● Step 5: REACH FOR YOUR FEET\n" +
                "\n" +
                "- Try to hold your toes, ankles, or shins, depending on flexibility.\n" +
                "\n" +
                "- Keep your elbows slightly bent and relaxed.\n" +
                "\n" +
                "● Step 6: MAINTAIN THE POSE AND BREATHE\n" +
                "\n" +
                "- Stay in the position for 20-30 seconds.\n" +
                "\n" +
                "- Take slow, deep breaths and relax your neck.\n" +
                "\n" +
                "● Step 7: DEEPEN THE STRETCH\n" +
                "\n" +
                "- With each exhale, try to go deeper into the stretch.\n" +
                "\n" +
                "- Keep your back long rather than rounding it.\n" +
                "\n" +
                "● Step 8: RELEASE THE POSE\n" +
                "\n" +
                "- Inhale and slowly lift your torso back up.\n" +
                "\n" +
                "- Return to a seated position with a straight back.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Stretches the spine, hamstrings, and lower back.\n" +
                "\n" +
                "✔\uFE0F Improves digestion and relieves bloating.\n" +
                "\n" +
                "✔\uFE0F Helps calm the mind and reduce stress.\n" +
                "\n" +
                "✔\uFE0F Stimulates kidney and liver function.\n" +
                "\n" +
                "✔\uFE0F Increases flexibility in the hips and legs.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid if you have a lower back or hamstring injury.\n" +
                "\n" +
                "\uD83D\uDEAB Bend your knees slightly if you have tight hamstrings.\n" +
                "\n" +
                "\uD83D\uDEAB Use a yoga strap around your feet for support if needed."));


//        Enhances awareness of body alignment and promotes mental clarity.
        yogaPoses.add(new YogaPose("Tadasana", "Improves posture and balance.", R.drawable.mountain_pose, "\uD83E\uDDD8 MOUNTAIN POSE (TADASANA) \n" +
                "\n" +
                "Overview: Enhances awareness of body alignment and promotes mental clarity.. \n" +
                "\n" +
                "● STEP 1: STAND TALL\n" +
                "\n" +
                "- Stand with your feet together or hip-width apart.\n" +
                "\n" +
                "- Keep your arms relaxed at your sides.\n" +
                "\n" +
                "● STEP 2: DISTRIBUTE YOUR WEIGHT EVENLY\n" +
                "\n" +
                "- Balance your weight across both feet.\n" +
                "\n" +
                "- Engage your thighs and lift your kneecaps slightly.\n" +
                "\n" +
                "● STEP 3: ALIGN YOUR SPINE\n" +
                "\n" +
                "- Keep your back straight and chest lifted.\n" +
                "\n" +
                "- Relax your shoulders and let them drop away from your ears.\n" +
                "\n" +
                "● STEP 4: ENGAGE YOUR CORE\n" +
                "\n" +
                "- Pull your belly button slightly inward.\n" +
                "\n" +
                "- Lengthen your spine while keeping a natural curve.\n" +
                "\n" +
                "● STEP 5: LIFT YOUR ARMS\n" +
                "\n" +
                "- Raise your arms overhead for a deeper stretch.\n" +
                "\n" +
                "- Keep your palms facing each other or touching.\n" +
                "\n" +
                "● STEP 6: FOCUS AND BREATHE\n" +
                "\n" +
                "Take deep, steady breaths through your nose.\n" +
                "\n" +
                "Hold the position for 30 seconds to 1 minute.\n" +
                "\n" +
                "● STEP 7: RELEASE THE POSE\n" +
                "\n" +
                "Slowly lower your arms (if raised).\n" +
                "\n" +
                "Relax your body while maintaining good posture.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Improves posture and body awareness.\n" +
                "\n" +
                "✔\uFE0F Strengthens the legs, core, and back.\n" +
                "\n" +
                "✔\uFE0F Enhances balance and stability.\n" +
                "\n" +
                "✔\uFE0F Helps relieve stress and anxiety.\n" +
                "\n" +
                "✔\uFE0F Prepares the body for other yoga poses.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid locking your knees to prevent strain.\n" +
                "\n" +
                "\uD83D\uDEAB Keep your feet slightly apart if balancing is difficult.\n" +
                "\n" +
                "\uD83D\uDEAB Practice near a wall for extra support if needed."));


//        Builds endurance and improves posture while engaging multiple muscle groups.
        yogaPoses.add(new YogaPose("Phalakasana", "Strengthens the core and arms.", R.drawable.plank_pose, "\uD83E\uDDD8 PLANK POSE (PHALAKASANA) \n" +
                "\n" +
                "Overview: Builds endurance and improves posture while engaging multiple muscle groups\n" +
                "\n" +
                "● STEP 1: GET INTO POSITION\n" +
                "\n" +
                "- Start in a tabletop position (hands and knees on the mat).\n" +
                "\n" +
                "- Place your hands directly under your shoulders.\n" +
                "\n" +
                "● STEP 2: EXTEND YOUR LEGS\n" +
                "\n" +
                "- Step both feet back, keeping them hip-width apart.\n" +
                "\n" +
                "- Balance on the balls of your feet with heels slightly lifted.\n" +
                "\n" +
                "● STEP 3: ENGAGE YOUR CORE\n" +
                "\n" +
                "- Tighten your abdominal muscles to keep your back straight.\n" +
                "\n" +
                "- Avoid letting your hips drop or rise too high.\n" +
                "\n" +
                "● STEP 4: ALIGN YOUR BODY\n" +
                "\n" +
                "- Keep your head in a neutral position, looking slightly forward.\n" +
                "\n" +
                "- Engage your shoulders and press through your palms.\n" +
                "\n" +
                "● STEP 5: MAINTAIN THE POSITION\n" +
                "\n" +
                "- Breathe deeply and hold the pose for 30 seconds to 1 minute.\n" +
                "\n" +
                "- Keep your body firm and stable throughout.\n" +
                "\n" +
                "● STEP 6: RELEASE THE POSE\n" +
                "\n" +
                "- Lower your knees gently to the mat.\n" +
                "\n" +
                "- Rest in Child’s Pose or lie flat to relax.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Strengthens the core, shoulders, and arms.\n" +
                "\n" +
                "✔\uFE0F Improves posture and stability.\n" +
                "\n" +
                "✔\uFE0F Enhances endurance and balance.\n" +
                "\n" +
                "✔\uFE0F Helps reduce back pain by strengthening the spine.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid arching your back or sagging your hips.\n" +
                "\n" +
                "\uD83D\uDEAB Keep your wrists aligned to prevent strain.\n" +
                "\n" +
                "\uD83D\uDEAB Modify by lowering your knees if needed."));



//        Increases flexibility in the hips and strengthens the legs and torso.
        yogaPoses.add(new YogaPose("Trikonasana", "Stretches the legs, hips, and spine.", R.drawable.triangle_pose, "\uD83E\uDDD8 TRIANGLE POSE (TRIKONASANA) \n" +
                "\n" +
                "Overview: Increases flexibility in the hips and strengthens the legs and torso.\n" +
                "\n" +
                "● STEP 1: GET INTO POSITION\n" +
                "\n" +
                "- Stand tall with feet about 3-4 feet apart.\n" +
                "\n" +
                "- Turn your right foot 90° outward and left foot slightly inward.\n" +
                "\n" +
                "- Align your heels in a straight line.\n" +
                "\n" +
                "● STEP 2: EXTEND YOUR ARMS\n" +
                "\n" +
                "- Stretch your arms parallel to the floor, palms facing down.\n" +
                "\n" +
                "- Keep your shoulders relaxed and chest open.\n" +
                "\n" +
                "● STEP 3: BEND AND REACH\n" +
                "\n" +
                "- Inhale deeply, then exhale as you reach your right arm forward.\n" +
                "\n" +
                "- Slowly lower your right hand to your shin, ankle, or floor outside your right foot.\n" +
                "\n" +
                "● STEP 4: OPEN YOUR CHEST\n" +
                "\n" +
                "- Extend your left arm straight up toward the ceiling.\n" +
                "\n" +
                "- Keep your chest open and gaze up at your left fingertips.\n" +
                "\n" +
                "● STEP 5: HOLD THE POSE\n" +
                "\n" +
                "- Stay in this position for 20-30 seconds.\n" +
                "\n" +
                "- Breathe deeply and maintain balance.\n" +
                "\n" +
                "● STEP 6: RELEASE THE POSE\n" +
                "\n" +
                "- Inhale and slowly rise back to standing.\n" +
                "\n" +
                "- Lower your arms and return to the starting position.\n" +
                "\n" +
                "- Repeat on the left side.\n" +
                "\n" +
                "\uD83C\uDF1F BENEFITS\n" +
                "\n" +
                "✔\uFE0F Stretches the legs, hips, and spine.\n" +
                "\n" +
                "✔\uFE0F Improves balance and flexibility.\n" +
                "\n" +
                "✔\uFE0F Strengthens the legs and core muscles.\n" +
                "\n" +
                "✔\uFE0F Helps in relieving back pain and stress.\n" +
                "\n" +
                "⚠\uFE0F PRECAUTIONS\n" +
                "\n" +
                "\uD83D\uDEAB Avoid overstretching or locking the knees.\n" +
                "\n" +
                "\uD83D\uDEAB Keep your spine elongated, not rounded.\n" +
                "\n" +
                "\uD83D\uDEAB If you feel discomfort, place your lower hand on a block."));

        // ✅ Set the adapter
        YogaAdapter yogaAdapter = new YogaAdapter(yogaPoses, this);
        recyclerViewYoga.setAdapter(yogaAdapter);
    }
}

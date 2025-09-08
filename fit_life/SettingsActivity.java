//package com.example.fit_life;
//
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Spinner;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.app.AppCompatDelegate;
//import androidx.appcompat.widget.SwitchCompat;
//import com.google.firebase.auth.FirebaseAuth;
//
//public class SettingsActivity extends AppCompatActivity {
//
//    private SwitchCompat switchDarkMode, switchSound, switchMusic, switchVoice;
//    private Spinner spinnerLanguage;
//    private Button btnSaveSettings, btnResetSettings, btnLogout;
//    private SharedPreferences sharedPreferences;
//    private SharedPreferences.Editor editor;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_settings);
//
//        // Initialize SharedPreferences
//        sharedPreferences = getSharedPreferences("SettingsPrefs", MODE_PRIVATE);
//        editor = sharedPreferences.edit();
//
//        // Find Views
////        spinnerLanguage = findViewById(R.id.spinnerLanguage);
////        switchDarkMode = findViewById(R.id.switchDarkMode);
//        switchSound = findViewById(R.id.switchSound);
//        switchMusic = findViewById(R.id.switchMusic);
////        switchVoice = findViewById(R.id.switchVoice);
//        btnSaveSettings = findViewById(R.id.btnSaveSettings);
//        btnResetSettings = findViewById(R.id.btnResetSettings);
//        btnLogout = findViewById(R.id.btnLogout); // Logout button
//
//        // Load saved settings
//        loadSettings();
//
//        // Save Settings Button Click
//        btnSaveSettings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                saveSettings();
//                Toast.makeText(SettingsActivity.this, "Settings Saved!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // Reset Settings Button Click
//        btnResetSettings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                resetSettings();
//                Toast.makeText(SettingsActivity.this, "Settings Reset!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // Dark Mode Toggle
//        switchDarkMode.setOnCheckedChangeListener((buttonView, isChecked) -> {
//            if (isChecked) {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//            } else {
//                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//            }
//            saveSettings(); // Save the dark mode state
//        });
//
//        // Logout Button Click
//        btnLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut(); // Logout from Firebase
//                Intent intent = new Intent(SettingsActivity.this, StartActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clears activity stack
//                startActivity(intent);
//                finish();
//            }
//        });
//    }
//
//    // Function to save settings
//    private void saveSettings() {
//        editor.putBoolean("DarkMode", switchDarkMode.isChecked());
//        editor.putBoolean("SoundEnabled", switchSound.isChecked());
//        editor.putBoolean("MusicEnabled", switchMusic.isChecked());
//        editor.putBoolean("VoiceHelperEnabled", switchVoice.isChecked());
//        editor.apply();
//    }
//
//    // Load saved settings
//    private void loadSettings() {
//        switchDarkMode.setChecked(sharedPreferences.getBoolean("DarkMode", false));
//        switchSound.setChecked(sharedPreferences.getBoolean("SoundEnabled", true));
//        switchMusic.setChecked(sharedPreferences.getBoolean("MusicEnabled", true));
//        switchVoice.setChecked(sharedPreferences.getBoolean("VoiceHelperEnabled", true));
//
//        // Apply dark mode setting
//        if (sharedPreferences.getBoolean("DarkMode", false)) {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
//        } else {
//            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//        }
//    }
//
//    // Function to reset settings
//    private void resetSettings() {
//        switchDarkMode.setChecked(false);
//        switchSound.setChecked(true);
//        switchMusic.setChecked(true);
//        switchVoice.setChecked(true);
//        editor.clear(); // Clear all saved preferences
//        editor.apply();
//        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO); // Reset dark mode
//    }
//}
//
//package com.example.fit_life;
//
//import android.content.Intent;
//import android.content.SharedPreferences;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.Toast;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.SwitchCompat;
//import com.google.firebase.auth.FirebaseAuth;
//
//public class SettingsActivity extends AppCompatActivity {
//
//    private SwitchCompat switchSound, switchMusic;
//    private Button btnSaveSettings, btnResetSettings, btnLogout;
//    private SharedPreferences sharedPreferences;
//    private SharedPreferences.Editor editor;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_settings);
//
//        // Initialize SharedPreferences
//        sharedPreferences = getSharedPreferences("SettingsPrefs", MODE_PRIVATE);
//        editor = sharedPreferences.edit();
//
//        // Find Views
//        switchSound = findViewById(R.id.switchSound);
//        switchMusic = findViewById(R.id.switchMusic);
//        btnSaveSettings = findViewById(R.id.btnSaveSettings);
//        btnResetSettings = findViewById(R.id.btnResetSettings);
//        btnLogout = findViewById(R.id.btnLogout);
//
//        // Load saved settings
//        loadSettings();
//
//        // Save Settings Button Click
//        btnSaveSettings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                saveSettings();
//                Toast.makeText(SettingsActivity.this, "Settings Saved!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // Reset Settings Button Click
//        btnResetSettings.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                resetSettings();
//                Toast.makeText(SettingsActivity.this, "Settings Reset!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        // Logout Button Click
//        btnLogout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut(); // Logout from Firebase
//                Intent intent = new Intent(SettingsActivity.this, StartActivity.class);
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clears activity stack
//                startActivity(intent);
//                finish();
//            }
//        });
//    }
//
//    // Function to save settings
//    private void saveSettings() {
//        editor.putBoolean("SoundEnabled", switchSound.isChecked());
//        editor.putBoolean("MusicEnabled", switchMusic.isChecked());
//        editor.apply();
//    }
//
//    // Load saved settings
//    private void loadSettings() {
//        switchSound.setChecked(sharedPreferences.getBoolean("SoundEnabled", true));
//        switchMusic.setChecked(sharedPreferences.getBoolean("MusicEnabled", true));
//    }
//
//    // Function to reset settings
//    private void resetSettings() {
//        switchSound.setChecked(true);
//        switchMusic.setChecked(true);
//        editor.clear(); // Clear all saved preferences
//        editor.apply();
//    }
//}


package com.example.fit_life; // Replace with your actual package name

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import com.google.firebase.auth.FirebaseAuth;

public class SettingsActivity extends AppCompatActivity {

    private SwitchCompat switchSound, switchMusic;
    private Button btnSaveSettings, btnResetSettings, btnLogout;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    private TextView privacyPolicy, termsConditions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        // Initialize SharedPreferences
        sharedPreferences = getSharedPreferences("SettingsPrefs", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        // Find Views
        switchSound = findViewById(R.id.switchSound);
        switchMusic = findViewById(R.id.switchMusic);
        btnSaveSettings = findViewById(R.id.btnSaveSettings);
        btnResetSettings = findViewById(R.id.btnResetSettings);
        btnLogout = findViewById(R.id.btnLogout);
//        privacyPolicy = findViewById(R.id.privacy_policy);
//        termsConditions = findViewById(R.id.terms_conditions);

        // Load saved settings
        loadSettings();

        // Save Settings Button Click
        btnSaveSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveSettings();
                Toast.makeText(SettingsActivity.this, "Settings Saved!", Toast.LENGTH_SHORT).show();
            }
        });

        // Reset Settings Button Click
        btnResetSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resetSettings();
                Toast.makeText(SettingsActivity.this, "Settings Reset!", Toast.LENGTH_SHORT).show();
            }
        });

        // Logout Button Click
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut(); // Logout from Firebase
                Intent intent = new Intent(SettingsActivity.this, StartActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK); // Clears activity stack
                startActivity(intent);
                finish();
            }
        });

        // Privacy Policy Click Listener
//        privacyPolicy.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openWebPage("https://yourwebsite.com/privacy-policy"); // Replace with your actual Privacy Policy link
//            }
//        });
//
//        // Terms & Conditions Click Listener
//        termsConditions.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openWebPage("https://yourwebsite.com/terms-conditions"); // Replace with your actual Terms & Conditions link
//            }
//        });
    }

    // Function to save settings
    private void saveSettings() {
        editor.putBoolean("SoundEnabled", switchSound.isChecked());
        editor.putBoolean("MusicEnabled", switchMusic.isChecked());
        editor.apply();
    }

    // Load saved settings
    private void loadSettings() {
        switchSound.setChecked(sharedPreferences.getBoolean("SoundEnabled", true));
        switchMusic.setChecked(sharedPreferences.getBoolean("MusicEnabled", true));
    }

    // Function to reset settings
    private void resetSettings() {
        switchSound.setChecked(true);
        switchMusic.setChecked(true);
        editor.clear(); // Clear all saved preferences
        editor.apply();
    }

    // Function to open a webpage in a browser
    private void openWebPage(String url) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}


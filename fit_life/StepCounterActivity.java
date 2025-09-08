package com.example.fit_life;

import android.Manifest;
import android.content.pm.PackageManager;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class StepCounterActivity extends AppCompatActivity implements SensorEventListener {

    private SensorManager sensorManager;
    private Sensor stepSensor;
    private TextView stepCountText;
    private ProgressBar progressBar;
    private Button resetButton;
    private int stepCount = 0;
    private int initialStepCount = -1;
    private boolean isSensorAvailable;

    private static final int ACTIVITY_RECOGNITION_REQUEST_CODE = 1;
    private static final String TAG = "StepCounterActivity";

    private final Handler handler = new Handler(Looper.getMainLooper());
    private int lastDisplayedStepCount = 0;
    private boolean hasShownToast = false; // To show the 10000 steps toast only once

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_counter);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Show back arrow
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        stepCountText = findViewById(R.id.stepCountText);
        progressBar = findViewById(R.id.progressBar);
        resetButton = findViewById(R.id.resetButton);

        sensorManager = (SensorManager) getSystemService(SENSOR_SERVICE);

        // Enable the back arrow in the action bar
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Step Counter"); // Optional: Set toolbar title
        }

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACTIVITY_RECOGNITION)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                    new String[]{Manifest.permission.ACTIVITY_RECOGNITION}, ACTIVITY_RECOGNITION_REQUEST_CODE);
        } else {
            initializeStepSensor();
        }

        resetButton.setOnClickListener(view -> resetStepCounter());
    }

    private void initializeStepSensor() {
        if (sensorManager != null) {
            stepSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
            if (stepSensor != null) {
                isSensorAvailable = true;
                sensorManager.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI);
                Log.d(TAG, "Step sensor is available and registered.");
            } else {
                stepCountText.setText("Step Sensor Not Available!");
                Log.e(TAG, "Step Sensor Not Available!");
                isSensorAvailable = false;
            }
        }
    }

    private void resetStepCounter() {
        if (initialStepCount != -1) {
            initialStepCount += stepCount;
        }
        stepCount = 0;
        hasShownToast = false; // Reset the toast shown status
        updateUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (isSensorAvailable) {
            sensorManager.registerListener(this, stepSensor, SensorManager.SENSOR_DELAY_UI);
            Log.d(TAG, "Step sensor registered.");
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isSensorAvailable) {
            sensorManager.unregisterListener(this, stepSensor);
            Log.d(TAG, "Step sensor unregistered.");
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_STEP_COUNTER) {
            Log.d(TAG, "Step Counter Value: " + event.values[0]);

            if (initialStepCount == -1) {
                initialStepCount = (int) event.values[0];
            }
            stepCount = (int) event.values[0] - initialStepCount;

            if (stepCount != lastDisplayedStepCount) {
                lastDisplayedStepCount = stepCount;
                handler.post(this::updateUI);
            }

            // Check if 10,000 steps are completed and toast not yet shown
            if (stepCount >= 10000 && !hasShownToast) {
                hasShownToast = true; // Mark toast as shown
                Toast.makeText(this, "Congratulations! 10,000 steps completed!", Toast.LENGTH_LONG).show();
            }

            Log.d(TAG, "Step detected! Current count: " + stepCount);
        }
    }

    private void updateUI() {
        stepCountText.setText("Steps: " + stepCount);
        progressBar.setProgress(stepCount);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Not needed for step counter
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == ACTIVITY_RECOGNITION_REQUEST_CODE) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                initializeStepSensor();
            } else {
                stepCountText.setText("Permission Denied. Cannot track steps.");
                Log.e(TAG, "Permission denied for Activity Recognition.");
            }
        }
    }

    // Handle back arrow press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish(); // Finish current activity and go back
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


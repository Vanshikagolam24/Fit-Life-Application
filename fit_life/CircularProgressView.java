package com.example.fit_life;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class CircularProgressView extends View {
    private Paint backgroundPaint;
    private Paint progressPaint;
    private Paint textPaint;
    private int progress = 0; // Default 0%

    public CircularProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);

        backgroundPaint = new Paint();
        backgroundPaint.setColor(Color.LTGRAY);
        backgroundPaint.setStyle(Paint.Style.STROKE);
        backgroundPaint.setStrokeWidth(30);
        backgroundPaint.setAntiAlias(true);

        progressPaint = new Paint();
        progressPaint.setColor(Color.parseColor("#03A9F4"));
        progressPaint.setStyle(Paint.Style.STROKE);
        progressPaint.setStrokeWidth(30);
        progressPaint.setAntiAlias(true);

        textPaint = new Paint();
        textPaint.setColor(Color.parseColor("#1A237E"));
        textPaint.setTextSize(50);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        int radius = Math.min(width, height) / 2 - 30;

        // Background circle
        canvas.drawCircle(width / 2, height / 2, radius, backgroundPaint);

        // Progress arc
        float sweepAngle = (360f * progress) / 100f;
        canvas.drawArc(width / 2 - radius, height / 2 - radius,
                width / 2 + radius, height / 2 + radius,
                -90, sweepAngle, false, progressPaint);

        // Text inside
        canvas.drawText(progress + "%", width / 2, height / 2 + 15, textPaint);
    }

    public void setProgress(int progress) {
        this.progress = progress;
        invalidate();
    }

    public int getProgress() {
        return progress;
    }
}

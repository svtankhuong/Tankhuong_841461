package com.example.tankhuong;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Random;

public class TouchGame extends Activity {
    private int score = 0;
    private TextView scoreTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize layout and score text view
        LinearLayout touchGameLayout = new LinearLayout(this);
        touchGameLayout.setOrientation(LinearLayout.VERTICAL);
        scoreTextView = new TextView(this);
        scoreTextView.setText("Score: 0");
        scoreTextView.setTextSize(24);
        scoreTextView.setTextColor(Color.BLACK);
        touchGameLayout.addView(scoreTextView);

        // Custom view for the game
        View myView = new View(this) {
            private Paint paint;
            private Random random;
            private int left, top, right, bottom;

            {
                paint = new Paint();
                random = new Random();
                generateRandomRect();
            }

            private void generateRandomRect() {
                int width = 500;
                int height = 400;
                left = random.nextInt(width + 100);
                top = random.nextInt(height + 100);
                right = left + 200;
                bottom = top + 100;
            }

            @Override
            protected void onDraw(@NonNull Canvas canvas) {
                super.onDraw(canvas);
                paint.setColor(Color.BLUE);
                canvas.drawRect(left, top, right, bottom, paint);
            }

            @Override
            public boolean onTouchEvent(MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    float x = event.getX();
                    float y = event.getY();
                    if (x > left && x < right && y > top && y < bottom) {
                        score++;
                        generateRandomRect();
                        invalidate();  // Redraw the view
                        runOnUiThread(() -> scoreTextView.setText("Score: " + score));
                    }
                }
                return true;
            }
        };

        touchGameLayout.addView(myView);
        setContentView(touchGameLayout);
    }
}

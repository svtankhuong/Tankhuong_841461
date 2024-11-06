package com.example.tankhuong;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Bth3_3 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout layout = new ConstraintLayout(this);
        ConstraintLayout.LayoutParams settingLayout = new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT);
        layout.setLayoutParams(settingLayout);

        LinearLayout mainlayout = new LinearLayout(this);
        mainlayout.setId(View.generateViewId());
        int widthInSp = 300;
        int heightInSp = 400;
        float scaledDensity = getResources().getDisplayMetrics().scaledDensity;
        int widthInPx = (int) (widthInSp * scaledDensity);
        int heightInPx = (int) (heightInSp * scaledDensity);
        LinearLayout.LayoutParams settingMLayout = new LinearLayout.LayoutParams(widthInPx, heightInPx);
        settingMLayout.gravity = Gravity.CENTER;
        mainlayout.setLayoutParams(settingMLayout);

        layout.addView(mainlayout);
        setContentView(layout);

        mainlayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN)
                    Toast.makeText(Bth3_3.this, "Bạn vừa chạm vào màn hình",Toast.LENGTH_SHORT).show();
                return false;
            }
        });
    }
}

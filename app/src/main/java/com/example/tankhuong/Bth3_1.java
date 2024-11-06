package com.example.tankhuong;


import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;

public class Bth3_1 extends AppCompatActivity {
    private OnClickListener listener  = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Toast.makeText(Bth3_1.this, "Sự kiện click Button",Toast.LENGTH_SHORT).show();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Creating ConstraintLayout
        ConstraintLayout appUI = new ConstraintLayout(this);
        LayoutParams positionAppUI = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        appUI.setLayoutParams(positionAppUI);
//        Creating button
        Button button = new Button(this);
        button.setId(View.generateViewId());
        button.setText("Button");
        button.setTextColor(Color.WHITE);
//        Creating purple rectangle with round corners
        GradientDrawable shape = new GradientDrawable();
        shape.setShape(GradientDrawable.RECTANGLE);
        shape.setColor(Color.parseColor("#800080"));
        shape.setCornerRadius(100);
        button.setBackground(shape);
//        Aligning button
        LayoutParams positionButton = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        positionButton.topToTop = LayoutParams.PARENT_ID;
        positionButton.leftToLeft = LayoutParams.PARENT_ID;
        positionButton.rightToRight = LayoutParams.PARENT_ID;
        positionButton.bottomToBottom = LayoutParams.PARENT_ID;
        button.setLayoutParams(positionButton);
//       Creating TextView
        TextView text = new TextView(this);
        text.setId(View.generateViewId());
        text.setText("Hello World!");
//        Aligning TextView
        LayoutParams positionText = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
        positionText.topToBottom = button.getId();
        positionText.leftToLeft =  button.getId();
        positionText.rightToRight = button.getId();
        positionText.setMargins(50,0,0,0);
        text.setLayoutParams(positionText);
//        Add button, text to appUI
        appUI.addView(button);
        appUI.addView(text);

        setContentView(appUI);
        //Handle
        button.setOnClickListener(listener);
    }
}

package com.example.tankhuong;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
public class GameActivity extends Activity
{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        RelativeLayout gameActivity = new RelativeLayout(this);
        gameActivity.setId(RelativeLayout.generateViewId());
        RelativeLayout.LayoutParams positionGameUI = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.MATCH_PARENT,
                RelativeLayout.LayoutParams.MATCH_PARENT
        );
        positionGameUI.setMargins(0, 0, 0, 0);
        gameActivity.setLayoutParams(positionGameUI);

        ImageView androidImage = new ImageView(this);
        androidImage.setId(RelativeLayout.generateViewId());
        androidImage.setImageResource(R.drawable.android);
        RelativeLayout.LayoutParams positionAndroidImg = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                800
        );
        positionAndroidImg.setMargins(0, 0, 0, 40);
        positionAndroidImg.addRule(RelativeLayout.ALIGN_PARENT_TOP);
        positionAndroidImg.addRule(RelativeLayout.CENTER_HORIZONTAL);
        androidImage.setLayoutParams(positionAndroidImg);

        Button button1 = new Button(this);
        button1.setId(RelativeLayout.generateViewId());
        button1.setText("New Game");
        button1.setTextColor(Color.WHITE);
        button1.setBackgroundColor(Color.parseColor("#00008B"));
        RelativeLayout.LayoutParams positionButton1 = new RelativeLayout.LayoutParams(
                400,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        positionButton1.addRule(RelativeLayout.BELOW, androidImage.getId());
        positionButton1.addRule(RelativeLayout.CENTER_HORIZONTAL);
        positionButton1.setMargins(0, 0, 0, 40);
        button1.setLayoutParams(positionButton1);

        Button button2 = new Button(this);
        button2.setId(RelativeLayout.generateViewId());
        button2.setText("Continue Game");
        button2.setTextColor(Color.WHITE);
        button2.setBackgroundColor(Color.parseColor("#00008B"));
        RelativeLayout.LayoutParams positionButton2 = new RelativeLayout.LayoutParams(
                400,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        positionButton2.addRule(RelativeLayout.BELOW, button1.getId());
        positionButton2.addRule(RelativeLayout.CENTER_HORIZONTAL);
        positionButton2.setMargins(0, 0, 0, 40);
        button2.setLayoutParams(positionButton2);

        Button button3 = new Button(this);
        button3.setId(RelativeLayout.generateViewId());
        button3.setText("Help Game");
        button3.setTextColor(Color.WHITE);
        button3.setBackgroundColor(Color.parseColor("#00008B"));
        RelativeLayout.LayoutParams positionButton3 = new RelativeLayout.LayoutParams(
                400,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        positionButton3.addRule(RelativeLayout.BELOW, button2.getId());
        positionButton3.addRule(RelativeLayout.CENTER_HORIZONTAL);
        positionButton3.setMargins(0, 0, 0, 40);
        button3.setLayoutParams(positionButton3);

        Button button4 = new Button(this);
        button4.setId(RelativeLayout.generateViewId());
        button4.setText("Quit Game");
        button4.setTextColor(Color.WHITE);
        button4.setBackgroundColor(Color.parseColor("#00008B"));
        RelativeLayout.LayoutParams positionButton4 = new RelativeLayout.LayoutParams(
                400,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        positionButton4.addRule(RelativeLayout.BELOW, button3.getId());
        positionButton4.addRule(RelativeLayout.CENTER_HORIZONTAL);
        button4.setLayoutParams(positionButton4);

        gameActivity.addView(androidImage);
        gameActivity.addView(button1);
        gameActivity.addView(button2);
        gameActivity.addView(button3);
        gameActivity.addView(button4);

        setContentView(gameActivity);

    }
}

package com.example.tankhuong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;

public class Bth6_1 extends Activity
{
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bth6_1);
        Button btn = (Button) findViewById(R.id.btn6_1);
        ImageView imageView = findViewById(R.id.iv6_1);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.bth6_1_animation);
        imageView.startAnimation(animation);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent getContactInfor = new Intent(getApplicationContext(), Bth6_1_2.class);
                String mess = "Xin chào từ Bth6_1";
                getContactInfor.putExtra("messKey",mess);
                startActivity(getContactInfor);
            }
        });
    }
}

package com.example.tankhuong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Bth6_1_2 extends Activity
{
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bth6_1_2);
        String mess = getIntent().getStringExtra("messKey");
        TextView txt = findViewById(R.id.textView);
        txt.setText(mess);
        Button btn = (Button) findViewById(R.id.btn6_1_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

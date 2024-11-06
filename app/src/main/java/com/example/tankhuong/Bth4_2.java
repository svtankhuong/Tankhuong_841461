package com.example.tankhuong;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import java.util.Date;

public class Bth4_2 extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bth4_2);
        Button btn = findViewById(R.id.btn4_2);
        AlertDialog ad = new AlertDialog.Builder(this).create();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date t = new Date();
                ad.setMessage("Thời gian hiện tại: " + t.toString());
                ad.show();
            }
        });
    }
}

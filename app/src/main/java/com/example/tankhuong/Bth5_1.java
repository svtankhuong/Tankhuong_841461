package com.example.tankhuong;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

public class Bth5_1 extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bth5_1);
        EditText txtName = findViewById(R.id.et);
        EditText txtEmail = findViewById(R.id.et1);
        EditText txtProject = findViewById(R.id.et2);
        Button btn = (Button) findViewById(R.id.btn5_1);
        ProgressBar loading =(ProgressBar) findViewById(R.id.progressBar);
        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setVisibility(View.GONE);
                loading.setVisibility(View.VISIBLE);
                Intent getContactInfor = new Intent(getApplicationContext(), Bth5_1_2.class);
                Bundle bundle = new Bundle();
                bundle.putString("nameKey",txtName.getText().toString());
                bundle.putString("emailKey",txtEmail.getText().toString());
                bundle.putString("projectKey",txtProject.getText().toString());
                getContactInfor.putExtras(bundle);
                startActivity(getContactInfor);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loading.setVisibility(View.GONE);
                        layout.setVisibility(View.VISIBLE);
                    }
                }, 3000);
            }
        });
    }
}

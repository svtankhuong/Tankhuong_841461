package com.example.tankhuong;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class Bth5_1_2 extends Activity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bth5_1_2);
        TextView txtName = findViewById(R.id.data);
        TextView txtEmail = findViewById(R.id.data1);
        TextView txtProject = findViewById(R.id.data2);
        Button btn = (Button) findViewById(R.id.btn5_2);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("nameKey");
        String email = bundle.getString("emailKey");
        String project = bundle.getString("projectKey");
        txtName.setText(name);
        txtEmail.setText(email);
        txtProject.setText(project);
    }
}

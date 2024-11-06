package com.example.tankhuong;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
public class Bth3_2 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout edittextUI = new ConstraintLayout(this);
        LayoutParams positionUI = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
        edittextUI.setPadding(50,0,50,0);
        edittextUI.setLayoutParams(positionUI);

        EditText editText = new EditText(this);
        editText.setId(View.generateViewId());
        editText.setText("Name");
        LayoutParams positionEditText = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
        positionEditText.leftToLeft = LayoutParams.PARENT_ID;
        positionEditText.rightToRight = LayoutParams.PARENT_ID;
        editText.setLayoutParams(positionEditText);

        edittextUI.addView(editText);
        setContentView(edittextUI);

        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View view, int i, KeyEvent keyEvent) {
                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN && i == KeyEvent.KEYCODE_ENTER){
                    String message = editText.getText().toString();
                    Toast.makeText(Bth3_2.this, message, Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });
    }
}

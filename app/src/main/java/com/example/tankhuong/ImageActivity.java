package com.example.tankhuong;
import android.app.Activity;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
//import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android_ex00);
/*        ImageView MyImageView = new ImageView(this);
        MyImageView.setImageResource(R.drawable.android);
        setContentView(MyImageView);*/
    }
}
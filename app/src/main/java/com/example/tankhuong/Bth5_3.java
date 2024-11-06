package com.example.tankhuong;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class Bth5_3 extends Activity {
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu_bth5_3, menu);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bth5_3);

        // Consider using View Binding here
        Button button = findViewById(R.id.button2);
        registerForContextMenu(button);

        button.setOnClickListener(view -> {
            openContextMenu(view);
        });
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        Intent intent;
        switch (item.getItemId()) {
            case R.id.item1:
                intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:(+84)123456789"));
                startActivity(intent);
                return true;
            case R.id.item2:
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("content://contacts/people"));
                intent.setType("image/pictures/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                startActivity(intent);
                return true;
            case R.id.item3:
                intent = new Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:5551234"));
                intent.putExtra("sms_body", "Thu bay nay di choi khong?");
                startActivity(intent);
                return true;
            case R.id.item4:
                intent = new Intent("android.intent.action.MUSIC_PLAYER");
                String url = "http://maps.google.com/maps?saddr=9.938083,-84.054430&daddr=9.926392,-84.055964";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
                return true;
            default:
                return super.onContextItemSelected(item);
        }
    }

}
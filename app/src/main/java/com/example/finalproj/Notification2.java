package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notification2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification2);
    }

    public void unread(View view) {
        Intent intent = new Intent(this, Notification1.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
}
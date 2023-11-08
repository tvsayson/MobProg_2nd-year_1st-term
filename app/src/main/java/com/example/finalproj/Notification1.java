package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Notification1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification1);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }

    public void all(View view) {
        Intent intent = new Intent(this, Notification2.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

}
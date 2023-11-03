package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Personalprof extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personalprof);
    }
    public void settingsBack(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    public void goEdit(View view) {
        Intent intent = new Intent(this, Editp.class);
        startActivity(intent);
    }
}
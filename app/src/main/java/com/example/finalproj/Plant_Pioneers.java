package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Plant_Pioneers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_pioneers);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}
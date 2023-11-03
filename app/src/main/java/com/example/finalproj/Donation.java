package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Donation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donation);
    }
    public void goBackToHome(View view) {
        // Create an intent to navigate back to the main activity
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
    public void goToDonate(View view) {
        // Create an intent to navigate back to the main activity
        Intent intent = new Intent(this, Donate.class);
        startActivity(intent);
    }
}

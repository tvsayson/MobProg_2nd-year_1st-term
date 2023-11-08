package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }

    public void goProf(View view) {
        Intent intent = new Intent(this, Personalprof.class);
        startActivity(intent);
    }
    public void about(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void help(View view) {
        Intent intent = new Intent(this, Contact.class);
        startActivity(intent);
    }

    public void out(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void notif(View view) {
        Intent intent = new Intent(this, Notification1.class);
        startActivity(intent);
    }
}
package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Forgot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void Code(View view) {
        Intent intent = new Intent(this, Code.class);
        startActivity(intent);
    }
}
package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Code extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Forgot.class);
        startActivity(intent);
    }
    public void Verify(View view) {
        Intent intent = new Intent(this, Changepass.class);
        startActivity(intent);
    }

}
package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Privacy_Policy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_privacy_policy);

    }
    public void Editback(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
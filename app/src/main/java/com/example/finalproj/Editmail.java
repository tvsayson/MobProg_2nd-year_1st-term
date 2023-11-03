package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Editmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editmail);
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Editp.class);
        startActivity(intent);
    }
    public void save(View v) {
        Toast.makeText(Editmail.this, "Email Saved", Toast.LENGTH_SHORT).show();
    }
}
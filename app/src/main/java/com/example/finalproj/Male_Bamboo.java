package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

public class Male_Bamboo extends AppCompatActivity {

    TextView details;
    ImageView arrowdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_bamboo);

        details = findViewById(R.id.textView14);
        details.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Male_Bamboo.this, Plant_Detail.class);
                startActivity(intent);
            }
        });
        arrowdown = findViewById(R.id.imageView32);
        arrowdown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Male_Bamboo.this, Plant_Detail.class);
                startActivity(intent);
            }
        });
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Plant.class);
        startActivity(intent);
    }
}
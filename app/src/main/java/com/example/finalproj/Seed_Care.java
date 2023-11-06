package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

import android.os.Bundle;

public class Seed_Care extends AppCompatActivity {
    ImageView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed_care);
        info = findViewById(R.id.info1);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed_Care.this, Seed_Detail.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        });
        ImageView review22;
        review22 = findViewById(R.id.review2);
        review22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed_Care.this, Seed_Reviews.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });

    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Rough_Bamboo.class);
        startActivity(intent);
    }
}
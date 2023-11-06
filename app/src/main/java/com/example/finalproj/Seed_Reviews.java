package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageView;
import android.content.Intent;

import android.os.Bundle;

public class Seed_Reviews extends AppCompatActivity {
    ImageView care22, info22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed_reviews);
        info22 = findViewById(R.id.info3);
        info22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed_Reviews.this, Seed_Detail.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        });
        care22 = findViewById(R.id.care3);
        care22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed_Reviews.this, Seed_Care.class);
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
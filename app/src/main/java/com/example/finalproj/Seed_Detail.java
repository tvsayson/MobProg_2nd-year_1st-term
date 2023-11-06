package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.ImageView;

public class Seed_Detail extends AppCompatActivity {
    ImageView care;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed_detail);

        care = findViewById(R.id.care1);
        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed_Detail.this, Seed_Care.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        });
        ImageView review11;
        review11 = findViewById(R.id.review1);
        review11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed_Detail.this, Seed_Reviews.class);
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
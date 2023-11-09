package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class Bamboo_Bazaar extends AppCompatActivity {
    ImageView Seed, Plant, Furniture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamboo_bazaar);

        Seed = findViewById(R.id.seed);
        Plant = findViewById(R.id.plant);
        Furniture = findViewById(R.id.furniture);

        Seed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bamboo_Bazaar.this, Seed.class);
                startActivity(intent);
            }
        });

        Plant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bamboo_Bazaar.this, Plant.class);
                startActivity(intent);
            }
        });

        Furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bamboo_Bazaar.this, Furniture.class);
                startActivity(intent);
            }
        });
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }

    public void cart(View view) {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
    public void rough(View view) {
        Intent intent = new Intent(this, Rough_Bamboo.class);
        startActivity(intent);
    }
}
package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.content.Intent;

public class Seed extends AppCompatActivity {
    ImageView buyNow1;

    ImageButton backButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seed);
        buyNow1 = findViewById(R.id.buynow1);
        buyNow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Seed.this, Rough_Bamboo.class);
                startActivity(intent);
            }
        });
    }
    public void Editback(View v) {
        Intent intent = new Intent(Seed.this, Bamboo_Bazaar.class);
        startActivity(intent);
    }
}
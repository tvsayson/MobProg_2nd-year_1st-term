package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.content.Intent;
import android.widget.ImageView;

public class Bench_Detail extends AppCompatActivity {
    ImageView care;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bench_detail);

        ImageView openLinkButton = findViewById(R.id.store);

        openLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define the web link you want to open
                String webLink = "https://www.bamboogrovefurniture.com/";

                // Create an intent to open the web link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webLink));

                // Start the activity to open the web link
                startActivity(intent);
            }
        });

        care = findViewById(R.id.care1);
        care.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bench_Detail.this, Bench_Care.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);

            }
        });
        ImageView review11;
        review11 = findViewById(R.id.review1);
        review11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bench_Detail.this, Bench_Review.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(intent);
            }
        });
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Bench.class);
        startActivity(intent);
    }

}
package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.ImageButton;

import android.os.Bundle;

public class Events extends AppCompatActivity {

    TextView SeeMore1;
    TextView SeeMore2;
    ImageButton backButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        SeeMore1 = findViewById(R.id.seemore1);

        SeeMore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, Event1.class);
                startActivity(intent);
            }
        });

        SeeMore2 = findViewById(R.id.seemore2);

        SeeMore2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Events.this, Event2.class);
                startActivity(intent);
            }
        });

        backButton1 = findViewById(R.id.imageButton2);
        backButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

}
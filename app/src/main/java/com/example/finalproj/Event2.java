package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.ImageButton;
import android.os.Bundle;

public class Event2 extends AppCompatActivity {

    ImageButton backButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event2);

        backButton4 = findViewById(R.id.imageButton);

        backButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
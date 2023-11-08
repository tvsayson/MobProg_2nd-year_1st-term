package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Bamboo_Map extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bamboo_map);

        ImageView openLinkButton = findViewById(R.id.map);

        openLinkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define the web link you want to open
                String webLink = "https://www.google.com/maps/search/bamboo+dealers/@14.3657328,121.0549793,10z?entry=ttu";

                // Create an intent to open the web link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webLink));

                // Start the activity to open the web link
                startActivity(intent);
            }
        });
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}
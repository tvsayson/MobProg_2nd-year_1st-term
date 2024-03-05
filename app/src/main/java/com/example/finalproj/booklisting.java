package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.ImageButton;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class booklisting extends AppCompatActivity {
    ImageButton backButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklisting);
        backButton4 = findViewById(R.id.imageButton14);
        backButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void howtobuildwithbamboo(View view) {
        String websiteUrl = "https://z-library.se/book/2707496/0849e2/how-to-build-with-bamboo.html";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void engineeredbamboostructures(View view) {
        String websiteUrl = "https://www.perlego.com/book/3277510/engineered-bamboo-structures-pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void illustrationsofbamboos(View view) {
        String websiteUrl = " https://www.perlego.com/book/3826792/illustrations-of-bamboos-in-china-pdf?queryID=" +
                "63ceabdb2e0fdf3251b708d62ff8b488&index=prod_BOOKS&gridPosition=17 ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bamboogridshells(View view) {
        String websiteUrl = "https://www.perlego.com/book/1562547/bamboo-gridshells-pdf?queryID" +
                "=a8f6b7fc226ac9b255c153fd5852ab95&index=prod_BOOKS&gridPosition=11 ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bambooinvietnam(View view) {
        String websiteUrl = " https://www.perlego.com/book/4214351/bamboo-in-vietnam-an-anthropological-and-historical-approach pdf" +
                "?queryID=3353107857f088258dc60700e3a1edef&index=prod_BOOKS&gridPosition=3";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void farmingbamboo(View view) {
        String websiteUrl = "https://www.perlego.com/book/3277510/engineered-bamboo-structures-pdf";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0); // Disable animation when pressing back button
    }


}
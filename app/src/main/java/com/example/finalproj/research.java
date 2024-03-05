package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class research extends AppCompatActivity {
    ImageButton backButton15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_research);
        backButton15 = findViewById(R.id.imageButton15);
        backButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void establishing(View view) {
        String websiteUrl = " https://www.nestle.com/media/news/nestle-plants-native-bamboo-philippines ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bambootechnoguide(View view) {
        String websiteUrl = " https://www.nestle.com/media/news/nestle-plants-native-bamboo-philippines ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bamboofarming(View view) {
        String websiteUrl = " https://www.nestle.com/media/news/nestle-plants-native-bamboo-philippines ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void application(View view) {
        String websiteUrl = "https://www.hindawi.com/journals/tswj/2020/7284203/ ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void thestructure(View view) {
        String websiteUrl = "https://royalsocietypublishing.org/doi/full/10.1098/rsif.2014.0321 ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void enhancing(View view) {
        String websiteUrl = "https://link.springer.com/chapter/10.1007/978-3-030-99313-9_7 ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bridging(View view) {
        String websiteUrl = "https://www.mdpi.com/2071-1050/16/2/498 ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bambooasa(View view) {
        String websiteUrl = "https://www.sciencedirect.com/science/article/abs/pii/S1389934118304891 ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0); // Disable animation when pressing back button
    }

}
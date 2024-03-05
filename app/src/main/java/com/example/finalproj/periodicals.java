package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class periodicals extends AppCompatActivity {
    ImageButton backButton16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_periodicals);
        backButton16 = findViewById(R.id.imageButton16);
        backButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void da(View view) {
        String websiteUrl = "https://www.facebook.com/groups/bambooforumindia/permalink/6592125787532527/?mibextid=S66gvF ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void greener(View view) {
        String websiteUrl = "https://www.facebook.com/groups/bambooforumindia/permalink/6592125787532527/?mibextid=S66gvF ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void world(View view) {
        String websiteUrl = "https://www.facebook.com/groups/bambooforumindia/permalink/6592125787532527/?mibextid=S66gvF ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void gov(View view) {
        String websiteUrl = "https://www.pna.gov.ph/articles/1218117#:~:text=MANILA%20%E2%80%93%20The%20Philippine%20government%20targets,bamboo%20architecture%20despite%20budgetary%20constraints ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void strategies(View view) {
        String websiteUrl = "https://ispweb.pcaarrd.dost.gov.ph/strategies-for-propagule-and-shoot-production-of-three-bamboo-species/ ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void rizome(View view) {
        String websiteUrl = " https://mb.com.ph/2023/5/29/rizome-invests-100-m-for-engineered-bamboo-plant-in-ph ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void phplans(View view) {
        String websiteUrl = "https://thephilbiznews.com/2020/01/15/ph-plans-to-create-a-19000-hectares-of-bamboo-plantation/ ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void nestle(View view) {
        String websiteUrl = " https://www.nestle.com/media/news/nestle-plants-native-bamboo-philippines";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0); // Disable animation when pressing back button
    }


}
package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class filmcatalogue extends AppCompatActivity {
    ImageButton backButton17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filmcatalogue);
        backButton17 = findViewById(R.id.imageButton17);
        backButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
    public void bamboothetradition(View view) {
        String websiteUrl = "https://www.youtube.com/watch?v=tKcyrlysQwA ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bukidnon(View view) {
        String websiteUrl = "https://www.youtube.com/watch?v=_ED8tsa8wJ0";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bambootheindustry(View view) {
        String websiteUrl = "https://www.youtube.com/watch?v=PMISsNR92DA ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void aguidetobamboo(View view) {
        String websiteUrl = "https://www.youtube.com/watch?v=0Xsp4EdtSlg";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void ironbamboo(View view) {
        String websiteUrl = "https://www.youtube.com/watch?v=7MrQsX0LVAg ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0); // Disable animation when pressing back button
    }
}
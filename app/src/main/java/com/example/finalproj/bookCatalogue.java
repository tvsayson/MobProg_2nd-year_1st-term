package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class bookCatalogue extends AppCompatActivity {

    ImageButton backButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_catalogue);

        backButton3 = findViewById(R.id.imageButton13);
        backButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void sustainablebamboo1234(View view) {
        Intent intent = new Intent(this, bamboodevelopment.class);
        startActivity(intent);
    }
    public void bamboo(View view) {
        String websiteUrl = "https://z-library.se/book/3695982/be99ad/bamboo.html ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bambooandsustainble(View view) {
        String websiteUrl = " https://z-library.se/book/24703402/dd7074/bamboo-and-sustainable-construction.html ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void advancesinbamboo(View view) {
        String websiteUrl = " https://www.sciencedirect.com/journal/advances-in-bamboo-science  ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    public void bamboofibres(View view) {
        String websiteUrl = "https://www.sciencedirect.com/book/9780323857826/bamboo-fibres";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(0, 0); // Disable animation when pressing back button
    }




}

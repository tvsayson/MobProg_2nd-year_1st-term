package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;

public class Catalog_HomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog_home_page);

    }
    public void upload(View view) {
        // Create an intent to navigate back to the main activity
        Intent intent = new Intent(this, userUpload.class);
        startActivity(intent);
    }
    public void books(View view) {
        Intent intent = new Intent(this, bookCatalogue.class);
        startActivity(intent);
    }
    public void booklisting(View view) {
        Intent intent = new Intent(this, booklisting.class);
        startActivity(intent);
    }
    public void research(View view) {
        Intent intent = new Intent(this, research.class);
        startActivity(intent);
    }
    public void periodical(View view) {
        Intent intent = new Intent(this, periodicals.class);
        startActivity(intent);
    }
    public void film(View view) {
        Intent intent = new Intent(this, filmcatalogue.class);
        startActivity(intent);
    }

}
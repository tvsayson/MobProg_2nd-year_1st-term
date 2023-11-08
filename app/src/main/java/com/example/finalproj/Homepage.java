package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.settings) {
                    // Start the new empty activity when the "Settings" item is selected
                    Intent settingsIntent = new Intent(Homepage.this, Settings.class);
                    startActivity(settingsIntent);
                } else if (itemId == R.id.donate) {
                    // Start the new empty activity when the "Donate" item is selected
                    Intent donateIntent = new Intent(Homepage.this, Donation.class);
                    startActivity(donateIntent);
                } else if (itemId == R.id.search) {
                    // Start the new empty activity when the "Search" item is selected
                    Intent searchIntent = new Intent(Homepage.this, Search.class);
                    startActivity(searchIntent);
                }
                return true;
            }

        });
    }
    public void bwpprofile(View view) {
        Intent intent = new Intent(this, BWP_Profile.class);
        startActivity(intent);
    }

    public void aboutus(View view) {
        Intent intent = new Intent(this, About_Us.class);
        startActivity(intent);
    }
    public void events(View view) {
        Intent intent = new Intent(this, Events.class);
        startActivity(intent);
    }
    public void plantpioneer(View view) {
        Intent intent = new Intent(this, Plant_Pioneers.class);
        startActivity(intent);
    }
    public void bazaar(View view) {
        Intent intent = new Intent(this, Bamboo_Bazaar.class);
        startActivity(intent);
    }
    public void map(View view) {
        Intent intent = new Intent(this, Bamboo_Map.class);
        startActivity(intent);
    }

}
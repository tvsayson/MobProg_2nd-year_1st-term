package com.example.login;

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

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();
                if (itemId == R.id.settings) {
                    Toast.makeText(MainActivity4.this, "Settings selected", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.donate) {
                    Toast.makeText(MainActivity4.this, "Donate selected", Toast.LENGTH_SHORT).show();
                } else if (itemId == R.id.search) {
                    Toast.makeText(MainActivity4.this, "Search selected", Toast.LENGTH_SHORT).show();
                }
                return true;
            }
        });
        ImageView Events = findViewById(R.id.events);
        Events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(intent);
            }
        });
        ImageView BambooBazaar = findViewById(R.id.bambooBazaar);
        BambooBazaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(intent);
            }
        });
    }
}
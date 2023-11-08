package com.example.finalproj;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;

public class About extends AppCompatActivity {
    private ImageView donateButton;
    private FrameLayout donationOverlay;
    private ImageView donateImageView;

    private ImageView editImageView1;
    private ImageView editImageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        donateButton = findViewById(R.id.imageView25);
        donateImageView = findViewById(R.id.Thanks);
        donationOverlay = findViewById(R.id.donationOverlay);
        editImageView1 = findViewById(R.id.Cancel);
        editImageView2 = findViewById(R.id.Delete);


        donateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDonateImageView();
            }
        });
    }

    private void showDonateImageView() {
        donateImageView.setVisibility(View.VISIBLE);
        donationOverlay.setVisibility(View.VISIBLE);
        editImageView1.setVisibility(View.VISIBLE);
        editImageView2.setVisibility(View.VISIBLE);
        // Blur the background image
        blurBackground();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            }
        }, 1000);
    }


    private void blurBackground() {
        ConstraintLayout mainLayout = findViewById(R.id.abouts); // Replace with your root layout
        mainLayout.setDrawingCacheEnabled(true);
        mainLayout.buildDrawingCache();
        Bitmap originalBitmap = mainLayout.getDrawingCache();

        // Apply blur effect to the background image
        Bitmap blurredBitmap = BlurUtils.blur(this, originalBitmap, 1);

        mainLayout.setBackground(new BitmapDrawable(getResources(), blurredBitmap));
    }


    public void Editback(View view) {
        Intent intent = new Intent(this, Settings.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
    public void cancel(View view) {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void delete(View view) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void pp(View view) {
        Intent intent = new Intent(this, Privacy_Policy.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }

    public void terms(View view) {
        Intent intent = new Intent(this, Terms.class);
        startActivity(intent);
        overridePendingTransition(0, 0);
    }
}
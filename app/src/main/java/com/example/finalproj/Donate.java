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

public class Donate extends AppCompatActivity {
    private ImageView donateButton;
    private FrameLayout donationOverlay;
    private ImageView donateImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        donateButton = findViewById(R.id.donateButton);
        donateImageView = findViewById(R.id.Thanks);
        donationOverlay = findViewById(R.id.donationOverlay);

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
        // Blur the background image
        blurBackground();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                hideDonateImageView();
            }
        }, 2000);
    }

    private void hideDonateImageView() {
        donateImageView.setVisibility(View.GONE);
        donationOverlay.setVisibility(View.GONE);
    }

    private void blurBackground() {
        ConstraintLayout mainLayout = findViewById(R.id.Donates); // Replace with your root layout
        mainLayout.setDrawingCacheEnabled(true);
        mainLayout.buildDrawingCache();
        Bitmap originalBitmap = mainLayout.getDrawingCache();

        // Apply blur effect to the background image
        Bitmap blurredBitmap = BlurUtils.blur(this, originalBitmap, 1);

        mainLayout.setBackground(new BitmapDrawable(getResources(), blurredBitmap));
    }

    public void tyDon(View view) {
        // Create an intent to navigate back to the main activity
        Intent intent = new Intent(this, Donation.class);
        startActivity(intent);
    }
}

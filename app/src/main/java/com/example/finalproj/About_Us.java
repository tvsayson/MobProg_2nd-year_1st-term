package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class About_Us extends AppCompatActivity {
    private NestedScrollView scrollView;
    private ImageView customBackToTopButton;
    private boolean buttonVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        scrollView = findViewById(R.id.scrollView);
        customBackToTopButton = findViewById(R.id.backtotop);
        customBackToTopButton.setVisibility(View.GONE);
        scrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {

                if (scrollY > oldScrollY) {

                    customBackToTopButton.setVisibility(View.VISIBLE);
                    buttonVisible= true;
                } else if (scrollY < oldScrollY && buttonVisible) {
                    customBackToTopButton.setVisibility(View.VISIBLE);
                    buttonVisible = false;
                } else {
                    customBackToTopButton.setVisibility(View.GONE);
                }
            }
        });

        // Set a click listener for the "Back to Top" button
        customBackToTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Scroll back to the top when the custom button is clicked
                scrollView.smoothScrollTo(0, 0);
                customBackToTopButton.setVisibility(View.GONE);
                buttonVisible = false;
            }
        });
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}


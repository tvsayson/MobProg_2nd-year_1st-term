package com.example.finalproj;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import androidx.appcompat.app.AppCompatActivity;

public class About_Us extends AppCompatActivity {

    private ScrollView scrollView;
    private Button backToTopButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        scrollView = findViewById(R.id.scrollView);
        backToTopButton = findViewById(R.id.backToTopButton);

        // Set a scroll listener to show/hide the "back to top" button
        scrollView.getViewTreeObserver().addOnScrollChangedListener(() -> {
            if (scrollView.getScrollY() > 0) {
                backToTopButton.setVisibility(View.VISIBLE);
            } else {
                backToTopButton.setVisibility(View.GONE);
            }
        });

        // Scroll to the top when the "back to top" button is clicked
        backToTopButton.setOnClickListener(view -> {
            scrollView.smoothScrollTo(0, 0);
        });
    }
}

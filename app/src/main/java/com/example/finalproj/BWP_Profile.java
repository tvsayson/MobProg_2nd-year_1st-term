package com.example.finalproj;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class BWP_Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bwp_profile);

        // Find the ImageView items by their IDs
        ImageView page0 = findViewById(R.id.profile);
        ImageView page1 = findViewById(R.id.page1);
        ImageView page2 = findViewById(R.id.page2);
        ImageView page3 = findViewById(R.id.page3);
        ImageView page4 = findViewById(R.id.page4);
        ImageView page5 = findViewById(R.id.page5);
        ImageView page6 = findViewById(R.id.page6);
        ImageView page7 = findViewById(R.id.page7);
        ImageView page8 = findViewById(R.id.page8);
        ImageView page9 = findViewById(R.id.page9);
        ImageView page10 = findViewById(R.id.page10);

        // Set click listeners for each ImageView to open a link
        setClickListener(page0, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile.pdf");
        setClickListener(page1, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page01-scaled.jpg");
        setClickListener(page2, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page02-scaled.jpg");
        setClickListener(page3, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page03-scaled.jpg");
        setClickListener(page4, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page04-scaled.jpg");
        setClickListener(page5, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page05-scaled.jpg");
        setClickListener(page6, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page06-scaled.jpg");
        setClickListener(page7, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page07-scaled.jpg");
        setClickListener(page8, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page08-scaled.jpg");
        setClickListener(page9, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page09-scaled.jpg");
        setClickListener(page10, "https://bamboowarriors.ph/wp-content/uploads/2023/02/BWP-Profile-_page10-scaled.jpg");
    }

    private void setClickListener(final ImageView imageView, final String url) {
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to open the web link
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
    }
    public void Editback(View view) {
        Intent intent = new Intent(this, Homepage.class);
        startActivity(intent);
    }
}

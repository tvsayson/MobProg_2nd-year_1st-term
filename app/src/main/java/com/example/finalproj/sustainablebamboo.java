package com.example.finalproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.app.DownloadManager;
import android.content.Context;
import android.os.Environment;


public class sustainablebamboo extends AppCompatActivity {
    ImageView downloadButton = findViewById(R.id.imageView80);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sustainablebamboo);
        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Replace "fileUrl" with the URL of the file you want to download
                String fileUrl = "https://www.unido.org/sites/default/files/2010-01/Guidelines_for_cultivating_Ethiopian_lowland_bamboo_0.pdf";

                // Replace "fileName" with the desired name for the downloaded file
                String fileName = "sustainablebamboodevelopment.pdf";

                // Create a DownloadManager.Request with the file URL
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(fileUrl));

                // Set the destination file path where the downloaded file will be saved
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, fileName);

                // Get the DownloadManager system service
                DownloadManager downloadManager = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);

                // Enqueue the download request
                long downloadId = downloadManager.enqueue(request);

                // Optionally, you can listen for download completion using a BroadcastReceiver
                // and handle further actions such as showing a notification or opening the downloaded file
            }
        });
    }

    public void startreading(View view) {
        String websiteUrl = " https://z-library.se/book/3497840/586ff2/sustainable-bamboo-development.html  ";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));
        startActivity(intent);
    }



}
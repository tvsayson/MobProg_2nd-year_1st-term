package com.example.finalproj;

import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.OpenableColumns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class userUpload extends AppCompatActivity {
    private static final int FILE_PICKER_REQUEST_CODE = 1;
    private Button uploadButton;
    private Uri selectedFileUri;
    private String fileName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_upload);
        uploadButton = findViewById(R.id.uploadButton);

        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFilePicker();
            }
        });
    }

    public void openFilePicker() {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        intent.setType("application/pdf");
        intent.addCategory(Intent.CATEGORY_OPENABLE);
        startActivityForResult(Intent.createChooser(intent, "Select File"), FILE_PICKER_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FILE_PICKER_REQUEST_CODE && resultCode == RESULT_OK) {
            selectedFileUri = data.getData();
            fileName = getFileName(selectedFileUri);
            uploadButton.setText(fileName);
            sendEmail();
        }
    }
    private String getFileName(Uri uri) {
        String result = null;
        if (uri.getScheme().equals("content")) {
            Cursor cursor = getContentResolver().query(uri, null, null, null, null);
            if (cursor != null) {
                try {
                    int nameIndex = cursor.getColumnIndex(OpenableColumns.DISPLAY_NAME);
                    if (cursor.moveToFirst()) {
                        result = cursor.getString(nameIndex);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    cursor.close();
                }
            }
        }
        if (result == null) {
            result = uri.getLastPathSegment();
        }
        return result;
    }


    private void sendEmail() {
        if (selectedFileUri != null && fileName != null) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("plain/text");
            intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"info@bamboowarriors.ph"});
            intent.putExtra(Intent.EXTRA_SUBJECT, "User Upload: " + fileName);
            intent.putExtra(Intent.EXTRA_TEXT, "Please find the attached file.\n\n" +
                    "Author: " + ((EditText) findViewById(R.id.author)).getText().toString() + "\n" +
                    "Date: " + ((EditText) findViewById(R.id.year2)).getText().toString() + "/" +
                    ((EditText) findViewById(R.id.month2)).getText().toString() + "/" +
                    ((EditText) findViewById(R.id.day2)).getText().toString() + "\n" +
                    "Category: " + ((EditText) findViewById(R.id.category)).getText().toString() + "\n" +
                    "Description: " + ((EditText) findViewById(R.id.descriptionEditText)).getText().toString());
            intent.putExtra(Intent.EXTRA_STREAM, selectedFileUri);

            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }
    }
}

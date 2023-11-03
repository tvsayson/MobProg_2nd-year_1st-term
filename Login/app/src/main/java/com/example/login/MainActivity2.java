package com.example.login;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    EditText username1, firstname1, lastname1, emailaddress1, firstpassword1, reenterPass1, phonenumber1, month1, day1, year1 ;
    ImageView Google, Facebook, Twitter;
    Button login21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        username1 = findViewById(R.id.username);
        firstname1 = findViewById(R.id.firstname);
        lastname1 = findViewById(R.id.lastname);
        emailaddress1 = findViewById(R.id.emailaddress);
        firstpassword1 = findViewById(R.id.password4);
        reenterPass1 = findViewById(R.id.reenterpass);
        phonenumber1 = findViewById(R.id.phonenumber);
        month1 = findViewById(R.id.month);
        day1 = findViewById(R.id.day);
        year1 = findViewById(R.id.year);
        login21 = findViewById(R.id.login2);
        Google = findViewById(R.id.google);
        Facebook = findViewById(R.id.facebook);
        Twitter = findViewById(R.id.twitter);

        ImageButton backButton = findViewById(R.id.imageButton3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Perform your back action here
                finish(); // Finish the current activity and go back to the previous one
            }
        });


        login21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = username1.getText().toString();
                String firstname = firstname1.getText().toString();
                String lastname = lastname1.getText().toString();
                String emailaddress = emailaddress1.getText().toString();
                String firstpassword = firstpassword1.getText().toString();
                String reenterpass = reenterPass1.getText().toString();
                String phonenumber = phonenumber1.getText().toString();
                String month = month1.getText().toString();
                String day = day1.getText().toString();
                String year = year1.getText().toString();

                if (username.isEmpty() || firstname.isEmpty() || lastname.isEmpty() || emailaddress.isEmpty() || firstpassword.isEmpty() || reenterpass.isEmpty() || phonenumber.isEmpty() || month.isEmpty() || day.isEmpty() || year.isEmpty() ) {
                    Toast.makeText(MainActivity2.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(MainActivity2.this, "You have created your account", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
                    startActivity(intent);
                }
            }
        });

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define the URL of the website you want to open
                String websiteUrl = "https://tinyurl.com/y5cz2tu7";

                // Create an Intent to open a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));

                // Start the web browser activity
                startActivity(intent);
            }
        });
        Facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define the URL of the website you want to open
                String websiteUrl = "https://www.facebook.com/";

                // Create an Intent to open a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));

                // Start the web browser activity
                startActivity(intent);
            }
        });
        Twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define the URL of the website you want to open
                String websiteUrl = "https://twitter.com/";

                // Create an Intent to open a web browser
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(websiteUrl));

                // Start the web browser activity
                startActivity(intent);
            }
        });
    }
}

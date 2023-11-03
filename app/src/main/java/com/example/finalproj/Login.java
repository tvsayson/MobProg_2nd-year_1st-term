package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {

    EditText email, password;
    Button login;
    TextView forgotPassword, register, skipfornow;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);
        forgotPassword = findViewById(R.id.forgotPassword);
        register = findViewById(R.id.Register);
        skipfornow = findViewById(R.id.SkipforNow);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();

                String approvedEmail = "mobprog@gmail.com";
                String approvedPassword = "mobprog";


                if (emailText.isEmpty() || passwordText.isEmpty()) {
                    Toast.makeText(Login.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                } else if (emailText.equals(approvedEmail) && passwordText.equals(approvedPassword)) {
                    // Correct username and password
                    Toast.makeText(Login.this, "Logged in successfully", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(Login.this, Homepage.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(Login.this, "Incorrect username or password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Create_Account.class);
                startActivity(intent);
            }

        });
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Forgot.class);
                startActivity(intent);
            }
        });

        skipfornow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}
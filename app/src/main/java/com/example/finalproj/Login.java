package com.example.finalproj;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import androidx.annotation.NonNull;
import android.content.Intent;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;

import com.google.firebase.auth.FirebaseAuth;


public class Login extends AppCompatActivity {

    private EditText email4, password4;
    private Button login1;
    private TextView forgotPassword1, register1, skipfornow1;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email4 = findViewById(R.id.email123);
        password4 = findViewById(R.id.password123);
        login1 = findViewById(R.id.login);
        forgotPassword1 = findViewById(R.id.forgotPassword);
        skipfornow1 = findViewById(R.id.SkipforNow5);

        auth = FirebaseAuth.getInstance();

        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = email4.getText().toString();
                String pass = password4.getText().toString();
                if (!email.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                    if (!pass.isEmpty()) {
                        auth.signInWithEmailAndPassword(email, pass)
                                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                                    @Override
                                    public void onSuccess(AuthResult authResult) {
                                        Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                                        startActivity(new Intent(Login.this, Homepage.class));
                                        finish();
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(Login.this, "Login Failed", Toast.LENGTH_SHORT).show();
                                    }
                                });
                    } else {
                        password4.setError("Empty fields are not allowed");
                    }
                } else if (email.isEmpty()) {
                    email4.setError("Empty fields are not allowed");
                } else {
                    email4.setError("Please enter correct email");
                }
            }
        });

        register1 = findViewById(R.id.Register5);

        register1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Create_Account.class);
                startActivity(intent);
            }

        });
        forgotPassword1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Login.this, "Password reset link sent to your email", Toast.LENGTH_SHORT).show();
            }
        });

        skipfornow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this, Homepage.class);
                startActivity(intent);
            }
        });
    }
}

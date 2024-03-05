package com.example.finalproj;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import android.widget.ImageView;

import java.util.HashMap;


public class Create_Account extends AppCompatActivity {

    EditText username1, firstname1, lastname1, emailaddress1, firstpassword1, reenterPass1, phonenumber1, month1, day1, year1 ;
    ImageView Google, Facebook, Twitter;
    Button login21, signinbutton;
    FirebaseAuth auth;
    FirebaseDatabase database;
    GoogleSignInClient mGoogleSignInClient;

    int RC_SIGN_IN = 20;

    private void googleSignIn(){
        Intent intent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(intent, RC_SIGN_IN);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==RC_SIGN_IN){

            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {

                GoogleSignInAccount account = task.getResult(ApiException.class);
                firebaseAuth(account.getIdToken());
            } catch (ApiException e) {

                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();;
            }
        }
    }

    private void firebaseAuth(String idToken) {
        AuthCredential credential = GoogleAuthProvider.getCredential(idToken, null);
        auth.signInWithCredential(credential)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            FirebaseUser user = auth.getCurrentUser();

                            HashMap<String,Object> map = new HashMap<>();
                            map.put("id", user.getUid());
                            map.put("name", user.getDisplayName());
                            map.put("profile", user.getPhotoUrl().toString());

                            database.getReference().child("users").child(user.getUid()).setValue(map);
                            Intent intent = new Intent(Create_Account.this, Homepage.class);
                            startActivity(intent);


                        }
                        else{
                            Toast.makeText(Create_Account.this, "Log-In Failed", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        auth = FirebaseAuth.getInstance();
        database = FirebaseDatabase.getInstance();

        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestIdToken(getString(R.string.default_web_client_id))
                .requestEmail().build();

        mGoogleSignInClient = GoogleSignIn.getClient(this,gso);

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
        signinbutton = findViewById(R.id.login2);
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

        signinbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailaddress1.getText().toString().trim();
                String pass = firstpassword1.getText().toString().trim();
                String reenterPass = reenterPass1.getText().toString().trim();
                String username = username1.getText().toString().trim();
                String firstName = firstname1.getText().toString().trim();
                String lastName = lastname1.getText().toString().trim();
                String phoneNumber = phonenumber1.getText().toString().trim();
                String month = month1.getText().toString().trim();
                String day = day1.getText().toString().trim();
                String year = year1.getText().toString().trim();

                if (email.isEmpty()) {
                    emailaddress1.setError("Email cannot be empty");
                } else if (pass.isEmpty()) {
                    firstpassword1.setError("Password cannot be empty");
                } else if (!pass.equals(reenterPass)) {
                    reenterPass1.setError("Passwords do not match");
                } else {
                    auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                // SignUp successful
                                String userId = auth.getCurrentUser().getUid();

                                // Create a User object with additional information
                                User newUser = new User(username, firstName, lastName, email, phoneNumber, month, day, year);

                                // Save user information to Firebase Realtime Database
                                DatabaseReference userRef = FirebaseDatabase.getInstance().getReference("users");
                                userRef.child(userId).setValue(newUser);

                                Toast.makeText(Create_Account.this, "SignUp Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(Create_Account.this, Login.class));
                            } else {
                                // SignUp failed
                                Toast.makeText(Create_Account.this, "SignUp Failed: " + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        Google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                googleSignIn();

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


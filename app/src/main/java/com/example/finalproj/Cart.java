package com.example.finalproj;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart);
    }

    public void Editback(View view) {
        Intent intent = new Intent(this, Bamboo_Bazaar.class);
        startActivity(intent);
    }

    public void checkout(View view) {
        Intent intent = new Intent(this, Checkout.class);
        startActivity(intent);
    }
}
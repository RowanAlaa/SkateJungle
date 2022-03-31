package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Skateboards extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skateboards);
    }
    public void launchThirdActivity(View view){
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
}
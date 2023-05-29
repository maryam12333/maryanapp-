package com.example.myapplicationg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Main6 extends AppCompatActivity {
    Button buttonHOME;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        buttonHOME=findViewById(R.id.buttonHome);
        buttonHOME.setOnClickListener(view -> {
            Intent intent=new Intent(Main6.this,MainActivity.class);
            startActivity(intent);
        });
    }
}
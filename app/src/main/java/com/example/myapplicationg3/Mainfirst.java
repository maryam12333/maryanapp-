package com.example.myapplicationg3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mainfirst extends AppCompatActivity {
    Button button2,button3,button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainfirst);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);


        button2.setOnClickListener(view -> {
            Intent intent=new Intent(Mainfirst.this,Mainsecond.class);
            startActivity(intent);
        });
        button3.setOnClickListener(view -> {
            Intent intent=new Intent(Mainfirst.this,Mainthird.class);
            startActivity(intent);
        });
        button4.setOnClickListener(view -> {
            Intent intent = new Intent(Mainfirst.this,Main4.class);
            startActivity(intent);
        });
    }
}
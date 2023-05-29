package com.example.myapplicationg3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Main4 extends AppCompatActivity {
    Button button,button6,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        button=findViewById(R.id.btn_main4_3);
        button6=findViewById(R.id.btn_main4_6);
        button11=findViewById(R.id.btn_main4_11);


       button.setOnClickListener(view -> {
           Intent intent=new Intent(Main4.this,Main5.class);
           startActivity(intent);
       });
        button6.setOnClickListener(view -> {
            Intent intent=new Intent(Main4.this,Main5.class);
            startActivity(intent);
        });
        button11.setOnClickListener(view -> {
            Intent intent=new Intent(Main4.this,Main5.class);
            startActivity(intent);
        });
    }
}
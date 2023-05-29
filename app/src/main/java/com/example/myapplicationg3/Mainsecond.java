package com.example.myapplicationg3;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Mainsecond extends AppCompatActivity {
    Button button7,button8,button9;

    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainsecond);
        button7=findViewById(R.id.btn_mainsecod_7);
        button8=findViewById(R.id.btn_mainsecond_8);
        button9=findViewById(R.id.btn_mainsecond_9);


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainsecond.this,Main5.class);
                startActivity(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainsecond.this,Main5.class);
                startActivity(intent);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainsecond.this,Main5.class);
                startActivity(intent);
            }
        });
    }
}
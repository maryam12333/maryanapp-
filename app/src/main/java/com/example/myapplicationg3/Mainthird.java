package com.example.myapplicationg3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mainthird extends AppCompatActivity {
    Button button6,button10,button11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainthird);
        button6=findViewById(R.id.btn_mainthird_6);
        button10=findViewById(R.id.btn_mainthird_10);
        button11=findViewById(R.id.btn_mainthird_11);




        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainthird.this,Main5.class);
                startActivity(intent);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainthird.this,Main5.class);
                startActivity(intent);
            }
        });
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Mainthird.this,Main5.class);
                startActivity(intent);
            }
        });

    }
}
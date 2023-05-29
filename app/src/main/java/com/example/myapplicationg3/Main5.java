package com.example.myapplicationg3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main5 extends AppCompatActivity {
     EditText editTextNumber;
     Button buttonEnter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        editTextNumber=findViewById(R.id.editTextNumber);
        buttonEnter=findViewById(R.id.buttonEnter);

        buttonEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Main5.this,Main6.class);
                startActivity(intent);
            }
        });
/*
        buttonEnter.setOnClickListener(view -> {
            String userInput = editTextNumber.getText().toString();
            if (!userInput.isEmpty()) {
                int number = Integer.parseInt(userInput);
                // Do something with the entered number
                // For example, display it in a Toast message
                Toast.makeText(Main5.this, "Entered Number: " + number, Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Main5.this, "Please enter a number", Toast.LENGTH_SHORT).show();
            }


        });*/





    }
}
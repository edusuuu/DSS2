package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_page);

            Button btnFast = findViewById(R.id.btnFast);
            Button btnResto = findViewById(R.id.btnResto);
            Button btnAbout = findViewById(R.id.btnAbout);
            ImageView back = findViewById(R.id.btnBack);
            back.setClickable(true);
            Intent intent =getIntent();

            btnAbout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(MainPage.this , AboutUs.class);
                    startActivity(i);
                }
            });

            btnFast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intentA = new Intent(MainPage.this , FastFood.class);
                    Toast.makeText(MainPage.this, "Loading page...", Toast.LENGTH_SHORT).show();
                    startActivity(intentA);
                }
            });
            btnResto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                Intent intentB = new Intent(MainPage.this , Restaurant.class);
                    Toast.makeText(MainPage.this, "Loading page...", Toast.LENGTH_SHORT).show();
                    startActivity(intentB);
                }
            });

            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(MainPage.this , LogInPage.class);
                    Toast.makeText(MainPage.this, "Returning...", Toast.LENGTH_SHORT).show();

                    startActivity(intent);
                }
            });
        }
    }

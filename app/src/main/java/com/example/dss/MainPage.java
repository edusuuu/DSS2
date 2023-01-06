package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainPage extends AppCompatActivity {

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main_page);

            Button btnFast = findViewById(R.id.btnFast);
            Button btnResto = findViewById(R.id.btnResto);
            Intent intent =getIntent();

            btnFast.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    setContentView(R.layout.revpage);
                }
            });
            btnResto.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    setContentView(R.layout.activity_restaurant);
                }
            });
        }
    }

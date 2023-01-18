package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_restaurant);

        ImageView back = findViewById(R.id.btnBack);
        ImageView beanery = findViewById(R.id.beanery);
        ImageView pzhut = findViewById(R.id.pzhut);
        ImageView maxs = findViewById(R.id.maxs);
        ImageView amara = findViewById(R.id.terrace);
        ImageView tgif = findViewById(R.id.tgif);
        ImageView shakeys = findViewById(R.id.shakeys);
        ImageView dominos = findViewById(R.id.dominos);
        ImageView ycab = findViewById(R.id.ycab);
        ImageView cproj = findViewById(R.id.ycab1);


        back.setClickable(true);
        beanery.setClickable(true);
        pzhut.setClickable(true);
        maxs.setClickable(true);
        amara.setClickable(true);
        tgif.setClickable(true);
        shakeys.setClickable(true);
        dominos.setClickable(true);
        ycab.setClickable(true);
        cproj.setClickable(true);

        beanery.bringToFront();
        pzhut.bringToFront();
        maxs.bringToFront();
        amara.bringToFront();
        tgif.bringToFront();
        shakeys.bringToFront();
        ycab.bringToFront();
        dominos.bringToFront();
        cproj.bringToFront();


        Intent intent = getIntent();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , MainPage.class);
                Toast.makeText(Restaurant.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });

        beanery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , TheBeanery.class);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        pzhut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , Pizzahut.class);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        maxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , Maxs.class);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        shakeys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , activity_shakeys.class);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        ycab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , activity_yellowcab.class);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        amara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , AmarahsCorner.class);
                Toast.makeText(Restaurant.this, "Loading page..." , Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        tgif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , TGIFridays.class);
                Toast.makeText(Restaurant.this, "Loading page..." , Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        dominos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , Dominos.class);
                Toast.makeText(Restaurant.this, "Loading page..." , Toast.LENGTH_SHORT).show();
                startActivity(intent);

            }
        });

        cproj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , CoffeeProject.class);
                Toast.makeText(Restaurant.this, "Loading page..." , Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });



    }
}
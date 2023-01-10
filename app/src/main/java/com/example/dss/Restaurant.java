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
        ImageView terrace = findViewById(R.id.terrace);
        ImageView tgif = findViewById(R.id.tgif);
        ImageView shakeys = findViewById(R.id.shakeys);
        ImageView dominos = findViewById(R.id.dominos);
        ImageView ycab = findViewById(R.id.ycab);

        back.setClickable(true);
        beanery.setClickable(true);
        pzhut.setClickable(true);
        maxs.setClickable(true);
        terrace.setClickable(true);
        tgif.setClickable(true);
        shakeys.setClickable(true);
        dominos.setClickable(true);
        ycab.setClickable(true);

        beanery.bringToFront();
        pzhut.bringToFront();
        maxs.bringToFront();
        terrace.bringToFront();
        tgif.bringToFront();
        shakeys.bringToFront();
        ycab.bringToFront();
        dominos.bringToFront();


        Intent intent = getIntent();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_main_page);
                Intent intent = new Intent(Restaurant.this , MainPage.class);
                Toast.makeText(Restaurant.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(intent);

            }
        });

        beanery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_the_beanery);
                Intent intent = new Intent(Restaurant.this , TheBeanery.class);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        pzhut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , Pizzahut.class);
                setContentView(R.layout.activity_pizzahut);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
        maxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , Maxs.class);
                setContentView(R.layout.activity_maxs);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        shakeys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , activity_shakeys.class);
                setContentView(R.layout.activity_shakeys);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        ycab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Restaurant.this , activity_yellowcab.class);
                setContentView(R.layout.activity_yellowcab);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });




    }
}
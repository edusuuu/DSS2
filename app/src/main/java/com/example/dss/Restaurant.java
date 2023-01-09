package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Restaurant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);
        ImageView beanery = findViewById(R.id.beanery);
        ImageView pzhut = findViewById(R.id.pzhut);
        ImageView maxs = findViewById(R.id.maxs);
        ImageView terrace = findViewById(R.id.terrace);
        ImageView tgif = findViewById(R.id.tgif);
        ImageView shakeys = findViewById(R.id.shakeys);
        ImageView dominos = findViewById(R.id.dominos);
        ImageView ycab = findViewById(R.id.ycab);

        beanery.setClickable(true);
        pzhut.setClickable(true);
        maxs.setClickable(true);
        terrace.setClickable(true);
        tgif.setClickable(true);
        shakeys.setClickable(true);
        dominos.setClickable(true);
        ycab.setClickable(true);



        beanery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_the_beanery);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
            }
        });

        pzhut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_pizzahut);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
            }
        });
        maxs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_maxs);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
            }
        });

        shakeys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_shakeys);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
            }
        });

        ycab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_yellowcab);
                Toast.makeText(Restaurant.this, "Loading page...", Toast.LENGTH_SHORT).show();
            }
        });




    }
}
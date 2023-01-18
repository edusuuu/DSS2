package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class FastFood extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fast_food);

        ImageView back = findViewById(R.id.btnBack);
        ImageView jollibee = findViewById(R.id.jollibee);
        ImageView chowking = findViewById(R.id.chowking);
        ImageView mcdo = findViewById(R.id.mcdo);
        ImageView kfc = findViewById(R.id.kfc);
        ImageView greenwich = findViewById(R.id.greenwich);
        ImageView bgking = findViewById(R.id.burgerking);
        ImageView mangina = findViewById(R.id.manginasal);
        ImageView scuisine = findViewById(R.id.scuisinee);

        back.setClickable(true);
        jollibee.setClickable(true);
        chowking.setClickable(true);
        mcdo.setClickable(true);
        kfc.setClickable(true);
        greenwich.setClickable(true);
        bgking.setClickable(true);
        mangina.setClickable(true);
        scuisine.setClickable(true);

        jollibee.bringToFront();
        chowking.bringToFront();
        mcdo.bringToFront();
        kfc.bringToFront();
        greenwich.bringToFront();
        bgking.bringToFront();
        mangina.bringToFront();
        scuisine.bringToFront();


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , MainPage.class);
                Toast.makeText(FastFood.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        jollibee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , JollibeeRevPage.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        chowking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , Chowking.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        mcdo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , activity_mcdo.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , KFC.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        greenwich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , Greenwich.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        bgking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , BurgerKing.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        mangina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , MangInasalRevPage.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

        scuisine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FastFood.this , SusiesCuisine.class);
                Toast.makeText(FastFood.this, "Loading page...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });

    }
}
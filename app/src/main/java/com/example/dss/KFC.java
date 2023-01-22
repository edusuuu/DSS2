package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Toast;

public class KFC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kfc);

        ImageView back = findViewById(R.id.btnBack);
        Button comments = findViewById(R.id.comments);
        back.setClickable(true);

        RatingBar rbar = findViewById(R.id.rbar);
        EditText rate = findViewById(R.id.rate);
        Button btnRate = findViewById(R.id.btnRate);

        rbar.setClickable(false);

        rbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar rbar, float v, boolean b) {


            }
        });
        btnRate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float rating = (Float.valueOf(rate.getText().toString()));
                if(Integer.valueOf(rate.getText().toString()) < 1 && Integer.valueOf(rate.getText().toString()) > 5){
                    rate.setError("Must not be lower than 1 or higher than 5.");
                }
                else {
                    rbar.setRating(rating);
                    Toast.makeText(KFC.this, "Rating Submitted!", Toast.LENGTH_SHORT).show();
                }
            }
        });
        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(KFC.this,kfc_comment.class);
                Toast.makeText(KFC.this, "Loading Comments...", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KFC.this , FastFood.class);
                Toast.makeText(KFC.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
    }
}
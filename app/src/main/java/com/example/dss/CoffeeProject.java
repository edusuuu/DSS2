package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CoffeeProject extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_project);
        Button comments = findViewById(R.id.comments);
        ImageView back = findViewById(R.id.btnBack);

        back.setClickable(true);

        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CoffeeProject.this,coffeeproject_comment.class);
                Toast.makeText(CoffeeProject.this, "Loading Comments...", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CoffeeProject.this , Restaurant.class);
                Toast.makeText(CoffeeProject.this, "Loading page...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}
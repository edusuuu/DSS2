package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class activity_yellowcab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellowcab);
        Intent intent = getIntent();
        ImageView back = findViewById(R.id.btnBack);
        Button comments = findViewById(R.id.comments);
        back.setClickable(true);

        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_yellowcab.this,yellowcab_comment.class);
                Toast.makeText(activity_yellowcab.this, "Loading Comments...", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_yellowcab.this , Restaurant.class);
                Toast.makeText(activity_yellowcab.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
    }
}
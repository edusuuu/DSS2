package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class activity_mcdo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcdo);


        Button comments = findViewById(R.id.comments);
        ImageView back = findViewById(R.id.btnBack);

        back.setClickable(true);

        comments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(activity_mcdo.this,mcdo_comment.class);
                Toast.makeText(activity_mcdo.this, "Loading Comments...", Toast.LENGTH_SHORT).show();
                startActivity(i);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_mcdo.this , FastFood.class);
                Toast.makeText(activity_mcdo.this, "Returning...", Toast.LENGTH_SHORT).show();

                startActivity(intent);
            }
        });
    }
}
package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        EditText username,pass,cpass;

        username = findViewById(R.id.username);
        pass = findViewById(R.id.pass);
        cpass = findViewById(R.id.cpass);
         Button regisbtn = findViewById(R.id.regisbtn);

         regisbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {

                 if(username.getText().toString() != null && pass.getText().toString() == cpass.getText().toString()) {
                     Toast.makeText(register.this,"Registration Success!", Toast.LENGTH_SHORT).show();
                    //register function in DataManager + intent and start activity
                 }
                 else {
                     Toast.makeText(register.this,"Registration Failed!", Toast.LENGTH_SHORT).show();
                 }

             }
         });
    }
}
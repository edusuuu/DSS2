package com.example.dss;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class  LogInPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_page);

        TextView username = (TextView) findViewById(R.id.username);
        TextView Password = (TextView) findViewById(R.id.Password);

        Button loginbtn = (Button) findViewById(R.id.loginbtn);



        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().isEmpty()
                        && Password.getText().toString().isEmpty()) {

                    username.setError("User not found.");
                    Password.setError("Password incorrect.");

                } else {
                    String user = username.getText().toString();
                    Username.setName(user);
                    Toast.makeText(LogInPage.this, "LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LogInPage.this, MainPage.class);
                    startActivity(intent);

                }
            }

        });
    }
}
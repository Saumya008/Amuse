package com.example.amuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    Button b4,b5;
    EditText inputEmail;
    EditText inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        inputEmail = (EditText) findViewById(R.id.email);
        inputPassword = (EditText) findViewById(R.id.pass);
        b4 = (Button) findViewById(R.id.loginnn);
        b5 = (Button) findViewById(R.id.signuppp);


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(getApplicationContext(), ActivityFeed.class);
                startActivity(i1);

            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 =new Intent(getApplicationContext(), ActivityFeed.class);
                startActivity(i1);

            }
        });
    }
}

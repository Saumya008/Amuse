package com.example.amuse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Signup extends AppCompatActivity {

    Button SignUpButton;
    EditText inputEmail;
    EditText inputPassword;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        inputEmail = (EditText) findViewById(R.id.email1);
        inputPassword = (EditText) findViewById(R.id.pass1);
        SignUpButton = (Button) findViewById(R.id.button22);


        SignUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent i4 =new Intent(getApplicationContext(), ActivityFeed.class);
                        startActivity(i4);

            }
        });
    }
}

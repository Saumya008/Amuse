package com.example.amuse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityFeed extends AppCompatActivity {
    TextView tv;
    Button b6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);


        b6=(Button)findViewById(R.id.button23);
        tv = (TextView) findViewById(R.id.imageView);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 =new Intent(getApplicationContext(), main_Activity.class);
                startActivity(i2);
            }
        });



    }
}
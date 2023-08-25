package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    Button btnGetStarted;
    TextView Skip3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        initview();
    }

    private void initview() {

        btnGetStarted = findViewById(R.id.btnGetStarted);
        Skip3 = findViewById(R.id.Skip3);

        btnGetStarted.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity4.this, LoginActivity.class);
                startActivity(i);

            }
        });

        Skip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity4.this, LoginActivity.class);
                startActivity(i);

            }
        });

    }
}
package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    ImageView img2;
    TextView Skip2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        initview();
    }

    private void initview() {

        img2 = findViewById(R.id.img2);
        Skip2 = findViewById(R.id.Skip2);

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);

            }
        });

        Skip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity3.this, LoginActivity.class);
                startActivity(i);

            }
        });

    }
}
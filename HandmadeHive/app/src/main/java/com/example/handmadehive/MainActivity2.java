package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageView img1;
    TextView Skip1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        initview();
    }

    private void initview() {

        img1 = findViewById(R.id.img1);
        Skip1 = findViewById(R.id.Skip1);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(i);

            }
        });

        Skip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity2.this, LoginActivity.class);
                startActivity(i);

            }
        });

    }
}
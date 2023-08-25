package com.example.handmadehive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Profile1Activity extends AppCompatActivity {

    TextView txtWork;
    Button BtnShop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile1);

        initview();
    }

    private void initview() {

        txtWork = findViewById(R.id.txtWork);
        BtnShop = findViewById(R.id.BtnShop);

        txtWork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Profile1Activity.this, ArtisanWorksActivity.class);
                startActivity(i);
            }
        });

        BtnShop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Profile1Activity.this, ArtisanShopActivity.class);
                startActivity(i);
            }
        });
    }
}
package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductActivity extends AppCompatActivity {

    TextView txtExplore;
    ImageView imgHome,imgStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        initview();
    }

    private void initview() {

        txtExplore = findViewById(R.id.txtExplore);
        imgHome = findViewById(R.id.imgHome);
        imgStore = findViewById(R.id.imgStore);


        txtExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProductActivity.this,CategoriesActivity.class);
                startActivity(i);

            }
        });

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProductActivity.this,HomePageActivity.class);
                startActivity(i);
            }
        });

        imgStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProductActivity.this,StudioActivity.class);
                startActivity(i);
            }
        });
    }

    }

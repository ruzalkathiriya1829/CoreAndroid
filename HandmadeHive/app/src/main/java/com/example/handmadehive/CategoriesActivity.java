package com.example.handmadehive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoriesActivity extends AppCompatActivity {

    TextView txtProduct;
    ImageView imgHome, imgStore, imgProfile, imgCollabrotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        initview();
    }

    private void initview() {

        txtProduct = findViewById(R.id.txtProduct);
        imgHome = findViewById(R.id.imgHome);
        imgStore = findViewById(R.id.imgStore);
        imgProfile = findViewById(R.id.imgProfile);
        imgCollabrotion = findViewById(R.id.imgCollabrotion);

        txtProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CategoriesActivity.this, ProductActivity.class);
                startActivity(i);

            }
        });

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CategoriesActivity.this, HomePageActivity.class);
                startActivity(i);
            }
        });

        imgStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CategoriesActivity.this, StudioActivity.class);
                startActivity(i);
            }
        });

        imgCollabrotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CategoriesActivity.this, CollaborateActivity.class);
                startActivity(i);
            }
        });

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CategoriesActivity.this, ProfileActivity.class);
                startActivity(i);
            }
        });
    }
}
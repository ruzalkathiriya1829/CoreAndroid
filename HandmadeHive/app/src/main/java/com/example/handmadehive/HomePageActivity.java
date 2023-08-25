package com.example.handmadehive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomePageActivity extends AppCompatActivity {

    ImageView imgHomeHome,imgHomeCategory, imgHomeStore, imgHomeCollabrotion, imgHomeProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        initview();
    }

    private void initview() {

        imgHomeHome = findViewById(R.id.imgHomeHome);
        imgHomeCategory = findViewById(R.id.imgHomeCategory);
        imgHomeStore = findViewById(R.id.imgHomeStore);
        imgHomeCollabrotion = findViewById(R.id.imgHomeCollabrotion);
        imgHomeProfile = findViewById(R.id.imgHomeProfile);

        imgHomeHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomePageActivity.this,HomePageActivity.class);
                startActivity(i);

            }
        });

        imgHomeCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomePageActivity.this, CategoriesActivity.class);
                startActivity(i);
            }
        });

        imgHomeStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomePageActivity.this, StudioActivity.class);
                startActivity(i);

            }
        });

        imgHomeCollabrotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomePageActivity.this, CollaborateActivity.class);
                startActivity(i);

            }
        });

        imgHomeProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(HomePageActivity.this, ProfileActivity.class);
                startActivity(i);

            }
        });
    }
}
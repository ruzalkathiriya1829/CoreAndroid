package com.example.handmadehive;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class StudioActivity extends AppCompatActivity {

    ImageView imgHome, imgCategory, imgStore, imgCollabrotion, imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studio);

        initview();
    }

    private void initview() {

        imgHome = findViewById(R.id.imgHome);
        imgCategory = findViewById(R.id.imgCategory);
        imgStore = findViewById(R.id.imgStore);
        imgCollabrotion = findViewById(R.id.imgCollabrotion);
        imgProfile = findViewById(R.id.imgProfile);

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(StudioActivity.this, HomePageActivity.class);
                startActivity(i);

            }
        });

        imgCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(StudioActivity.this, CategoriesActivity.class);
                startActivity(i);

            }
        });

        imgStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(StudioActivity.this, StudioActivity.class);
                startActivity(i);

            }
        });

        imgCollabrotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(StudioActivity.this, CollaborateActivity.class);
                startActivity(i);

            }
        });

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(StudioActivity.this, ProfileActivity.class);
                startActivity(i);

            }
        });

    }
}
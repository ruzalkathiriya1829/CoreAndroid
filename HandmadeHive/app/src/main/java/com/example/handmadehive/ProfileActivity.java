package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class ProfileActivity extends AppCompatActivity {

    ImageView imgHome,imgCategory,imgStore,imgCollabrotion;
    LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        initview();
    }

    private void initview() {

        imgHome = findViewById(R.id.imgHome);
        imgCategory = findViewById(R.id.imgCategory);
        imgStore = findViewById(R.id.imgStore);
        imgCollabrotion = findViewById(R.id.imgCollabrotion);
        l1 = findViewById(R.id.l1);

        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProfileActivity.this,HomePageActivity.class);
                startActivity(i);

            }
        });

        imgCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProfileActivity.this,CategoriesActivity.class);
                startActivity(i);

            }
        });

        imgStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProfileActivity.this,StudioActivity.class);
                startActivity(i);

            }
        });

        imgCollabrotion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProfileActivity.this,CollaborateActivity.class);
                startActivity(i);

            }
        });

        l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ProfileActivity.this,ArtisanActivity.class);
                startActivity(i);

            }
        });

    }
}
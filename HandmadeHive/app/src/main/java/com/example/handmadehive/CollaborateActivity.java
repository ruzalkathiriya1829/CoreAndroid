package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class CollaborateActivity extends AppCompatActivity {

    ImageView imgHome,imgCategory,imgStore,imgCollabrotion,imgProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collaborate);

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

                Intent i = new Intent(CollaborateActivity.this,HomePageActivity.class);
                startActivity(i);

            }
        });

        imgCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CollaborateActivity.this,CategoriesActivity.class);
                startActivity(i);

            }
        });

        imgStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CollaborateActivity.this,StudioActivity.class);
                startActivity(i);

            }
        });

        imgProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(CollaborateActivity.this,ProfileActivity.class);
                startActivity(i);

            }
        });


    }
}
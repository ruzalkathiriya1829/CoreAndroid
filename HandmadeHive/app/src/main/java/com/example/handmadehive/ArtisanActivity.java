package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ArtisanActivity extends AppCompatActivity {

    LinearLayout LayoutProfile1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artisan);

        initview();
    }

    private void initview() {

        LayoutProfile1 = findViewById(R.id.LayoutProfile1);

        LayoutProfile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ArtisanActivity.this,Profile1Activity.class);
                startActivity(i);

            }
        });

    }
}
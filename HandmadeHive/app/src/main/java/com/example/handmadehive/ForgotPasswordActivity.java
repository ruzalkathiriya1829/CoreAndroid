package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ForgotPasswordActivity extends AppCompatActivity {

    ImageView imgBackArrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

        initview();
    }

    private void initview() {

        imgBackArrow = findViewById(R.id.imgBackArrow);

        imgBackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(ForgotPasswordActivity.this,LoginActivity.class);
                startActivity(i);

            }
        });
    }
}
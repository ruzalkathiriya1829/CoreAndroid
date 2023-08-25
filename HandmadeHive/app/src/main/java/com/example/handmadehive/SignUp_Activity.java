package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUp_Activity extends AppCompatActivity {

    ImageView imgBackArrow2;
    TextView txtLogin;
    Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        initview();
    }

    private void initview() {

        imgBackArrow2 = findViewById(R.id.imgBackArrow2);
        txtLogin = findViewById(R.id.txtLogin);
        btnSignUp = findViewById(R.id.btnSignUp);

        imgBackArrow2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignUp_Activity.this,LoginActivity.class);
                startActivity(i);

            }
        });

        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignUp_Activity.this,LoginActivity.class);
                startActivity(i);

            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SignUp_Activity.this,OTPActivity.class);
                startActivity(i);

            }
        });
    }
}
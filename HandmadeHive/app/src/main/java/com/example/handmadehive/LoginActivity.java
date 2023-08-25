package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    TextView txtForgotPass,txtSignUp, txtAsGuest;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        initview();
    }

    private void initview() {

        txtForgotPass = findViewById(R.id.txtForgotPass);
        txtSignUp = findViewById(R.id.txtSignUp);
        txtAsGuest = findViewById(R.id.txtAsGuest);
        btnLogin = findViewById(R.id.btnLogin);

        txtForgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this, ForgotPasswordActivity.class);
                startActivity(i);

            }
        });

        txtSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this, SignUp_Activity.class);
                startActivity(i);

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this, HomePageActivity.class);
                startActivity(i);

            }
        });

        txtAsGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(LoginActivity.this, HomePageActivity.class);
                startActivity(i);

            }
        });


    }
}
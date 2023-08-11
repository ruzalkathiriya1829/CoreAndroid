package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resume2Activity extends AppCompatActivity {

    TextView R2txtProfession,R2txtName,R2txtEmail,R2txtMobileNO,R2txtAddress,R2txtLang,R2txtHobby,R2txtAbout,R2txtEducation,R2txtExperience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume2);

        initview();
    }

    private void initview() {

        R2txtName = findViewById(R.id.R2txtName);
        R2txtProfession = findViewById(R.id.R2txtProfession);

        R2txtEmail = findViewById(R.id.R2txtEmail);
        R2txtMobileNO = findViewById(R.id.R2txtMobileNO);
        R2txtAddress = findViewById(R.id.R2txtAddress);

        R2txtLang = findViewById(R.id.R2txtLang);
        R2txtHobby = findViewById(R.id.R2txtHobby);


        R2txtAbout = findViewById(R.id.R2txtAbout);
        R2txtEducation = findViewById(R.id.R2txtEducation);
        R2txtExperience = findViewById(R.id.R2txtExperience);

        if(getIntent()!=null)
        {
            R2txtName.setText(getIntent().getStringExtra("name"));
            R2txtProfession.setText(getIntent().getStringExtra("profession"));

            R2txtEmail.setText(getIntent().getStringExtra("Gmail"));
            R2txtMobileNO.setText(getIntent().getStringExtra("MobileNO"));
            R2txtAddress.setText(getIntent().getStringExtra("Address"));


            R2txtHobby.setText(getIntent().getStringExtra("hobby"));
            R2txtLang.setText(getIntent().getStringExtra("language"));


            R2txtAbout.setText(getIntent().getStringExtra("About"));
            R2txtEducation.setText(getIntent().getStringExtra("Edu"));
            R2txtExperience.setText(getIntent().getStringExtra("Exp"));

        }
    }
}

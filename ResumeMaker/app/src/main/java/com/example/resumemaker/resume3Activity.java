package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resume3Activity extends AppCompatActivity {

    TextView R3Profession,R3Name,R3ExtraActivity,R3Email,R3MobileNo,R3Address,R3Language,R3About,R3Education,R3Experience,R3Skills;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume3);

        initview();
    }

    private void initview() {

        R3Name = findViewById(R.id.R3Name);
        R3Profession = findViewById(R.id.R3Profession);

        R3Email = findViewById(R.id.R3Email);
        R3MobileNo = findViewById(R.id.R3MobileNo);
        R3Address = findViewById(R.id.R3Address);

        R3Language = findViewById(R.id.R3Language);
        R3Skills = findViewById(R.id.R3Skills);


        R3About = findViewById(R.id.R3About);
        R3Education = findViewById(R.id.R3Education);
        R3Experience = findViewById(R.id.R3Experience);
        R3ExtraActivity = findViewById(R.id.R3ExtraActivity);

        if(getIntent()!=null)
        {
            R3Name.setText(getIntent().getStringExtra("name"));
            R3Profession.setText(getIntent().getStringExtra("profession"));

            R3Email.setText(getIntent().getStringExtra("Gmail"));
            R3MobileNo.setText(getIntent().getStringExtra("MobileNO"));
            R3Address.setText(getIntent().getStringExtra("Address"));

            R3Language.setText(getIntent().getStringExtra("language"));
            R3Skills.setText(getIntent().getStringExtra("skill"));


            R3About.setText(getIntent().getStringExtra("About"));
            R3Education.setText(getIntent().getStringExtra("Edu"));
            R3Experience.setText(getIntent().getStringExtra("Exp"));
            R3ExtraActivity.setText(getIntent().getStringExtra("Activity"));

        }

    }
}
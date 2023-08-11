package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resume4Activity extends AppCompatActivity {

    TextView txtR4Profession,txtR4Name,txtR4Email,txtR4MobileNO,txtR4Address,txtR4Skills,txtR4About,txtR4Edu,txtR4Exp,txtR4Hobby,txtR4Language;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume4);

        initview();
    }

    private void initview() {

        txtR4Name = findViewById(R.id.txtR4Name);
        txtR4Profession = findViewById(R.id.txtR4Profession);

        txtR4Email = findViewById(R.id.txtR4Email);
        txtR4MobileNO = findViewById(R.id.txtR4MobileNO);
        txtR4Address = findViewById(R.id.txtR4Address);

        txtR4Language = findViewById(R.id.txtR4Language);
        txtR4Hobby = findViewById(R.id.txtR4Hobby);

        txtR4Skills = findViewById(R.id.txtR4Skills);


        txtR4About = findViewById(R.id.txtR4About);
        txtR4Edu = findViewById(R.id.txtR4Edu);
        txtR4Exp = findViewById(R.id.txtR4Exp);

        if(getIntent()!=null)
        {
            txtR4Name.setText(getIntent().getStringExtra("name"));
            txtR4Profession.setText(getIntent().getStringExtra("profession"));

            txtR4Email.setText(getIntent().getStringExtra("Gmail"));
            txtR4MobileNO.setText(getIntent().getStringExtra("MobileNO"));
            txtR4Address.setText(getIntent().getStringExtra("Address"));

            txtR4Skills.setText(getIntent().getStringExtra("skill"));

            txtR4Hobby.setText(getIntent().getStringExtra("hobby"));
            txtR4Language.setText(getIntent().getStringExtra("language"));


            txtR4About.setText(getIntent().getStringExtra("About"));
            txtR4Edu.setText(getIntent().getStringExtra("Edu"));
            txtR4Exp.setText(getIntent().getStringExtra("Exp"));

        }

    }
}
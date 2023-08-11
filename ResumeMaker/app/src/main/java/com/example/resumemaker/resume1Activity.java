package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class resume1Activity extends AppCompatActivity {

    TextView txtProfession,txtName,txtEmail,txtMobileNO,txtAddress,txtWeb,txtAbout,txtEdu,txtExp,txtHobby,txtLang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume1);

        init();
    }

    private  void init()

    {

        txtName = findViewById(R.id.txtName);
        txtProfession = findViewById(R.id.txtProfession);

        txtEmail = findViewById(R.id.txtEmail);
        txtMobileNO = findViewById(R.id.txtMobileNO);
        txtAddress = findViewById(R.id.txtAddress);

        txtLang = findViewById(R.id.txtLang);
        txtHobby = findViewById(R.id.txtHobby);

        txtWeb = findViewById(R.id.txtWeb);


        txtAbout = findViewById(R.id.txtAbout);
        txtEdu = findViewById(R.id.txtEdu);
        txtExp = findViewById(R.id.txtExp);

        if(getIntent()!=null)
        {
            txtName.setText(getIntent().getStringExtra("name"));
            txtProfession.setText(getIntent().getStringExtra("profession"));

            txtEmail.setText(getIntent().getStringExtra("Gmail"));
            txtMobileNO.setText(getIntent().getStringExtra("MobileNO"));
            txtAddress.setText(getIntent().getStringExtra("Address"));

            txtWeb.setText(getIntent().getStringExtra("skill"));

            txtHobby.setText(getIntent().getStringExtra("hobby"));
            txtLang.setText(getIntent().getStringExtra("language"));


            txtAbout.setText(getIntent().getStringExtra("About"));
            txtEdu.setText(getIntent().getStringExtra("Edu"));
            txtExp.setText(getIntent().getStringExtra("Exp"));

        }
    }
}
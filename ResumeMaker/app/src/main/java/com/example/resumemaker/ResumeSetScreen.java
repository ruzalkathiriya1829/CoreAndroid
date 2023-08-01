package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResumeSetScreen extends AppCompatActivity {

        TextView txtProfession,txtName,txtEmail,txtMobileNO,txtAddress,txtWeb,txtGrp,txtUi,txtFull,txtApp;
        TextView txtAbout,txtEdu,txtExp,txtHobby,txtLang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_set_screen);

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
        txtGrp = findViewById(R.id.txtGrp);
        txtUi = findViewById(R.id.txtUi);
        txtFull = findViewById(R.id.txtFull);
        txtApp = findViewById(R.id.txtApp);

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

            txtWeb.setText(getIntent().getStringExtra("skill1"));
            txtGrp.setText(getIntent().getStringExtra("skill2"));
            txtUi.setText(getIntent().getStringExtra("skill3"));
            txtFull.setText(getIntent().getStringExtra("skill4"));
            txtApp.setText(getIntent().getStringExtra("skill5"));

            txtHobby.setText(getIntent().getStringExtra("hobby"));
            txtLang.setText(getIntent().getStringExtra("language"));


            txtAbout.setText(getIntent().getStringExtra("About"));
            txtEdu.setText(getIntent().getStringExtra("Edu"));
            txtExp.setText(getIntent().getStringExtra("Exp"));

        }
    }
}
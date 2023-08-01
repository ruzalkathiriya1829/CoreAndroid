package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class GetInformation extends AppCompatActivity {

    EditText edtName,edtProfession,edtGmail,edtMobileNo,edtAddress,edtAbout,edtEdu,edtExperience,edtHobbies,edtLang;
    Button btnCreate;
    CheckBox cbWebDesign,cbGraphicsDesign,cbUIUXDesign,cbFullstack,cbApplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_information);

        init();

    }

    private void init()
    {

        //edit view
        edtName = findViewById(R.id.edtName);
        edtProfession = findViewById(R.id.edtProfession);
        edtGmail = findViewById(R.id.edtGmail);
        edtMobileNo = findViewById(R.id.edtMobileNo);
        edtAddress = findViewById(R.id.edtAddress);
        edtAbout = findViewById(R.id.edtAbout);
        edtEdu = findViewById(R.id.edtEdu);
        edtExperience = findViewById(R.id.edtExperience);
        edtHobbies = findViewById(R.id.edtHobbies);
        edtLang = findViewById(R.id.edtLang);

        //checkbox
        cbWebDesign = findViewById(R.id.cbWebDesign);
        cbGraphicsDesign = findViewById(R.id.cbGraphicsDesign);
        cbUIUXDesign = findViewById(R.id.cbUIUXDesign);
        cbFullstack = findViewById(R.id.cbFullstack);
        cbApplication = findViewById(R.id.cbApplication);

        //Button
        btnCreate = findViewById(R.id.btnCreate);




        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String skill1 = null,skill2 = null,skill3 = null,skill4 = null,skill5 = null;

                if (cbWebDesign.isChecked()) {
                     skill1 = cbWebDesign.getText().toString();
                }
                if (cbGraphicsDesign.isChecked()) {
                     skill2 = cbGraphicsDesign.getText().toString();
                }
                if (cbUIUXDesign.isChecked()) {
                     skill3 = cbUIUXDesign.getText().toString();

                }
                if (cbFullstack.isChecked()) {
                     skill4 = cbFullstack.getText().toString();
                }

                if (cbApplication.isChecked()) {
                    skill5 = cbApplication.getText().toString();
                }

                //edit text
                String name = edtName.getText().toString();
                String profession = edtProfession.getText().toString();
                String Gmail = edtGmail.getText().toString();
                String MobileNO = edtMobileNo.getText().toString();
                String Address = edtAddress.getText().toString();
                String About = edtAbout.getText().toString();
                String Edu = edtEdu.getText().toString();
                String Exp = edtExperience.getText().toString();
                String hobby = edtHobbies.getText().toString();
                String language = edtLang.getText().toString();



                Intent i = new Intent(GetInformation.this, ResumeSetScreen.class);

                //edit text
                i.putExtra("name", name);
                i.putExtra("profession", profession);
                i.putExtra("Gmail", Gmail);
                i.putExtra("MobileNO", MobileNO);
                i.putExtra("Address", Address);
                i.putExtra("About", About);
                i.putExtra("Edu", Edu);
                i.putExtra("Exp", Exp);
                i.putExtra("hobby", hobby);
                i.putExtra("language", language);

                i.putExtra("skill1", skill1);
                i.putExtra("skill2", skill2);
                i.putExtra("skill3", skill3);
                i.putExtra("skill4", skill4);
                i.putExtra("skill5", skill5);


                startActivity(i);

            }
        });


    }
}
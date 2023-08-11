package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class GetInformationActivity extends AppCompatActivity {

    EditText edtName,edtProfession,edtGmail,edtMobileNo,edtAddress,edtAbout,edtEdu,edtExperience,edtHobbies,edtLang,edtCurricularActivity;
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
        edtCurricularActivity = findViewById(R.id.edtCurricularActivity);

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

                String skill = null;

                if (cbWebDesign.isChecked()) {
                     skill = cbWebDesign.getText().toString() + "\n";
                }
                if (cbGraphicsDesign.isChecked()) {
                     skill += cbGraphicsDesign.getText().toString() + "\n";
                }
                if (cbUIUXDesign.isChecked()) {
                    skill += cbUIUXDesign.getText().toString() + "\n";

                }
                if (cbFullstack.isChecked()) {
                    skill += cbFullstack.getText().toString() + "\n";
                }

                if (cbApplication.isChecked()) {
                    skill += cbApplication.getText().toString() + "\n";
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
                String Activity = edtCurricularActivity.getText().toString();



                Intent i = new Intent(GetInformationActivity.this, SelectionScreenActivity.class);

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
                i.putExtra("Activity", Activity);

                i.putExtra("skill", skill);


                startActivity(i);

            }
        });


    }
}
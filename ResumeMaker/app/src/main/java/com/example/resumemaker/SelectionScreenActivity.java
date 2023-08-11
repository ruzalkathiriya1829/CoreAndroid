package com.example.resumemaker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class SelectionScreenActivity extends AppCompatActivity {

    ImageView imgLayout1, imgLayout2, imgLayout3, imgLayout4;
    String name, profession, Gmail, MobileNO, Address, skill, hobby, language, About, Edu, Exp, Activity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_screen);

        initview();
    }

    private void initview() {


        if (getIntent() != null) {
            name = getIntent().getStringExtra("name");
            profession = getIntent().getStringExtra("profession");

            Gmail = getIntent().getStringExtra("Gmail");
            MobileNO = getIntent().getStringExtra("MobileNO");
            Address = getIntent().getStringExtra("Address");

            skill = getIntent().getStringExtra("skill");

            hobby = getIntent().getStringExtra("hobby");
            language = getIntent().getStringExtra("language");

            About = getIntent().getStringExtra("About");
            Edu = getIntent().getStringExtra("Edu");
            Exp = getIntent().getStringExtra("Exp");
            Activity = getIntent().getStringExtra("Activity");


        }


        imgLayout1 = findViewById(R.id.imgLayout1);
        imgLayout2 = findViewById(R.id.imgLayout2);
        imgLayout3 = findViewById(R.id.imgLayout3);
        imgLayout4 = findViewById(R.id.imgLayout4);


        imgLayout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectionScreenActivity.this, resume1Activity.class);


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


        imgLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent i = new Intent(SelectionScreenActivity.this, resume2Activity.class);

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

        imgLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectionScreenActivity.this, resume3Activity.class);

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

        imgLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(SelectionScreenActivity.this, resume4Activity.class);

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
package com.example.handmadehive;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initview();

        //navigation or status bar colour change code

        Window w = this.getWindow();
        w.setStatusBarColor(getColor(R.color.black));
    }

    private void initview() {

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);

                finish();
            }
        }, 4000);


    }
}
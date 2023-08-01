package com.example.emicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

 TextView txtreset, txttotal, monthlyemi;
 EditText edtLoanAmt,edtRate,edtTimeForLoan;
 Button btncalculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        init();

    }

    private void init()
    {


        txtreset = findViewById(R.id.txtreset);
        edtLoanAmt = findViewById(R.id.edtLoanAmt);
        edtRate = findViewById(R.id.edtRate);
        edtTimeForLoan = findViewById(R.id.edtTimeForLoan);
        btncalculate = findViewById(R.id.btncalculate);
        txttotal = findViewById(R.id.txttotal);
        monthlyemi = findViewById(R.id.monthlyemi);


        txtreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    edtLoanAmt.getText().clear();
                    edtRate.getText().clear();
                    edtTimeForLoan.getText().clear();

            }
        });


        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String loan = edtLoanAmt.getText().toString();
                String rate = edtRate.getText().toString();
                String time = edtTimeForLoan.getText().toString();


                float p = Float.parseFloat(loan);
                float r = Float.parseFloat(rate)/100;
                int t = Integer.parseInt(time);


                float emi = (float) (p * r * (Math.pow((1+r),t)) / (Math.pow((1+r),t)-1));

                txttotal.setText(String.valueOf(emi));

                float e = emi/12;
                monthlyemi.setText(String.valueOf(e));


            }
        });

    }
}
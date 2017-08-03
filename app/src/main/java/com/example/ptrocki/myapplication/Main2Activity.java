package com.example.ptrocki.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final EditText etHeight = (EditText) findViewById(R.id.et_height);
        final EditText etWeight = (EditText) findViewById(R.id.et_weight);
        Button btnCalc = (Button) findViewById(R.id.btn_calc);
        final TextView tvBmi = (TextView) findViewById(R.id.tv_bmi);
        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etWeight.getText().toString().isEmpty() && etHeight.getText().toString().isEmpty()) {
                    Toast.makeText(Main2Activity.this,"Give both values", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        Float height = Float.parseFloat(etHeight.getText().toString());
                        Float weight = Float.parseFloat(etWeight.getText().toString());
                        Float bmi = weight / (height * weight);
                        tvBmi.setText("Your BMI is " + String.valueOf(bmi));
                    } catch (NumberFormatException e){
                        Toast.makeText(Main2Activity.this,"Please provide number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}

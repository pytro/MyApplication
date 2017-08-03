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
        final EditText /***/ = (EditText) findViewById(R.id.et_height);
        /***/ /***/ /***/ = (EditText) findViewById(R.id.et_weight);
        Button * = (Button) findViewById(R.id.btn_calc);
        final TextView /***/ = (TextView) findViewById(R.id.tv_bmi);
        /***/.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (/**/.getText().toString().isEmpty() && /**/.getText().toString().isEmpty()) {
                    Toast./***/(Main2Activity.this,"Give both values", Toast.LENGTH_SHORT)./***/();
                } else {
                    try {
                        //pobierz wysokosc
                        Float height = Float.parseFloat(/***/.getText().toString());
                        //pobierz wage
                        /***/ weight = /***/./***/(/***/.getText()./***/);

                        Float bmi = weight / (height * weight);
                        /**/.setText("Your BMI is " + String.valueOf(bmi));
                    } catch (NumberFormatException e){
                        Toast.makeText(Main2Activity.this,"Please provide number", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}

package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BMIresults extends AppCompatActivity {

    EditText editText;
    TextView textView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiresults);


        editText = (EditText) findViewById(R.id.editText);

        editText.setText(getIntent().getStringExtra("BMI"));

        textView5 = (TextView) findViewById(R.id.textView5);
        String y = editText.getText().toString();

        float bmiValue = Float.parseFloat(y);

        if (bmiValue < 18.5) {

            textView5.setText("UnderWeight");
        } else if (bmiValue < 24.9) {

            textView5.setText("Normal");
        } else if (bmiValue < 29.9) {

            textView5.setText("OverWeight");
        } else {

            textView5.setText("Obese");

        }


        }
}

package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class BMI extends AppCompatActivity {
Button bgomenu,calculate;
    EditText edit_first,edit_second;
    float height,weight;

/*
    public void calculateme(View view){
        edit_first=(EditText) findViewById(R.id.edit_first);
        edit_second=(EditText) findViewById(R.id.edit_second);

        String val1=edit_first.getText().toString();

        String val2=edit_second.getText().toString();
        height = Integer.parseInt(val1);           //For values getting
        weight=Integer.parseInt(val2);

        int calculatedbmi=Math.round(weight/height);

        Toast.makeText(BMI.this,"Your BMI "+calculatedbmi,Toast.LENGTH_LONG).show();


    }*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);





        bgomenu=(Button) findViewById(R.id.gobacktomenu);
        calculate=(Button) findViewById(R.id.b_cal);



        bgomenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ibacktomenu= new Intent(BMI.this, mainmenu.class);
                startActivity(ibacktomenu);
            }


            });

       calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit_first=(EditText) findViewById(R.id.edit_first);
                edit_second=(EditText) findViewById(R.id.edit_second);

                String val1=edit_first.getText().toString();

                String val2=edit_second.getText().toString();



                if (val1 != null
                        && val2 != null ) {


                    Intent gotoCalculation= new Intent(BMI.this,BMIresults.class);

                    height = Float.parseFloat(val1);           //For values getting
                    weight = Float.parseFloat(val2);

                    float bmi1 = (weight / (height*height));
                    DecimalFormat value = new DecimalFormat("#.#");

                    String backTo = String.valueOf(value.format(bmi1));
                    gotoCalculation.putExtra("BMI", backTo);
                    startActivity(gotoCalculation);
                }
                }
        });



    }
}

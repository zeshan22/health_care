package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMIresults extends AppCompatActivity {

    TextView textView5,textView6;

    private Toolbar mToolbar;
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmiresults);

        b=(Button) findViewById(R.id.bb);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ib=new Intent(BMIresults.this, dietplan.class);
                startActivity(ib);
            }
        });

        b1=(Button) findViewById(R.id.b_back);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ic=new Intent(BMIresults.this, BMI.class);
                startActivity(ic);
            }
        });

        textView6 = findViewById(R.id.editText);

        textView6.setText(getIntent().getStringExtra("BMI"));

        textView5 = (TextView) findViewById(R.id.textView5);
        String y = textView6.getText().toString();

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



        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("BMI Results");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }


}

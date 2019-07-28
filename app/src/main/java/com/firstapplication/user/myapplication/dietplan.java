package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class dietplan extends AppCompatActivity {

    Button btn_01,btn_02,btn_03,btn_04,btn_05;

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietplan);

        btn_01=(Button) findViewById(R.id.b_1);
        btn_02=(Button) findViewById(R.id.b_2);
        btn_03=(Button) findViewById(R.id.b_3);
        btn_04=(Button) findViewById(R.id.b_4);
        btn_05=(Button) findViewById(R.id.b_back);


        btn_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iunderweight= new Intent(dietplan.this, Diet_Plan_for_Underweight.class);
                startActivity(iunderweight);
            }


        });

        btn_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent inormal= new Intent(dietplan.this, Diet_Plan_for_Normal.class);
                startActivity(inormal);
            }


        });

        btn_03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ioverweight= new Intent(dietplan.this, Diet_Plan_for_Overweight.class);
                startActivity(ioverweight);
            }


        });

        btn_04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iobesity= new Intent(dietplan.this, Diet_Plan_for_Obesity.class);
                startActivity(iobesity);
            }


        });

        btn_05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ibacktobmi= new Intent(dietplan.this, BMI.class);
                startActivity(ibacktobmi);
            }


        });

        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Diet Plan");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }




    }
   }

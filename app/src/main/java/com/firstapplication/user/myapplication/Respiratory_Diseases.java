package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Respiratory_Diseases extends AppCompatActivity {


    private Toolbar mToolbar;

    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiratory__diseases);

        bt1=(Button) findViewById(R.id.b_Pneumonia);
        bt2=(Button) findViewById(R.id.b_Asthma);
        bt3=(Button) findViewById(R.id.b_Bronchitis);
        bt4=(Button) findViewById(R.id.b_backk);

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i1= new Intent(Respiratory_Diseases.this, Pneumonia.class);
                startActivity(i1);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i2= new Intent(Respiratory_Diseases.this, Asthma.class);
                startActivity(i2);
            }


        });
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i3= new Intent(Respiratory_Diseases.this, Bronchitis.class);
                startActivity(i3);
            }


        });
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i4= new Intent(Respiratory_Diseases.this, Diseases.class);
                startActivity(i4);
            }


        });

        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Respiratory Diseases");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }
    }
    }


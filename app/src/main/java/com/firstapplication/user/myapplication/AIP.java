package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class AIP extends AppCompatActivity {


    private Toolbar mToolbar;


    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aip);
        btn1=(Button) findViewById(R.id.b_drowning);
        btn2=(Button) findViewById(R.id.b_sunstroke);
        btn3=(Button) findViewById(R.id.b_murder);
        btn4=(Button) findViewById(R.id.b_poisoning);
        btn5=(Button) findViewById(R.id.b_burn);
        btn6=(Button) findViewById(R.id.b_snakebite);
        btn7=(Button) findViewById(R.id.b_backk);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i1= new Intent(AIP.this, Drowning.class);
                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i2= new Intent(AIP.this, SunStroke.class);
                startActivity(i2);
            }


        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i3= new Intent(AIP.this, Murder.class);
                startActivity(i3);
            }


        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i4= new Intent(AIP.this, Poisoning.class);
                startActivity(i4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i5= new Intent(AIP.this, Burn.class);
                startActivity(i5);
            }


        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i6= new Intent(AIP.this, SnakeBite.class);
                startActivity(i6);
            }


        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i7= new Intent(AIP.this, Diseases.class);
                startActivity(i7);
            }


        });
        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("AIP");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


    }
}

package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView; //Listview is a widget so we imported the library
import android.widget.Toast;

public class ViralDiseases_view extends AppCompatActivity {

    Button b1,b2,b3,b4,b5;

    private Toolbar mToolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viral_diseases_view);

        b1=(Button) findViewById(R.id.b_viral);
        b2=(Button) findViewById(R.id.b_mumps);
        b3=(Button) findViewById(R.id.b_rabies);
        b4=(Button) findViewById(R.id.b_ChickemPox);
        b5=(Button) findViewById(R.id.b_backk);

        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i1= new Intent(ViralDiseases_view.this, Viral_Hepatitis.class);
                startActivity(i1);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i2= new Intent(ViralDiseases_view.this, Mumps.class);
                startActivity(i2);
            }


        });
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i3= new Intent(ViralDiseases_view.this, Rabies.class);
                startActivity(i3);
            }


        });
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i4= new Intent(ViralDiseases_view.this, ChickenPox.class);
                startActivity(i4);
            }


        });
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i5= new Intent(ViralDiseases_view.this, Diseases.class);
                startActivity(i5);
            }


        });
        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Viral Diseases");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }


    }
}

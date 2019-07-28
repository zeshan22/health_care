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

public class IntestinalInfectionsView extends AppCompatActivity {

//we are creating an array which is used as a data source



private Toolbar mToolbar;

    Button btn_01,btn_02,btn_03,btn_04;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intestinal_infections_view);

        btn_01=(Button) findViewById(R.id.b_cholera);
        btn_02=(Button) findViewById(R.id.b_tf);
        btn_03=(Button) findViewById(R.id.b_fp);
        btn_04=(Button) findViewById(R.id.b_backk);

        btn_01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iunderweight= new Intent(IntestinalInfectionsView.this, Cholera.class);
                startActivity(iunderweight);
            }


        });
        btn_02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iunderweight= new Intent(IntestinalInfectionsView.this, TyphoidFever.class);
                startActivity(iunderweight);
            }


        });
        btn_03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iunderweight= new Intent(IntestinalInfectionsView.this, FoodPosioning.class);
                startActivity(iunderweight);
            }


        });
        btn_04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent iunderweight= new Intent(IntestinalInfectionsView.this, Diseases.class);
                startActivity(iunderweight);
            }


        });

        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Intestinal Infection");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }



}

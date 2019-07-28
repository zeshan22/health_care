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

public class BacterialDiseases extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4;

    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacterial_diseases);
        btn1=(Button) findViewById(R.id.b_Diphtheria);
        btn2=(Button) findViewById(R.id.b_WhoopingCough);
        btn3=(Button) findViewById(R.id.b_Tatanus);
        btn4=(Button) findViewById(R.id.b_backk);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i1= new Intent(BacterialDiseases.this, Diphtheria.class);
                startActivity(i1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i2= new Intent(BacterialDiseases.this, Whooping_Cough.class);
                startActivity(i2);
            }


        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i3= new Intent(BacterialDiseases.this, Tatanus.class);
                startActivity(i3);
            }


        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i4= new Intent(BacterialDiseases.this, Diseases.class);
                startActivity(i4);
            }


        });


        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Bacterial Diseases");
        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }



    }




}

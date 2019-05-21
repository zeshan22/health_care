package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Diseases extends AppCompatActivity {
Button b1,b2,b3,b4,b5,b6,b7,b8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);
        b1=(Button) findViewById(R.id.bb1);
        b2=(Button) findViewById(R.id.bb2);
        b3=(Button) findViewById(R.id.bb3);
        b4=(Button) findViewById(R.id.bb4);
        b5=(Button) findViewById(R.id.bb5);
        b6=(Button) findViewById(R.id.bb6);
        b7=(Button) findViewById(R.id.bb7);
        b8=(Button) findViewById(R.id.bb8);



        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idiseases = new Intent(Diseases.this, mainmenu.class);
                startActivity(idiseases);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(Diseases.this, IntestinalInfectionsView.class);
                startActivity(ii);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bac = new Intent(Diseases.this, BacterialDiseases.class);
                startActivity(bac);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viral = new Intent(Diseases.this, ViralDiseases_view.class);
                startActivity(viral);
            }
        });
    }
}

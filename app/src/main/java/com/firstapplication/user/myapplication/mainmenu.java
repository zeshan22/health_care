package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mainmenu extends AppCompatActivity {
Button b1,b2,b3,b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        b1=(Button) findViewById(R.id.b_01);
        b2=(Button) findViewById(R.id.b_02);
        b3=(Button) findViewById(R.id.b_03);
        b4=(Button) findViewById(R.id.b_04);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ibmi = new Intent(mainmenu.this, BMI.class);
                startActivity(ibmi);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent idiseases = new Intent(mainmenu.this, Diseases.class);
                startActivity(idiseases);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ichoose =  new Intent(mainmenu.this, ChooseSpeciality.class);
                startActivity(ichoose);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(mainmenu.this, Exit.class);
                startActivity(it);
            }
        });
    }
}

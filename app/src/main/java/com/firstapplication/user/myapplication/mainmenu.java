package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class mainmenu extends AppCompatActivity {
Button b1,b2,b3,b4;


private Toolbar mToolbar;

    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);



        mAuth = FirebaseAuth.getInstance();

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
                Intent ichoose =  new Intent(mainmenu.this, PatientHome.class);
                startActivity(ichoose);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(mainmenu.this, identifytheuser.class));
                finish();
            }
        });

        //Toolbar initialization
        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);



    }

    @Override
    public void onBackPressed() {

        mAuth.signOut();
        startActivity(new Intent(mainmenu.this, identifytheuser.class));
        finish();
    }
}

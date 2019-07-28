package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Diet_Plan_for_Underweight extends AppCompatActivity {

    PDFView pdf1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet__plan_for__underweight);

        pdf1=(PDFView) findViewById(R.id.pdfunderweight);

        pdf1.fromAsset("DIET PLAN FOR UNDERWEIGHT.pdf").load();

    }
}

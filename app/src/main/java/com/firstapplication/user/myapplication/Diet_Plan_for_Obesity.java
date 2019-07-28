package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Diet_Plan_for_Obesity extends AppCompatActivity {

    PDFView pdf4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet__plan_for__obesity);

        pdf4=(PDFView) findViewById(R.id.pdfobesity);

        pdf4.fromAsset("DIET PLAN FOR OBESITY.pdf").load();
    }
}

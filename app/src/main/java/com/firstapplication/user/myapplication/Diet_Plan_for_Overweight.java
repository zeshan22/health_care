package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Diet_Plan_for_Overweight extends AppCompatActivity {

    PDFView pdf3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet__plan_for__overweight);

        pdf3=(PDFView) findViewById(R.id.pdfoverweight);

        pdf3.fromAsset("DIET PLAN FOR OVERWEIGHT.pdf").load();
    }
}

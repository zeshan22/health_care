package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Diet_Plan_for_Normal extends AppCompatActivity {

    PDFView pdf2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet__plan_for__normal);

        pdf2=(PDFView) findViewById(R.id.pdfnormal);

        pdf2.fromAsset("DIET PLAN FOR NORMAL.pdf").load();
    }
}

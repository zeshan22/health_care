package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Murder extends AppCompatActivity {

    PDFView pdfmur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_murder);
        pdfmur=(PDFView) findViewById(R.id.pdfmurder);
        pdfmur.fromAsset("suicide-and-homicide-precautions.pdf").load();
    }
}

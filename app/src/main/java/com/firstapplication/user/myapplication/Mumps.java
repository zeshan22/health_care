package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Mumps extends AppCompatActivity {

    PDFView pdfm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mumps);
        pdfm=(PDFView) findViewById(R.id.pdfmumps);

        pdfm.fromAsset("Mumps.pdf").load();
    }
}

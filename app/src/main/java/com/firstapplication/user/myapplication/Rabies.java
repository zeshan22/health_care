package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Rabies extends AppCompatActivity {

    PDFView pdfr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rabies);

        pdfr=(PDFView) findViewById(R.id.pdfrabies);

        pdfr.fromAsset("Rabies.pdf").load();
    }
}

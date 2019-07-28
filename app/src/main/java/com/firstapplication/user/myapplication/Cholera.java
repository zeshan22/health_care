package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Cholera extends AppCompatActivity {

    PDFView pdfc_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cholera);
        pdfc_view=(PDFView) findViewById(R.id.pdfc);

        pdfc_view.fromAsset("Cholera.pdf").load();
    }
}

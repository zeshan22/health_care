package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Poisoning extends AppCompatActivity {

    PDFView pdfp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poisoning);
        pdfp=(PDFView) findViewById(R.id.pdfpois3oning);
        pdfp.fromAsset("Poisoning.pdf").load();
    }
}

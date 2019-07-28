package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Pneumonia extends AppCompatActivity {

    PDFView pdfp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pneumonia);
        pdfp=(PDFView) findViewById(R.id.pdfpneumonia);

        pdfp.fromAsset("Pneumonia.pdf").load();
    }
}

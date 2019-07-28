package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class TyphoidFever extends AppCompatActivity {

    PDFView pdftp_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoid_fever);
        pdftp_view=(PDFView) findViewById(R.id.pdftp);

        pdftp_view.fromAsset("Typhoid Fever.pdf").load();
    }
}

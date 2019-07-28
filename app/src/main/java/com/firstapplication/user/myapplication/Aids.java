package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Aids extends AppCompatActivity {

    PDFView pdfaidds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aids);
        pdfaidds=(PDFView) findViewById(R.id.pdfaids);

        pdfaidds.fromAsset("AIDS.pdf").load();
    }
}

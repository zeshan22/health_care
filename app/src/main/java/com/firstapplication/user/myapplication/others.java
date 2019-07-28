package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class others extends AppCompatActivity {
    PDFView pdfov;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        pdfov=(PDFView) findViewById(R.id.pdfoview);

        pdfov.fromAsset("OD.pdf").load();
    }
}

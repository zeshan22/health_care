package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Whooping_Cough extends AppCompatActivity {

    PDFView pdfview2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whooping__cough);

        pdfview2=(PDFView) findViewById(R.id.pdfwhoopingcough);

        pdfview2.fromAsset("Whooping cough.pdf").load();
    }
}

package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Bronchitis extends AppCompatActivity {

    PDFView pdfb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bronchitis);
        pdfb=(PDFView) findViewById(R.id.pdfbromchitis);

        pdfb.fromAsset("Bronchitis.pdf").load();
    }

}

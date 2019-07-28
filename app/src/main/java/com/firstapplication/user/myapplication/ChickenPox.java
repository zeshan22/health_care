package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ChickenPox extends AppCompatActivity {

    PDFView pdfcp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chicken_pox);

        pdfcp=(PDFView) findViewById(R.id.pdfchickenpox);

        pdfcp.fromAsset("Chicken Pox.pdf").load();
    }
}

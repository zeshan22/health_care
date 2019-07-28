package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class SnakeBite extends AppCompatActivity {

    PDFView pdfsnakebite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snake_bite);
        pdfsnakebite=(PDFView) findViewById(R.id.pdfsnakebite);
                pdfsnakebite.fromAsset("Snakebite.pdf").load();
    }
}

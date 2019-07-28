package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Viral_Hepatitis extends AppCompatActivity {

    PDFView pdfv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viral__hepatitis);
        pdfv=(PDFView) findViewById(R.id.pdfviralhepatitis);

        pdfv.fromAsset("Hepatitis.pdf").load();
    }}


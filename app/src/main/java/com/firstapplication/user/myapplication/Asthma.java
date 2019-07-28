 package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

 public class Asthma extends AppCompatActivity {
     PDFView pdfa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asthma);
        pdfa=(PDFView) findViewById(R.id.pdfasthma);

        pdfa.fromAsset("Asthma.pdf").load();
        }
}

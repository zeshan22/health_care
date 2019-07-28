package com.firstapplication.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class FoodPosioning extends AppCompatActivity {
    PDFView pdffp_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_posioning);
        pdffp_view=(PDFView) findViewById(R.id.pdffp);

        pdffp_view.fromAsset("Food Poisoning.pdf").load();
    }
}

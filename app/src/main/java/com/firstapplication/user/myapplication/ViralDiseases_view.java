package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView; //Listview is a widget so we imported the library
import android.widget.Toast;

public class ViralDiseases_view extends AppCompatActivity {
ListView lst02;
String [] viral = {"Mumps","Scabies","Measles","Chicken Pox","Small Pox","Hepatitis"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viral_diseases_view);


        lst02 = (ListView) findViewById(R.id.lstview02);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,viral);
        lst02.setAdapter(adapter);

    }
}

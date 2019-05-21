package com.firstapplication.user.myapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView; //Listview is a widget so we imported the library
import android.widget.Toast;

public class BacterialDiseases extends AppCompatActivity {
ListView lst03;
String [] bact = {"Diphtheria", "Whooping Cough", "Tatanus"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacterial_diseases);
        lst03 = (ListView) findViewById(R.id.lstview03);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,bact);
        lst03.setAdapter(adapter);
    }
}

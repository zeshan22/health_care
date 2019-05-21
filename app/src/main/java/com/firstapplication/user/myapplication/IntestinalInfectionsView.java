package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView; //Listview is a widget so we imported the library
import android.widget.Toast;

public class IntestinalInfectionsView extends AppCompatActivity {
ListView lst01;
//we are creating an array which is used as a data source
    String[] iidieases = {"Cholera","Typhoid Fever","Food Poisioing"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intestinal_infections_view);
        //listview is initialized
        lst01 = (ListView) findViewById(R.id.lstview01);
        //we are using now arrayadapter. in java and android it is used as a middle man.
        // yeh kisi bhi data source se data le kar usse view (listview) pe show karwaen ge.

        // phele perimter jis class mein hum kaam kar rahe han us ka nam likhe ge. chahe this likho
        // ya phr pora class ka name jis ma hum kam kar rahe han dusra perimeter hum android ka
        // template ha list view ka usse likhe ge thesra us array ka naam jo asal ma data source hai.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,iidieases);

        // ab data ko list view pa set krna hai to
        lst01.setAdapter(adapter);

        }


}

package com.firstapplication.user.myapplication;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;

import java.util.Calendar;

public class next2video extends AppCompatActivity {

    Button button1,button2,connect;


    Calendar c;

    private Toolbar mToolbar;
    Context context=this;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next2video);

        button1=findViewById(R.id.button1);

        button2=findViewById(R.id.button2);

        connect=findViewById(R.id.connect);
        c=Calendar.getInstance();


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int day=c.get(Calendar.DAY_OF_MONTH);
                int month=c.get(Calendar.MONTH);
                int year=c.get(Calendar.YEAR);


                DatePickerDialog datePickerDialog=new DatePickerDialog(next2video.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int myear, int mmonth, int mdayOfMonth) {



                    }
                },day,month,year);

                datePickerDialog.show();

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                final int hours=c.get(Calendar.HOUR_OF_DAY);

                final int minutes=c.get(Calendar.MINUTE);

                TimePickerDialog timePickerDialog=new TimePickerDialog(context, new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int  minute) {

                    }
                },hours,minutes,android.text.format.DateFormat.is24HourFormat(context));


                timePickerDialog.show();



            }
        });


        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(getApplicationContext(),VideoActivity.class);
                startActivity(intent);

            }
        });







        mToolbar = (Toolbar) findViewById(R.id.main_page_toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Book Appointment");

        // add back arrow to toolbar
        if (getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

    }
}

package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class delay1afterwelcomepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delay1afterwelcomepage);
        Thread td=new Thread(){
            public void run()
            {
                try{
                    sleep(2000);
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
                finally {
                    Intent delaytomainmenu= new Intent(delay1afterwelcomepage.this, mainmenu.class);
                    startActivity(delaytomainmenu);
                }
            }
        };td.start();

    }
}

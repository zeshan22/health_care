package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);
        Thread td=new Thread(){
            public void run()
            {
                try{
                    sleep(3000);
                }
                catch(Exception ex) {
                    ex.printStackTrace();
                }
                finally {
                    Intent welcometodelay= new Intent(WelcomePage.this, delay1afterwelcomepage.class);
                    startActivity(welcometodelay);
                }
            }
        };td.start();

    }

}

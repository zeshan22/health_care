package com.firstapplication.user.myapplication;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    SQLiteOpenHelper openHelper;

    SQLiteDatabase db;

    Cursor cursor;
    Button b2;
    EditText email1,pass1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        openHelper=new DatabaseHelper(this);
        b2 = (Button) findViewById(R.id.button2);

        email1=(EditText) findViewById(R.id.email1);
        pass1=(EditText) findViewById(R.id.pass1);

        db = openHelper.getReadableDatabase();




        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String input1 = email1.getText().toString();
                String input2 = pass1.getText().toString();

                cursor = db.rawQuery("SELECT *FROM " + DatabaseHelper.TABLE_SIGNUP+ " WHERE " + DatabaseHelper.KEY_EMAIL + "=? AND " + DatabaseHelper.KEY_PASSWORD + "=?", new String[]{input1, input2});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_SHORT).show();

                        Intent it = new Intent(MainActivity.this, BMI.class);
                        startActivity(it);


                    } else {
                        Toast.makeText(getApplicationContext(), "Login error", Toast.LENGTH_SHORT).show();
                    }
                }

            }
    });

    }
}

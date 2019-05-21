package com.firstapplication.user.myapplication;
import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


public class SignUP extends AppCompatActivity {
    EditText edi_01, edi_02, edi_03, edi_04;

    SQLiteDatabase db;

    SQLiteOpenHelper openHelper;
    RadioGroup radioGroup;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        openHelper=new DatabaseHelper(this);

        Button btn = (Button) findViewById(R.id.Next);



        edi_01 = (EditText) findViewById(R.id.edi_01);
        edi_02= (EditText) findViewById(R.id.edi_02);
        edi_03 = (EditText) findViewById(R.id.edi_03);
        edi_04 = (EditText) findViewById(R.id.edi_04);
        radioGroup=(RadioGroup) findViewById(R.id.rdbgroup);
        RadioButton radioButton=(RadioButton) findViewById(R.id.rdb1);
        RadioButton radioButton2=(RadioButton) findViewById(R.id.rdb2);


        btn.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {

                db=openHelper.getWritableDatabase();


                String txt1 = edi_01.getText().toString();
                String txt2 = edi_02.getText().toString();
                String txt3 = edi_03.getText().toString();
                String txt4 = edi_04.getText().toString();

                String type=null;

                switch (radioGroup.getCheckedRadioButtonId()) {
                    case R.id.rdb1:
                        type="Male";
                        break;
                    case R.id.rdb2:
                        type="Female";
                        break;
                }

                insertStudent(txt1, txt2, txt3, txt4, type);
                Toast.makeText(getApplicationContext(),"Account Created",Toast.LENGTH_LONG).show();

                Intent it = new Intent(SignUP.this, WelcomePage.class);
                startActivity(it);







            }

            public void insertStudent(String txt1, String txt2, String txt3, String txt4, String type) {


                ContentValues contentValues = new ContentValues();
                contentValues.put(DatabaseHelper.KEY_NAME, txt1);
                contentValues.put(DatabaseHelper.KEY_AGE, txt2);
                contentValues.put(DatabaseHelper.KEY_EMAIL, txt3);
                contentValues.put(DatabaseHelper.KEY_PASSWORD, txt4);
                long id = db.insert(DatabaseHelper.TABLE_SIGNUP, null, contentValues);


            }



        });


    }

}
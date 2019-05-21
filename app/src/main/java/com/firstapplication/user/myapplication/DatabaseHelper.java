package com.firstapplication.user.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.security.Key;



public class DatabaseHelper extends SQLiteOpenHelper {


    //Database name

    public static final String DATABASE_NAME = "Health_app";


    public static final int DATABASE_VERSION = 1;


    public static final String TABLE_SIGNUP = "tblsignup";

    public static final String KEY_ROWID = "_id";
    public static final String KEY_NAME = "name";
    public static final String KEY_AGE = "age";
    public static final String KEY_EMAIL = "email";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_RADIO = "radiobut";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String CREATE_APP_TABLE = "CREATE TABLE " + TABLE_SIGNUP + "(" + KEY_ROWID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + KEY_NAME + " TEXT, " + KEY_AGE + " TEXT, " + KEY_EMAIL + " TEXT, " + KEY_PASSWORD + " TEXT, " + KEY_RADIO + " TEXT);";


        db.execSQL(CREATE_APP_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SIGNUP); //Drop older table if exists
        onCreate(db);


    }


}
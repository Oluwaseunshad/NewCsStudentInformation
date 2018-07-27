package com.example.oluwaseunshad.myapplication.database.model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.Cursor;

import com.example.oluwaseunshad.myapplication.StudentInformation;


public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "cs_student_info_db";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {

        // create notes table
        db.execSQL(StudentInformation.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + StudentInformation.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public boolean insertValues(String name, String student_id, String interest, String origin, String hobby,
                                String lang_prog, String grad_plan, String attract_bg, String facts, String studentEmailAdd) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(StudentInformation.COLUMN_NAME, name);
        values.put(StudentInformation.COLUMN_STUDENT_ID, student_id);
        values.put(StudentInformation.COLUMN_RESEARCH, interest);
        values.put(StudentInformation.COLUMN_ORIGIN, origin);
        values.put(StudentInformation.COLUMN_HOBBIES, hobby);
        values.put(StudentInformation.COLUMN_LANGUAGE, lang_prog);
        values.put(StudentInformation.COLUMN_GRAD_PLAN, grad_plan);
        values.put(StudentInformation.COLUMN_ATTRACT_BG, attract_bg);
        values.put(StudentInformation.COLUMN_FACTS, facts);
        values.put(StudentInformation.COLUMN_STUDENT_EMAIL, studentEmailAdd);
        // insert row
        long result =  db.insert(StudentInformation.TABLE_NAME, null, values);
        // close db connection
        db.close();

        if (result == -1){
            return false;
        }
        else{
            return true;
        }



    }

    public Cursor readEntry() {

        SQLiteDatabase db = this.getWritableDatabase();
        String[] allColumns = new String[] { StudentInformation.COLUMN_NAME, StudentInformation.COLUMN_STUDENT_EMAIL};
        Cursor c = db.query(StudentInformation.TABLE_NAME, allColumns, null, null, null,
                null, null);

        if (c != null) {
            c.moveToFirst();
        }
        return c;

    }
}
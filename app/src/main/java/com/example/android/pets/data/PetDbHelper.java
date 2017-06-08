package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.android.pets.data.PetContract.PetEntry;

/**
 * Created by mikem on 6/8/2017.
 */

public class PetDbHelper extends SQLiteOpenHelper{

    /** Name of the database file*/
    public static final String DATABASE_NAME = "shelter.db";

    /**  Databse version. If you change the database schema, you must increment the database version */
    public static final int DATABASE_VERSION = 1;


    public PetDbHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i("batman",SQL_CREATE_PETS_TABLE);
        db.execSQL(SQL_CREATE_PETS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_PETS_TABLE);
        onCreate(db);
    }

    //create pets table command
    public static final String SQL_CREATE_PETS_TABLE =
            "CREATE TABLE " + PetEntry.TABLE_NAME + " (" +
                    PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                    PetEntry.COLUMN_PET_BREED + " TEXT, " +
                    PetEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL, " +
                    PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0)";

    //Drop pets table
    private static final String SQL_DELETE_PETS_TABLE =
            "DROP TABLE IF EXISTS " + PetEntry.TABLE_NAME;
}

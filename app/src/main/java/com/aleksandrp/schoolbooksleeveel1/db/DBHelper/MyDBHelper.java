package com.aleksandrp.schoolbooksleeveel1.db.DBHelper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.aleksandrp.schoolbooksleeveel1.db.constants.ValuesDB;


/**
 * Created by Aleksandr on 25.09.2015.
 */
public class MyDBHelper extends SQLiteOpenHelper implements ValuesDB {

    public MyDBHelper(Context context) {
        super(context, NAME_DB, null, VERSION_DB);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.i(TAG_DB, "Start ::: " + CREATE_TABLE_BOOK);
        db.execSQL(CREATE_TABLE_BOOK);
        Log.i(TAG_DB, "Finish  ::: ");

        Log.i(TAG_DB, "Start ::: " + TABLE_GDZ_LEVEL_1);
        db.execSQL(CREATE_TABLE_GDZ);
        Log.i(TAG_DB, "Finish  ::: ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}

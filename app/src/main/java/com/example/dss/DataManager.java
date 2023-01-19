package com.example.dss;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DataManager {
    private SQLiteDatabase db;

    public static final String TABLE_ROW_ID = "_id";
    public static final String TABLE_ROW_PASS = "pass";
    public static final String TABLE_ROW_COMMENT = "comment";

    private static final String DB_NAME = "login";
    private static final int DB_VERSION = 1;
    private static final String TABLE_DATA = "data";

    private class CustomSQLiteOpenHelper extends SQLiteOpenHelper {
        public CustomSQLiteOpenHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
        }
        @Override
        public void onCreate(SQLiteDatabase db) {
        String newTableQueryString = "create table "
                + TABLE_DATA + "( "
                + TABLE_ROW_ID
                + " text primary key not null,"
                + TABLE_ROW_PASS
                + " text not null,"
                + TABLE_ROW_COMMENT
                + " text not null);";
        db.execSQL(newTableQueryString);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        }

    }

    public DataManager(Context context)
    {
        CustomSQLiteOpenHelper helper = new CustomSQLiteOpenHelper(context);
        db = helper.getWritableDatabase();
    }
    public void register(String _id, String pass)
    {
        String query = "INSERT INTO " + TABLE_DATA + " (" +
        TABLE_ROW_ID +", " +
        TABLE_ROW_PASS + ") " +
        "VALUES (" +
        "'" + _id + "'" + ", "
        + "'" + pass + "'" + ")";
        Log.i("register()", query);
        db.execSQL(query);

    }
    public void comment(String comment)
    {
        String query = "INSERT INTO " + TABLE_DATA + " (" +
                TABLE_ROW_COMMENT + ") " +
                "VALUES (" +
                 "'" + comment + "'" + ")";
        Log.i("comment()", query);
        db.execSQL(query);

    }

    public Cursor displaycomment(String _id , String comment)
    {
    String query ="SELECT " +
            TABLE_ROW_ID + ", " +
            TABLE_ROW_COMMENT + " from "
            + TABLE_DATA + " WHERE "
            + TABLE_ROW_ID + " = '" + _id + "';";
            Log.i("showCom()",query);
        Cursor c = db.rawQuery(query, null);
        return c;
    }
}

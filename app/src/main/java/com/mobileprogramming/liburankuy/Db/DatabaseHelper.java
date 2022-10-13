package com.mobileprogramming.liburankuy.Db;

import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.TABLE_NAME;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "db_liburankuy";
    private static final int DATABASE_VERSION = 2;
    private static final String SQL_CREATE_TABLE_PERJALANAN = String.format("CREATE TABLE %s"
            + "%s INTEGER PRIMARY KEY AUTOINCREMENT," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," +
                    " %s TEXT NOT NULL," ,
            TABLE_NAME,
            DatabaseContract.PerjalananColumns._ID,
            PerjalananColumns.NAMA,
            PerjalananColumns.DESKRIPSI,
            PerjalananColumns.LOKASI,
            PerjalananColumns.HARGA,
            PerjalananColumns.JAM,
            PerjalananColumns.FASILITAS,
            PerjalananColumns.GMAPS,
            PerjalananColumns.MENU,
            PerjalananColumns.PHOTOTHUMBNAIL,
            PerjalananColumns.PHOTOPOSTER
    );

    DatabaseHelper(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TABLE_PERJALANAN);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }
}

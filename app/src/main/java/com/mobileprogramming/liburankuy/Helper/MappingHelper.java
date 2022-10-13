package com.mobileprogramming.liburankuy.Helper;

import android.database.Cursor;

import com.mobileprogramming.liburankuy.Db.DatabaseContract;
import com.mobileprogramming.liburankuy.Model.Perjalanan;

import java.util.ArrayList;

public class MappingHelper {
    public static ArrayList<Perjalanan> mapCursorToArrayList(Cursor perjalananCursor){
        ArrayList<Perjalanan> perjalananList = new ArrayList<>();

        while (perjalananCursor.moveToNext()){
            int id = perjalananCursor.getInt(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns._ID));
            String nama = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.NAMA));
            String deskripsi = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.DESKRIPSI));
            String lokasi = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.LOKASI));
            String harga = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.HARGA));
            String jam = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.JAM));
            String fasilitas = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.FASILITAS));
            String gmaps = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.GMAPS));
            String menu = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.MENU));
            String photoThumbnail = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.PHOTOTHUMBNAIL));
            String photoPoster = perjalananCursor.getString(perjalananCursor.getColumnIndexOrThrow(DatabaseContract.PerjalananColumns.PHOTOPOSTER));
        }
        return perjalananList;
    }
}

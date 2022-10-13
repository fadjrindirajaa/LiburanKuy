package com.mobileprogramming.liburankuy.Db;

import android.provider.BaseColumns;
import android.view.Menu;

public class DatabaseContract {

    public static final class PerjalananColumns implements BaseColumns{
        public static final String TABLE_NAME = "perjalan";
        public static final String NAMA = "nama";
        public static final String DESKRIPSI = "deskripsi";
        public static final String LOKASI = "lokasi";
        public static final String HARGA = "harga";
        public static final String JAM = "jam";
        public static final String FASILITAS = "fasilitas";
        public static final String GMAPS = "gmaps";
        public static final String MENU = "menu";
        public static final String PHOTOTHUMBNAIL = "photothumbnail";
        public static final String PHOTOPOSTER = "photoposter";
    }


}

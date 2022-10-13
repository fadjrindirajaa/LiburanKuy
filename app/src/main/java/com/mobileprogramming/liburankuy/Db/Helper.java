package com.mobileprogramming.liburankuy.Db;

import static android.provider.BaseColumns._ID;
import static com.mobileprogramming.liburankuy.Db.DatabaseContract.PerjalananColumns.TABLE_NAME;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Helper {
    private static final String DATABASE_TABLE = TABLE_NAME;
    private static DatabaseHelper databaseHelper;
    private static Helper INSTANCE;

    private static SQLiteDatabase database;

    private Helper(Context context){
        databaseHelper = new DatabaseHelper(context);
    }

    public static Helper getInstance(Context context){
        if(INSTANCE == null){
            synchronized (SQLiteOpenHelper.class){
                if(INSTANCE == null){
                    INSTANCE = new Helper(context);
                }
            }
        }
        return INSTANCE;
    }

    public void open() throws SQLException{
        database = databaseHelper.getWritableDatabase();
    }

    public void close(){
        databaseHelper.close();

        if(database.isOpen())
            database.close();
    }

    /**
     * Ambil data dari semua note yang ada di dalam database
     *
     * @return cursor hasil queryAll
     */
    public Cursor queryAll() {
        return database.query(
                DATABASE_TABLE,
                null,
                null,
                null,
                null,
                null,
                _ID + " ASC");
    }


    /**
     * Simpan data ke dalam database
     *
     * @param values nilai data yang akan di simpan
     * @return long id dari data yang baru saja di masukkan
     */
    public long insert(ContentValues values) {
        return database.insert(DATABASE_TABLE, null, values);
    }

    /**
     * Delete data dalam database
     *
     * @param id data dengan id berapa yang akan di delete
     * @return int jumlah data yang ter-delete
     */
    public int deleteById(String id) {
        return database.delete(DATABASE_TABLE, _ID + " = ?", new String[]{id});
    }

}

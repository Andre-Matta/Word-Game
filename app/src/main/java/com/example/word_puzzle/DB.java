package com.example.word_puzzle;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DB extends SQLiteOpenHelper {
    public static final String DBname = "game_data_base";
    SQLiteDatabase game_data_base;

    public DB(@Nullable Context context) {
        super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table my_table (level_difficulty INTEGER PRIMARY KEY AUTOINCREMENT ," + " level_number INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS my_table");
        onCreate(db);
    }

    public void insert_data(int level_number) {
        ContentValues row = new ContentValues();
        row.put("level_number", level_number);
        game_data_base = getWritableDatabase();
        game_data_base.insert("my_table", null, row);
        game_data_base.close();
    }

    public void update_data(int level_number, int level_difficulty) {
        ContentValues row = new ContentValues();
        row.put("level_number", level_number);
        game_data_base = getWritableDatabase();
        game_data_base.update("my_table", row, "level_difficulty like ?", new String[]{String.valueOf(level_difficulty)});
        game_data_base.close();
    }

    public int get_max_level(int level_difficulty) {
        game_data_base = getReadableDatabase();
        Cursor cursor = game_data_base.rawQuery("SELECT * FROM my_table ", null);
        int max_level;
        cursor.moveToFirst();

        if (level_difficulty == 1) {
            max_level = cursor.getInt(1);
        } else {
            cursor.moveToNext();
            max_level = cursor.getInt(1);
        }
        game_data_base.close();
        cursor.close();
        return max_level;
    }

    public void delete_rows() {
        int delete_rows = 3;

        game_data_base = getWritableDatabase();
        game_data_base.delete("my_table", "level_difficulty > ?  ", new String[]{String.valueOf(delete_rows)});


    }


}
package com.example.notesappsaveonly

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, "note.db",null,1) {
   private val sqLiteDatabase : SQLiteDatabase = writableDatabase
    override fun onCreate(db: SQLiteDatabase?) {
       if(db != null){
           db.execSQL("create table notes (Note text)")
       }
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }


    fun saveData(note : String){
        val db = this.writableDatabase

        val contentValue = ContentValues()
        contentValue.put("Note" , note)
        sqLiteDatabase.insert("Notes",null,contentValue)

    }
}
package com.example.notesappsaveonly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val databaseHelper by lazy { DatabaseHelper(applicationContext) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btSave.setOnClickListener {
            val note = etNote.text.toString()
            databaseHelper.saveData(note)
            Toast.makeText(this,"Added successfully",Toast.LENGTH_LONG).show()
        }
    }
}
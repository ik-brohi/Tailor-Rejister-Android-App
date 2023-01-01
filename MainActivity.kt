package com.example.mytailorrigesterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




        setContentView(R.layout.activity_main)

        var btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener{


            var intent = Intent( this, HomePage::class.java)
            startActivity(intent)


        }
    }
}
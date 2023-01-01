package com.example.mytailorrigesterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class DeleteRecordPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_delete_record_page)

        var btnSearchDelete = findViewById<Button>(R.id.btnSearchDelete)
        btnSearchDelete.setOnClickListener{

        }
    }
}
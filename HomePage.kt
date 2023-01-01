package com.example.mytailorrigesterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        val btnAddRecord = findViewById<Button>(R.id.btnAddRecord)
        btnAddRecord.setOnClickListener{
            val intent = Intent(this, AddRecord::class.java)
            startActivity(intent)
        }

        val btnSearchRecord = findViewById<Button>(R.id.btnSearchRecord)
        btnSearchRecord.setOnClickListener{
            val intentSearch = Intent(this, SearchPage::class.java)
            startActivity(intentSearch)
        }

        val btnUpdateRecord = findViewById<Button>(R.id.btnUpdateRecord)
        btnUpdateRecord.setOnClickListener{
            val intentUpdate = Intent(this, UpdateRecordPage::class.java)
            startActivity(intentUpdate)
        }

        val btnDeleteRecord = findViewById<Button>(R.id.btnDeleteRecord)
        btnDeleteRecord.setOnClickListener{
            val intentDelete = Intent(this, DeleteRecordPage::class.java)
            startActivity(intentDelete)
        }

        val btnAboutApp = findViewById<Button>(R.id.btnAboutApp)
        btnAboutApp.setOnClickListener{
            val intentAboutApp = Intent(this, AboutAppPage::class.java)
            startActivity(intentAboutApp)
        }

    }
}
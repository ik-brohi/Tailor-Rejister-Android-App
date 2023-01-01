package com.example.mytailorrigesterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SearchPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search_page)



        val btnSingleSearch = findViewById<Button>(R.id.btnSingleSearch)
        btnSingleSearch.setOnClickListener{
            val intent = Intent(this, SingleSearchScreen::class.java)
            startActivity(intent)
        }

        val btnViewAllRecords = findViewById<Button>(R.id.btnViewAllRecords)
        btnViewAllRecords.setOnClickListener{
            val intent = Intent(this, ViewAllRecordsPage::class.java)
            startActivity(intent)





        }


        }
    }

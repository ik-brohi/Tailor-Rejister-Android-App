package com.example.mytailorrigesterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SingleSearchScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_search_screen)


        val txtSearch = findViewById<EditText>(R.id.txtSearch)




        var db : DBHelper
        var recyclerView = findViewById<RecyclerView>(R.id.recView2)
        var adapter : myAdaptor? = null
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = myAdaptor()
        recyclerView.adapter = adapter

        db = DBHelper(this)
        var btnSearch = findViewById<Button>(R.id.btnSearch)
        btnSearch.setOnClickListener{
            TailorsDataHolder.txtSearch = txtSearch.text.toString()
            Toast.makeText(this, TailorsDataHolder.txtSearch+" Information added into Database ", Toast.LENGTH_LONG).show()

            val customerList = db.searchCustomer()
            adapter.addItems(customerList)
        }



    }
}
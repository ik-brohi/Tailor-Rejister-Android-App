package com.example.mytailorrigesterapp

import android.annotation.SuppressLint
import android.database.Cursor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewAllRecordsPage : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_all_records_page)
        var db : DBHelper
        var recyclerView = findViewById<RecyclerView>(R.id.recView)
        var adapter : myAdaptor? = null
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = myAdaptor()
        recyclerView.adapter = adapter

         db = DBHelper(this)

        val btnShowAllRecords = findViewById<Button>(R.id.btnShowAllRecords)
        btnShowAllRecords.setOnClickListener{
             val customerList = db.getCustomer()
            adapter.addItems(customerList)




        }




       // var dataHolder : ArrayList<TailorsDataHolder>? = null

       //val btnShowAllRecords = findViewById<Button>(R.id.btnShowAllRecords)

      //  btnShowAllRecords.setOnClickListener{

      //      var recView = findViewById<View>(R.id.recView) as RecyclerView
      //      recView!!.layoutManager = LinearLayoutManager(this)

         //   val cursor: Cursor? = DBHelper(this).getCustomer()
         //   dataHolder = ArrayList()

            // below is the variable for cursor

            // we have called method to get
            // all names from our database
            // and add to name text view

           /* val serialNo = findViewById<TextView>(R.id.textView57)
            val name = findViewById<TextView>(R.id.textView58)
            val cnicNo  = findViewById<TextView>(R.id.textView59)
            val contact = findViewById<TextView>(R.id.textView60)
            val address = findViewById<TextView>(R.id.textView61)
            val kamizLength = findViewById<TextView>(R.id.textView62)
            val arm = findViewById<TextView>(R.id.textView63)
            val shoulder = findViewById<TextView>(R.id.textView64)
            val collar = findViewById<TextView>(R.id.textView65)
            val width = findViewById<TextView>(R.id.textView66)
            val salwarLength = findViewById<TextView>(R.id.textView67)
            val pancha = findViewById<TextView>(R.id.textView68)
            val noOfSuits = findViewById<TextView>(R.id.textView69)
            val designDescription = findViewById<TextView>(R.id.textView70)
            val advancePayment = findViewById<TextView>(R.id.textView71)
            val totalPayment = findViewById<TextView>(R.id.textView72)
            val orderTime = findViewById<TextView>(R.id.textView73)
            val orderDate = findViewById<TextView>(R.id.textView74)

            // moving the cursor to first position and
            // appending value in the text view
            cursor!!.moveToFirst()
            serialNo.append(cursor.getString(cursor.getColumnIndex(DBHelper.SERIAL_NO_COl)) + "\n")
            name.append(cursor.getString(cursor.getColumnIndex(DBHelper.NAME_COL)) + "\n")
            cnicNo.append(cursor.getString(cursor.getColumnIndex(DBHelper.CNIC_NO_COL)) + "\n")
            contact.append(cursor.getString(cursor.getColumnIndex(DBHelper.CONTACT_COL)) + "\n")
            address.append(cursor.getString(cursor.getColumnIndex(DBHelper.ADDRESS_COL)) + "\n")
            kamizLength.append(cursor.getString(cursor.getColumnIndex(DBHelper.LENGTH_K_COL)) + "\n")
            arm.append(cursor.getString(cursor.getColumnIndex(DBHelper.ARM_COL)) + "\n")
            shoulder.append(cursor.getString(cursor.getColumnIndex(DBHelper.SHOULDER_COL)) + "\n")
            collar.append(cursor.getString(cursor.getColumnIndex(DBHelper.COLLAR_COL)) + "\n")
            width.append(cursor.getString(cursor.getColumnIndex(DBHelper.WIDTH_COL)) + "\n")
            salwarLength.append(cursor.getString(cursor.getColumnIndex(DBHelper.LENGTH_S_COL)) + "\n")
            pancha.append(cursor.getString(cursor.getColumnIndex(DBHelper.PANCHA_COL)) + "\n")
            noOfSuits.append(cursor.getString(cursor.getColumnIndex(DBHelper.NO_OF_SUITS_COL)) + "\n")
            designDescription.append(cursor.getString(cursor.getColumnIndex(DBHelper.DESIGN_DESCRIPTION_COL)) + "\n")
            advancePayment.append(cursor.getString(cursor.getColumnIndex(DBHelper.ADVANCE_PAYMENT_COL)) + "\n")
            totalPayment.append(cursor.getString(cursor.getColumnIndex(DBHelper.TOTAL_PAYMENT_COL)) + "\n")
            orderTime.append(cursor.getString(cursor.getColumnIndex(DBHelper.ORDER_TIME_COL)) + "\n")
            orderDate.append(cursor.getString(cursor.getColumnIndex(DBHelper.ORDER_DATE_COL)) + "\n")

*/
            // moving our cursor to next
            // position and appending values

               // while(cursor!!.moveToNext()){

                //    var obj =   TailorsDataHolder(cursor.getString(0),cursor.getString(1),cursor.getString(2),cursor.getString(3),cursor.getString(4),cursor.getString(5),cursor.getString(6),cursor.getString(7),cursor.getString(8),cursor.getString(9),cursor.getString(10),cursor.getString(11),cursor.getString(12),cursor.getString(13),cursor.getString(14),cursor.getString(15),cursor.getString(16),cursor.getString(17))
                //    dataHolder!!.add(obj)
               // }
               // var adapter = myAdaptor(dataHolder!!)
               // recView!!.adapter = adapter



            // at last we close our cursor
//            cursor.close()
       // }








    }
}


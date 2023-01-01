package com.example.mytailorrigesterapp

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class SuitPaymentDate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_suit_payment_date)
        val db = DBHelper(this)
        var btnSaveRecord = findViewById<Button>(R.id.btnSaveRecord)

        btnSaveRecord.setOnClickListener {

            val txtnoOfSuits = findViewById<EditText>(R.id.txtSuitNo)
            val txtDesignDescription = findViewById<EditText>(R.id.txtDesignDescription)
            val txtAdvancePayment = findViewById<EditText>(R.id.txtAdvancePayment)
            val txtTotalPayment = findViewById<EditText>(R.id.txtTotalPayment)
            val txtTime = findViewById<EditText>(R.id.txtTime)
            val txtDate = findViewById<EditText>(R.id.txtDate)


            TailorsDataHolder.noOfSuits = txtnoOfSuits.text.toString();
            TailorsDataHolder.designDescription = txtDesignDescription.text.toString();
            TailorsDataHolder.advancePayment = txtAdvancePayment.text.toString();
            TailorsDataHolder.totalPayment = txtTotalPayment.text.toString();
            TailorsDataHolder.orderTime = txtTime.text.toString();
            TailorsDataHolder.orderDate = txtDate.text.toString();

            val serialNo =TailorsDataHolder.serialNo.toString()
            val name = TailorsDataHolder.name.toString()
            val cnicNo = TailorsDataHolder.cnicNo.toString()
            val contact = TailorsDataHolder.contact.toString()
            val address = TailorsDataHolder.address.toString()
            val kamizLength =TailorsDataHolder.kamizLength.toString()
            val arm = TailorsDataHolder.arm.toString()
           val shoulder = TailorsDataHolder.shoulder.toString()
            val collar =TailorsDataHolder.collar.toString()
           val width = TailorsDataHolder.width.toString()
            val salwarLength =TailorsDataHolder.salwarLength.toString()
            val pancha =TailorsDataHolder.pancha.toString()
            val noOfSuits = TailorsDataHolder.noOfSuits.toString()
            val designDescription =TailorsDataHolder.designDescription.toString()
            val advancePayment =TailorsDataHolder.advancePayment.toString()
            val totalPayment = TailorsDataHolder.totalPayment.toString()
            val orderTime =TailorsDataHolder.orderTime.toString()
            val orderDate =TailorsDataHolder.orderDate.toString()

            val cust = CustomerModel(serialNo = serialNo, name = name, cnicNo =cnicNo, contact =contact, address =address, kamizLength = kamizLength, arm =arm, shoulder = shoulder, collar = collar, width = width, salwarLength =salwarLength, pancha = pancha, noOfSuits = noOfSuits, designDescription = designDescription, advancePayment = advancePayment, totalPayment = totalPayment, orderTime = orderTime, orderDate = orderDate)


            db.addCustomerMeasurementsAll(cust)

            // Toast to message on the screen
            Toast.makeText(this, TailorsDataHolder.name+" Information added into Database ", Toast.LENGTH_LONG).show()

            // at last, clearing edit texts
            txtnoOfSuits.text.clear()
            txtDesignDescription.text.clear()
            txtAdvancePayment.text.clear()
            txtTotalPayment.text.clear()
            txtTime.text.clear()
            txtDate.text.clear()


            var builder = AlertDialog.Builder(this)
            builder.setTitle("Your Record Has Been Saved Successfully!")
            builder.setMessage("If you want to add another record Click ADD \n Else Click Cancel To Go Home ")
            builder.setPositiveButton("Add", DialogInterface.OnClickListener { dialog, id ->
                var intent = Intent(this, AddRecord::class.java)
                startActivity(intent)
            })
            builder.setNegativeButton("Cancel", DialogInterface.OnClickListener { dialog, id ->
                var intent = Intent(this, HomePage::class.java)
                startActivity(intent);

            })
            var alert = builder.create()
            alert.show()
        }
    }
}
package com.example.mytailorrigesterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

open class AddRecord : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_record)

        var btnNext = findViewById<Button>(R.id.btnNext)

        btnNext.setOnClickListener {
            val txtSerialNo = findViewById<EditText>(R.id.txtSerialNo)
            val txtName = findViewById<EditText>(R.id.txtName)
            val txtCNIC = findViewById<EditText>(R.id.txtCNIC)
            val txtContact = findViewById<EditText>(R.id.txtContat)
            val txtAddress = findViewById<EditText>(R.id.txtAddress)


            TailorsDataHolder.serialNo = txtSerialNo.text.toString();
            TailorsDataHolder.name = txtName.text.toString();
            TailorsDataHolder.cnicNo = txtCNIC.text.toString();
            TailorsDataHolder.contact = txtContact.text.toString();
            TailorsDataHolder.address = txtAddress.text.toString();

            var intent = Intent(this, CustomerMeasurement::class.java)
            startActivity(intent)


        }


    }
}

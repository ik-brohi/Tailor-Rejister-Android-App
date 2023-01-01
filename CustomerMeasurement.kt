package com.example.mytailorrigesterapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class CustomerMeasurement : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_measurement)
        var btnNext2 = findViewById<Button>(R.id.btnNext2)
        btnNext2.setOnClickListener {


            val txtKLength = findViewById<EditText>(R.id.txtKLength)
            val txtArm = findViewById<EditText>(R.id.txtArm)
            val txtShoulder = findViewById<EditText>(R.id.txtShoulder)
            val txtCollar = findViewById<EditText>(R.id.txtCollar)
            val txtWidth = findViewById<EditText>(R.id.txtWidth)
            val txtSLength = findViewById<EditText>(R.id.txtSLength)
            val txtPancha = findViewById<EditText>(R.id.txtPancha)


            TailorsDataHolder.kamizLength = txtKLength.text.toString();
            TailorsDataHolder.arm = txtArm.text.toString();
            TailorsDataHolder.shoulder = txtShoulder.text.toString();
            TailorsDataHolder.collar = txtCollar.text.toString();
            TailorsDataHolder.width = txtWidth.text.toString();
            TailorsDataHolder.salwarLength = txtSLength.text.toString();
            TailorsDataHolder.pancha = txtPancha.text.toString();

            var intent = Intent(this, SuitPaymentDate::class.java)
            startActivity(intent)
        }


    }
}
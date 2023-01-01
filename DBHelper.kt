package com.example.mytailorrigesterapp

import android.annotation.SuppressLint
import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper


class DBHelper(context: Context) :
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {


    companion object {

        private const val DATABASE_NAME = "CHOICE_TAILORS_REGISTER"

        private const val DATABASE_VERSION = 1

        const val TABLE_NAME = "CUSTOMER_INFO_TABLE"

        const val SERIAL_NO_COl = "serialNo"
        const val NAME_COL = "name"
        const val CNIC_NO_COL = "cnicNo"
        const val CONTACT_COL = "contact"
        const val ADDRESS_COL = "address"
        const val LENGTH_K_COL = "kamizLength"
        const val ARM_COL = "arm"
        const val SHOULDER_COL = "shoulder"
        const val COLLAR_COL = "collar"
        const val WIDTH_COL = "width"
        const val LENGTH_S_COL = "salwarLength"
        const val PANCHA_COL = "pancha"
        const val NO_OF_SUITS_COL = "noOfSuits"
        const val DESIGN_DESCRIPTION_COL = "designDescription"
        const val ADVANCE_PAYMENT_COL = "advancePayment"
        const val TOTAL_PAYMENT_COL = "totalPayment"
        const val ORDER_TIME_COL = "orderTime"
        const val ORDER_DATE_COL = "orderDate"


    }
    override fun onCreate(db: SQLiteDatabase) {



        val query = ("CREATE TABLE " + TABLE_NAME + " (" +
                SERIAL_NO_COl + " TEXT PRIMARY KEY," +
                NAME_COL + " TEXT," +
                CNIC_NO_COL + " TEXT," +
                CONTACT_COL + " TEXT," +
                ADDRESS_COL + " TEXT," +
                LENGTH_K_COL + " TEXT," +
                ARM_COL + " TEXT," +
                SHOULDER_COL + " TEXT," +
                COLLAR_COL + " TEXT," +
                WIDTH_COL + " TEXT," +
                LENGTH_S_COL + " TEXT," +
                PANCHA_COL + " TEXT," +
                NO_OF_SUITS_COL + " TEXT," +
                DESIGN_DESCRIPTION_COL + " TEXT," +
                ADVANCE_PAYMENT_COL + " TEXT," +
                TOTAL_PAYMENT_COL + " TEXT," +
                ORDER_TIME_COL + " TEXT," +
                ORDER_DATE_COL + " TEXT" + ")")

        // we are calling sqlite
        // method for executing our query
        db.execSQL(query)
    }

    override fun onUpgrade(db: SQLiteDatabase, p1: Int, p2: Int) {
        // this method is to check if table already exists
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }

    // below we are creating
    // a content values variable
    val values = ContentValues()
    val db = this.writableDatabase



//
//    fun addCustomerMeasurement(
//        kamizLength: String,
//        arm: String,
//        shoulder: String,
//        collar: String,
//        width: String,
//
//
//        // we are inserting our values
//        // in the form of key-value pair
//
//        values.put(LENGTH_K_COL, kamizLength)
//    values.put(ARM_COL, arm)
//    values.put(SHOULDER_COL, shoulder)
//    values.put(COLLAR_COL, collar)
//    values.put(WIDTH_COL, width)
//    values.put(LENGTH_S_COL, salwarLength)
//    values.put(PANCHA_COL, pancha)
//
//    // here we are creating a
//    // writable variable of
//    // our database as we want to
//    // insert value in our database
//
//
//    // all values are inserted into database
//    db.insert(TABLE_NAME, null, values)
//
//    // at last we are
//    // closing our database
//    db.close()
//}   salwarLength: String,



    fun addCustomerMeasurementsAll( cust : CustomerModel): Long{

        values.put("serialNo", cust.serialNo)
        values.put("name",cust.name)
        values.put("cnicNo", cust.cnicNo)
        values.put("contact",cust.contact)
        values.put("address",cust.address)
        values.put("kamizLength",cust.kamizLength)
        values.put("arm",cust.arm)
        values.put("shoulder",cust.shoulder)
        values.put("collar",cust.collar)
        values.put("width",cust.width)
        values.put("salwarLength",cust.salwarLength)
        values.put("pancha",cust.pancha)
        values.put("noOfSuits",cust.noOfSuits)
        values.put("designDescription",cust.designDescription)
        values.put("advancePayment",cust.advancePayment)
        values.put("totalPayment",cust.totalPayment)
        values.put("orderTime",cust.orderTime)
        values.put("orderDate",cust.orderDate)


       var success = db.insert(TABLE_NAME,null,values)

        // we are inserting our values
        // in the form of key-value pair
//
//        db.execSQL("insert into CUSTOMER_INFO_TABLE values(10"+","+name+","+cnicNo+","+contact+","+address+","+kamizLength+","+arm+","+shoulder+","+collar+","+width+","+salwarLength+","+pancha+","+noOfSuits+","+designDescription+","+advancePayment+","+totalPayment+","+orderTime+","+orderDate+")")
//        db.execSQL("insert into CUSTOMER_INFO_TABLE values(${serialNo.toString()}, 2,${cnicNo.toString()},${customerContact.toString()},11,${kamizLength.toString()},${arm.toString()},${shoulder.toString()},11,12,${salwarLength.toString()},${pancha.toString()},${noOfSuits.toString()},${designDescription.toString()},15,16,${noOfSuits.toString()},18)")
        //db.run { execSQL("insert into CUSTOMER_INFO_TABLE values(${serialNo.toString()}, ${name.toString()},${cnicNo.toString()},${contact.toString()},${address.toString()},${kamizLength.toString()},${arm.toString()},${shoulder.toString()},${collar.toString()},${width.toString()},${salwarLength.toString()},${pancha.toString()},${noOfSuits.toString()},${designDescription.toString()},${advancePayment.toString()},${totalPayment.toString()},${orderTime.toString()},${orderDate.toString()})") }
       // db.run { execSQL("""insert into CUSTOMER_INFO_TABLE VALUES($serialNo,$name,$cnicNo,$contact,$address,$kamizLength,$arm,$shoulder,$collar,$width,$salwarLength,$pancha,$noOfSuits,$designDescription,$advancePayment,$totalPayment,$orderTime,$orderDate)""") }

//        Log.v("", "$name Serial Number")
        // at last we are
        // closing our database
        db.close()
        return success


    }

//    fun addCustomerMeasurements(
//        noOfSuits: String,
//        designDescription: String,
//        advancePayment: String,
//        totalPayment: String,
//        orderTime: String,
//        orderDate: String
//    ) {
//        // we are inserting our values
//        // in the form of key-value pair
//        values.put(NO_OF_SUITS_COL, noOfSuits)
//        values.put(DESIGN_DESCRIPTION_COL, designDescription)
//        values.put(ADVANCE_PAYMENT_COL, advancePayment)
//        values.put(TOTAL_PAYMENT_COL, totalPayment)
//        values.put(ORDER_TIME_COL, orderTime)
//        values.put(ORDER_DATE_COL, orderDate)
//
//        // here we are creating a
//        // writable variable of
//        // our database as we want to
//        // insert value in our database
//
//
//        // all values are inserted into database
//        db.insert(TABLE_NAME, null, values)
//
//        // at last we are
//        // closing our database
//        db.close()
//    }

    // below method is to get
    // all data from our database

    @SuppressLint("Range")
    fun getCustomer(): ArrayList<CustomerModel> {
        val customerList : ArrayList<CustomerModel> = ArrayList()
        val selectQurry = "SELECT * FROM $TABLE_NAME"
        val db = this.readableDatabase

        val cursor: Cursor?

        try {
            cursor = db.rawQuery(selectQurry,null)
        } catch (e : Exception) {
            e.printStackTrace()
            db.execSQL(selectQurry)
            return ArrayList()

        }


        var serialNo: String
        var name: String
        var cnicNo: String
        var contact: String
        var address: String
        var kamizLength: String
        var arm: String
        var shoulder: String
        var collar: String
        var width: String
        var salwarLength: String
        var pancha: String
        var noOfSuits: String
        var designDescription: String
        var advancePayment: String
        var totalPayment: String
        var orderTime: String
        var orderDate: String

       if(cursor.moveToFirst())
       {
           do {
               serialNo = cursor.getString(cursor.getColumnIndex("serialNo"))
               name = cursor.getString(cursor.getColumnIndex("name"))
               cnicNo = cursor.getString(cursor.getColumnIndex("cnicNo"))
               contact = cursor.getString(cursor.getColumnIndex("contact"))
               address = cursor.getString(cursor.getColumnIndex("address"))
               kamizLength = cursor.getString(cursor.getColumnIndex("kamizLength"))
               arm = cursor.getString(cursor.getColumnIndex("arm"))
               shoulder = cursor.getString(cursor.getColumnIndex("shoulder"))
               collar = cursor.getString(cursor.getColumnIndex("collar"))
               width = cursor.getString(cursor.getColumnIndex("width"))
               salwarLength = cursor.getString(cursor.getColumnIndex("salwarLength"))
               pancha = cursor.getString(cursor.getColumnIndex("pancha"))
               noOfSuits = cursor.getString(cursor.getColumnIndex("noOfSuits"))
               designDescription = cursor.getString(cursor.getColumnIndex("designDescription"))
               advancePayment = cursor.getString(cursor.getColumnIndex("advancePayment"))
               totalPayment = cursor.getString(cursor.getColumnIndex("totalPayment"))
               orderTime = cursor.getString(cursor.getColumnIndex("orderTime"))
               orderDate = cursor.getString(cursor.getColumnIndex("orderDate"))


                val cust = CustomerModel(serialNo = serialNo, name = name, cnicNo =cnicNo, contact =contact, address =address, kamizLength = kamizLength, arm =arm, shoulder = shoulder, collar = collar, width = width, salwarLength =salwarLength, pancha = pancha, noOfSuits = noOfSuits, designDescription = designDescription, advancePayment = advancePayment, totalPayment = totalPayment, orderTime = orderTime, orderDate = orderDate)

                customerList.add(cust)

           }while(cursor.moveToNext())

       }
        return  customerList


    }



    @SuppressLint("Range")
    fun searchCustomer(): ArrayList<CustomerModel> {
        val customerList : ArrayList<CustomerModel> = ArrayList()
        var name1: String = TailorsDataHolder.txtSearch.toString()
        val selectQurry = " SELECT  * FROM " + TABLE_NAME + " WHERE " + SERIAL_NO_COl + " = " +name1
        val db = this.readableDatabase

        val cursor: Cursor?

        try {
            cursor = db.rawQuery(selectQurry,null)
        } catch (e : Exception) {
            e.printStackTrace()
            db.execSQL(selectQurry)
            return ArrayList()

        }


        var serialNo: String
        var name: String
        var cnicNo: String
        var contact: String
        var address: String
        var kamizLength: String
        var arm: String
        var shoulder: String
        var collar: String
        var width: String
        var salwarLength: String
        var pancha: String
        var noOfSuits: String
        var designDescription: String
        var advancePayment: String
        var totalPayment: String
        var orderTime: String
        var orderDate: String

        if(cursor.moveToFirst())
        {
            do {
                serialNo = cursor.getString(cursor.getColumnIndex("serialNo"))
                name = cursor.getString(cursor.getColumnIndex("name"))
                cnicNo = cursor.getString(cursor.getColumnIndex("cnicNo"))
                contact = cursor.getString(cursor.getColumnIndex("contact"))
                address = cursor.getString(cursor.getColumnIndex("address"))
                kamizLength = cursor.getString(cursor.getColumnIndex("kamizLength"))
                arm = cursor.getString(cursor.getColumnIndex("arm"))
                shoulder = cursor.getString(cursor.getColumnIndex("shoulder"))
                collar = cursor.getString(cursor.getColumnIndex("collar"))
                width = cursor.getString(cursor.getColumnIndex("width"))
                salwarLength = cursor.getString(cursor.getColumnIndex("salwarLength"))
                pancha = cursor.getString(cursor.getColumnIndex("pancha"))
                noOfSuits = cursor.getString(cursor.getColumnIndex("noOfSuits"))
                designDescription = cursor.getString(cursor.getColumnIndex("designDescription"))
                advancePayment = cursor.getString(cursor.getColumnIndex("advancePayment"))
                totalPayment = cursor.getString(cursor.getColumnIndex("totalPayment"))
                orderTime = cursor.getString(cursor.getColumnIndex("orderTime"))
                orderDate = cursor.getString(cursor.getColumnIndex("orderDate"))


                val cust = CustomerModel(serialNo = serialNo, name = name, cnicNo =cnicNo, contact =contact, address =address, kamizLength = kamizLength, arm =arm, shoulder = shoulder, collar = collar, width = width, salwarLength =salwarLength, pancha = pancha, noOfSuits = noOfSuits, designDescription = designDescription, advancePayment = advancePayment, totalPayment = totalPayment, orderTime = orderTime, orderDate = orderDate)

                customerList.add(cust)

            }while(cursor.moveToNext())

        }
        return  customerList


    }






}

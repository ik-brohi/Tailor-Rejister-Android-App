package com.example.mytailorrigesterapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class myAdaptor: RecyclerView.Adapter<myAdaptor.MyViewHolder>() {

     var customerList : ArrayList<CustomerModel> = ArrayList()
    fun addItems(items:ArrayList<CustomerModel>){
        this.customerList = items
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.signlerow,parent,false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

         val cust = customerList[position]
        holder.bindView(cust)

    }

    override fun getItemCount(): Int {
        return customerList.size
        }

    class MyViewHolder(var view : View) : RecyclerView.ViewHolder(view)
    {
        var dSerialNo = view.findViewById<TextView>(R.id.txtCSerialNo)
        var dName = view.findViewById<TextView>(R.id.txtCName)
        var dCnicNo = view.findViewById<TextView>(R.id.txtCCNIC)
        var dContact = view.findViewById<TextView>(R.id.txtCContat)
        var dAddress = view.findViewById<TextView>(R.id.txtCAddress)
        var dKamizLength = view.findViewById<TextView>(R.id.txtKLength)
        var dArm = view.findViewById<TextView>(R.id.txtKArm)
        var dShoulder = view.findViewById<TextView>(R.id.txtKShoulder)
        var dCollar = view.findViewById<TextView>(R.id.txtKCollar)
        var dWidth = view.findViewById<TextView>(R.id.txtKWidth)
        var dSalwarLength = view.findViewById<TextView>(R.id.txtSLength)
        var dPancha = view.findViewById<TextView>(R.id.txtSPancha)
        var dNoOfSuits = view.findViewById<TextView>(R.id.txtNoOfSuits)
        var dDesignDescription = view.findViewById<TextView>(R.id.txtDesignDescription)
        var dAdvancePayment = view.findViewById<TextView>(R.id.txtCAdvancePayment)
        var dTotalPayment = view.findViewById<TextView>(R.id.txtCTotalPayment)
        var dTime = view.findViewById<TextView>(R.id.txtCTime)
        var dDate = view.findViewById<TextView>(R.id.txtCDate)

        fun bindView(cust:CustomerModel)
        {
            dSerialNo.text  =                                            " Serial No   :   "+cust.serialNo
            dName.text  =                                                " Name         :   "+cust.name
            dCnicNo.text  =                                              " CNIC No       :   "+cust.cnicNo
            dContact.text  =                                             " Contact        :   "+cust.contact
            dAddress.text  =                                             " Address       :   "+cust.address
            dKamizLength.text  =                                         " Length          :   "+cust.kamizLength
            dArm.text  =                                                 " Arm               :   "+cust.arm
            dShoulder.text =                                            " Shoulder      :   "+cust.shoulder
            dCollar.text  =                                              " Collar            :   "+cust.collar
            dWidth.text  =                                               " Width            :   "+cust.width
            dSalwarLength.text=                                         " Length       :   "+cust.salwarLength
            dPancha.text =                                              " Pancha      :   "+cust.pancha
            dNoOfSuits.text =                                           " No of Suits  :   "+cust.noOfSuits
            dDesignDescription.text =                                   " Design        :   "+cust.designDescription
            dAdvancePayment.text =                                      " Advance Pay :   "+cust.advancePayment
            dTotalPayment.text =                                        " Total Pay     :   "+cust.totalPayment
            dTime.text =                                                " Order Time   :   "+cust.orderTime
            dDate.text =                                                " Order Date    :   "+cust.orderDate


        }





    }
}
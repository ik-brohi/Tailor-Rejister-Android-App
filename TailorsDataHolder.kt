package com.example.mytailorrigesterapp

class TailorsDataHolder {
    override fun toString(): String {
        return "TailorsDataHolder{" +
                "serialNo='" + serialNo + '\'' +
                ", name='" + name + '\'' +
                ", cnicNo='" + cnicNo + '\'' +
                ", contact='" + contact + '\'' +
                ", address='" + address + '\'' +
                ", kamizLength='" + kamizLength + '\'' +
                ", arm='" + arm + '\'' +
                ", shoulder='" + shoulder + '\'' +
                ", collor='" + collar + '\'' +
                ", width='" + width + '\'' +
                ", salwarLength='" + salwarLength + '\'' +
                ", pancha='" + pancha + '\'' +
                ", noOfSuites='" + noOfSuits + '\'' +
                ", designDescription='" + designDescription + '\'' +
                ", advancePayment='" + advancePayment + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", orderTime='" + orderTime + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", txtSearch='" + txtSearch + '\'' +

                '}'
    }

    fun getSerialNo(): Any {
        return serialNo.toString()

    }

    companion object {
        var serialNo: String? = null
        var name: String? = null
        var cnicNo: String? = null
        var contact: String? = null
        var address: String? = null
        var kamizLength: String? = null
        var arm: String? = null
        var shoulder: String? = null
        var collar: String? = null
        var width: String? = null
        var salwarLength: String? = null
        var pancha: String? = null
        var noOfSuits: String? = null
        var designDescription: String? = null
        var advancePayment: String? = null
        var totalPayment: String? = null
        var orderTime: String? = null
        var orderDate: String? = null
        var txtSearch: String? = null

    }
}

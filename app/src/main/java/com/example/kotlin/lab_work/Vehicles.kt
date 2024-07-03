package com.example.kotlin.lab_work

open class Vehicle {
    var manufacturer: String? = null
    var model: String? = null
    var year: String? = null
    var color: String? = null

    open fun setData() {
        println(" Manufacturer : ")
        manufacturer = readln()

        println("Model Number : ")
        model = readln()

        println(" Manufactur Year : ")
        year = readln()

        println("Car Color : ")
        color = readln()
    }
}

open class Car : Vehicle() {


    override fun setData() {
        println("Enter Car Details")
        super.setData()
    }

    fun getData() {
        println("$manufacturer $model $year $color ")
    }
}

open class MototCycle : Vehicle() {

    override fun setData() {
        println("Enter MotorCycle Details")
        super.setData()


    }

    fun getData() {
        println("$manufacturer $model $year $color ")
    }
}

open class Truck : Vehicle() {
    override fun setData() {
        println("Enter Truck Details")
        super.setData()
    }

    fun getData() {
        println("$manufacturer $model $year $color ")
    }
}

fun main() {
    var c1 = Car()
    var m1 = MototCycle()
    var t1 = Truck()

    c1.setData()
    m1.setData()
    t1.setData()

    c1.getData()
    m1.getData()
    t1.getData()

}
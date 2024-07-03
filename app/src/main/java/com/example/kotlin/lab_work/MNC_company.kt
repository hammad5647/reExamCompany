package com.example.kotlin.lab_work

class Company {
    var n: Int = 0
    var revenue: Int = 0
    var totalRevenue: Int = 0

    fun setData() {
        print("Enter the total number of mnc company : ")
        n = readln().toInt()

        for (i in 1..n) {
            print("Enter the revenue of $i : ")
            revenue = readln().toInt()
            totalRevenue += revenue
        }
    }
    fun getData() {
     var average = totalRevenue/n
        println("Average of $n MNC Companyie : $average")
    }
}
fun main(){
    var c1 = Company()
    c1.setData()
    c1.getData()
}
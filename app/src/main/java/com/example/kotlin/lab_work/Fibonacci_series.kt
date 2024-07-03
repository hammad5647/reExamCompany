package com.example.kotlin.lab_work
class Fibonacci {
    var n: Int = 0
    var a: Long = 1
    var b: Long = 0
    fun setData() {
        print("Enter Total Series Number : ")
        n = readln().toInt()
    }
    fun getData() {
        for (i in 0..<n) {
            var sum = a + b
            a = b
            b = sum
            println("$a")
        }
    }
}
fun main() {
    var f1 = Fibonacci()

    f1.setData()
    f1.getData()
}
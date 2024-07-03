package com.example.kotlin

fun main() {
    var array = emptyArray<Int>()
    var sum: Int = 0


    println("Enter the Array size :")

    var n = readln().toInt()

    for (a in 0..<n) {
        var c = readln().toInt()
        array += c
        sum += c
    }

    println("Sum is : $sum")
}
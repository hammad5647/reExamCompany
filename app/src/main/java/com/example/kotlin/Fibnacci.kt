package com.example.kotlin

fun main() {
    var a: Long = 1
    var b: Long = 0
    var n: Long = 50


    for (c in 1..n) {
        print("$a ")
        val sum = a + b
        a = b
        b = sum
    }
    print("$a ")
}
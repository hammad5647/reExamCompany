package com.example.kotlin

fun main() {
    var a: Long = 0
    var b: Long = 1
    var n: Long = 0

    for (i in 1..10) {

        for (k in i..10) {
            print(" ")
        }
        for (j in 1..i) {
            print(" $n")
            a = b
            b = n
            n = a + b
        }
        println("")
    }
}
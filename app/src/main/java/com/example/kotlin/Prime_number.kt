package com.example.kotlin

//fun main() {
//    var a = 1
//    var count = 100
//
//    while (a < count) {
//        if (primeNumber(a)) {
//            println(a.toString() + " is a prime number")
//            ++a
//        }
//    }
//}
//
//fun primeNumber(a: Int): Boolean {
//    var flag = true
//    for (i in 2..a / 2) {
//        if (a % i == 0) {
//            flag = false
//            break
//        }
//    }
//    return flag
//}


fun main() {
    var low = 1
    val input = 100

    println("The value of N is defined as $input")
    println("The prime numbers are: ")

    while (low < input) {
        if (primeNumber(low))
            print(low.toString() + " ")
        ++low
    }
}

fun primeNumber(num: Int): Boolean {
    var flag = true
    for (i in 2..num / 2) {
        if (num % i == 0) {
            flag = false
            break
        }
    }
    return flag
}
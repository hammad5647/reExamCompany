package com.example.kotlin.lab_work

class Calc {
    var a: Int? = null
    var b: Int? = null
    var choice: Int = 0
    fun setData() {
        print("Enter the Value Of A :")
        a = readln().toInt()

        print("Enter the Value of B L")
        b = readln().toInt()


    }

    fun getData() {
        do {
            setData()

            println("Press 0 for Exit")
            println("Press 1 for Addition")
            println("Press 2 for Subtraction")
            println("Press 3 for Multiply")
            println("Press 4 for Division")
            choice = readln().toInt()
            when (choice) {
                1 -> {
                    println("${a!! + b!!}")
                }

                2 -> {
                    println("${a!! - b!!}")
                }

                3 -> {
                    println("${a!! * b!!}")
                }

                4 -> {
                    println("${a!! / b!!}")
                }

                0 -> {
                    println("To Exit")
                }

                else -> {
                    println("Invalid Number")
                }
            }


        } while (choice != 0)
    }

}

fun main() {
    var c1 = Calc()
    c1.getData()
}
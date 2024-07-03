package com.example.kotlin

fun main() {
    var m1 = mutableMapOf<String, Int>()

    println("Your inventory is Empty Please Add Items and their Quantity !")
    println("Total Quantity :")

    var n = readln().toInt()
    var name: String? = null
    var quantity: Int? = null
    var isClosed = 0

    for (a in 0..<n) {

        println("Enter Item no ${a + 1}")
        name = readln().toString()
        println("Enter $name quantity")
        quantity = readln().toInt()
        m1.put(name, quantity)
    }
    println("$name $quantity")

    do {
        println("Press 1 to Add Items")
        println("Press 2 to Update Quantity")
        println("Press 3 to Remove Items")
        println("Press 4 to Display Items")

        var entered = readln().toInt()
        when (entered) {
            1 -> {
                println("Enter the Item Name ")
                var a = readln().toString()
                println("Ente the item quantity")
                var b = readln().toInt()
                m1.put(a, b)
                m1.forEach { t, u ->
                    println("$t $u")
                }
            }

            2 -> {
                println("Enter Item Name to Update Its Quantity")
                var a = readln().toString()
                println("Enter the Quantity")
                var b = readln().toInt()
                m1[a] = b
                m1.forEach { t, u ->
                    println("$t $u")
                }
            }

            3 -> {
                println("Enter Item Name You Want to Remove")
                var a = readln().toString()
                m1.remove(a)
                m1.forEach { t, u ->
                    println("$t $u")
                }
            }

            4 -> {
                m1.forEach { t, u ->
                    println("$t $u")
                }
            }

            else -> {
                println("Invalid Number Pressed")
            }
        }
        println("Press 0 To Continue")
        var c = readln().toInt()
    } while (isClosed == 0)
}




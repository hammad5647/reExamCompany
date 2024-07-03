package com.example.kotlin.lab_work

data class Customer(
    private var productId: Int? = null,
    private var productName: String? = null,
    private var productPrice: Int? = null,
    private var productQuantity: Int? = null
) {
    private var customer = mutableListOf<Customer>()

    private var n = 0
    var n1 = 0
    var count = 0
    fun setData() {

        print("Enter total product : ")
        n = readln().toInt()
        n1 += n

        for (i in 1..n) {
            print("Enter Product Id : ")
            productId = readln().toInt()

            print("Enter Product Name : ")
            productName = readln()

            print("Enter Product Price : ")
            productPrice = readln().toInt()

            print("Enter Product Quantity : ")
            productQuantity = readln().toInt()

            customer.add(Customer(productId, productName, productPrice, productQuantity))
        }
    }

    fun getData() {
        for (j in 0..<n1) {

            println("\nProduct Id : ${customer[j].productId}")
            println("Product Name : ${customer[j].productName}")
            println("Product Price : ${customer[j].productPrice}")
            println("Product Quantity : ${customer[j].productQuantity}")

        }
    }

    fun addProduct() {
        setData()
    }

    fun updatePrice() {
        println("Enter ID")
        var a = readln().toInt()

        for (i in 0..<n1) {
            if (customer[i].productId == a) {
                count = 1
                println("Enter New Price : ")
                customer[i].productPrice = readln().toInt()

                println("Price Updated Successfully !!!")
            }
        }
        if (count == 0) {
            println("Enter Valid ID !!")
        }
    }

    fun updateQuantity() {
        println("Enter ID")
        var a = readln().toInt()

        for (i in 0..<n1) {
            if (customer[i].productQuantity == a) {
                count = 1
                println("Enter New Price : ")
                customer[i].productQuantity = readln().toInt()

                println("Quantity Updated Successfully !!!")
            }
        }
        if (count == 0) {
            println("Enter Valid ID !!")
        }
    }

    fun display() {
        getData()
    }
}

fun main() {
    var c1 = Customer()

    c1.setData()
    c1.getData()

    do {
        println("\nPress 0 to Exit ")
        println("Press 1 to Add new Product ")
        println("Press 2 to for update price ")
        println("Press 3 to for update quantity ")
        println("Press 4 to Display ")
        var b = readln().toInt()

        when(b)
        {
            0->{

            }
            1->{
                c1.addProduct()
            }
            2->{
                c1.updatePrice()
            }
            3->{
                c1.updateQuantity()
            }
            4->{
                c1.display()
            }
            else->{
                println("Invalid Choice !!")
            }
        }
    }while (b!=0)
}
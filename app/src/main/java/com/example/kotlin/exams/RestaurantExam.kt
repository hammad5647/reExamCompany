package com.example.kotlin.exams

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

class TableAlreadyReservedException(message: String) : Exception(message)
class CustomerIdAlreadyExistException(message: String) : Exception(message)

data class Table(
    var tableId: Int? = null,
    var capacity: Int? = null,
    var isAvailable: Boolean? = null,
) {
}

data class Customer(
    var customerId: Int? = null,
    var name: String? = null,
    var reservation: MutableList<Any> = mutableListOf()

)

class Restaurant {
    private var tables: MutableList<Table>
    private var customers: MutableList<Customer>
    private var reservations: MutableMap<Int, MutableList<Int>>

    constructor() {
        tables = mutableListOf()
        customers = mutableListOf()
        reservations = mutableMapOf()
    }

    fun addTable(table: Table) {
        tables.add(table)
        println("Table Added $table")
    }

    fun addCustomer(customer: Customer) {
        if (customers.any { it.customerId == customer.customerId }) {
            throw CustomerIdAlreadyExistException("Customer Already Exist")
        }
        customers.add(customer)
        println("Customer Added $customer")
    }

    suspend fun makeReservation(customerId: Int, tableId: Int) {
        val customer = customers.find { it.customerId == customerId }
            ?: throw IllegalArgumentException("Customer with ID $customerId not found.")
        val table = tables.find { it.tableId == tableId }
            ?: throw IllegalArgumentException("Table with ID $tableId not found.")

        if (table.isAvailable == true) {
            throw IllegalStateException("Table with ID $tableId is already reserved.")
        }

        delay(1000) // Simulate time-consuming operation
        table.isAvailable = false
        customer.reservation.add(tableId)
        reservations.getOrPut(customerId) { mutableListOf() }.add(tableId)
        println("Reservation made for Customer $customerId at Table $tableId")
    }

    suspend fun cancelReservation(customerId: Int, tableId: Int) {
        val customer = customers.find { it.customerId == customerId }
            ?: throw IllegalArgumentException("Customer with ID $customerId not found.")
        val table = tables.find { it.tableId == tableId }
            ?: throw IllegalArgumentException("Table with ID $tableId not found.")

        if (table.isAvailable == true) {
            throw IllegalStateException("Table with ID $tableId is not reserved.")
        }

        delay(1000) // Simulate time-consuming operation
        table.isAvailable = true
        customer.reservation.remove(tableId)
        reservations[customerId]?.remove(tableId)
        println("Reservation canceled for Customer $customerId at Table $tableId")
    }

    fun displayDetails() {
        println("Tables:")
        tables.forEach { println(it) }
        println("\nCustomers:")
        customers.forEach { println(it) }
    }

    fun displayCustomerDetails(customerId: Int) {
        val customer = customers.find { it.customerId == customerId }
            ?: throw IllegalArgumentException("Customer with ID $customerId not found.")
        println(customer)
    }
}

fun main() {
    val restaurant = Restaurant()


    println("Welcome to the Restaurant Reservation System\n")

    runBlocking {
        println("First You have to Add Table ")
        println("Enter the total number of Tables : ")
        var n = readln().toInt()

        for (i in 1..n) {
            println("Enter table ID:")
            val tableId = readLine()?.toInt()
            println("Enter table capacity:")
            val capacity = readLine()?.toInt()
            restaurant.addTable(Table(tableId, capacity))
            println("Table Added $tableId")
        }
        while (true) {

            println("1. Add Table")
            println("2. Add Customer")
            println("3. Make Reservation")
            println("4. Cancel Reservation")
            println("5. List All Tables and Customers")
            println("6. Display Customer Details")
            println("7. Exit")

            when (readLine()?.toInt()) {
                1 -> {
                    println("Enter table ID:")
                    val tableId = readLine()?.toInt()
                    println("Enter table capacity:")
                    val capacity = readLine()?.toInt()
                    restaurant.addTable(Table(tableId, capacity))
                }

                2 -> {
                    println("Enter customer ID:")
                    val customerId = readLine()?.toInt() ?: continue
                    println("Enter customer name:")
                    val name = readLine() ?: continue
                    try {
                        restaurant.addCustomer(Customer(customerId, name))
                    } catch (e: Exception) {
                        println("Error: ${e.message}")
                    }
                }

                3 -> {
                    println("Enter customer ID:")
                    val customerId = readLine()?.toInt() ?: continue
                    println("Enter table ID:")
                    val tableId = readLine()?.toInt() ?: continue

                    try {
                        restaurant.makeReservation(customerId, tableId)
                    } catch (e: Exception) {
                        println("Error: ${e.message}")
                    }
                }

                4 -> {
                    println("Enter customer ID:")
                    val customerId = readLine()?.toInt() ?: continue
                    println("Enter table ID:")
                    val tableId = readLine()?.toInt() ?: continue
                    try {
                        restaurant.cancelReservation(customerId, tableId)
                    } catch (e: Exception) {
                        println("Error: ${e.message}")
                    }
                }

                5 -> {
                    restaurant.displayDetails()
                }

                6 -> {
                    println("Enter customer ID:")
                    val customerId = readLine()?.toInt() ?: continue
                    try {
                        restaurant.displayCustomerDetails(customerId)
                    } catch (e: Exception) {
                        println("Error: ${e.message}")
                    }
                }

                7 -> {
                    println("Exiting...")
                }

                else -> {
                    println("Invalid choice. Please try again.")
                }
            }
        }
    }
}
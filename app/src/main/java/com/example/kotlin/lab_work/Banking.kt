package com.example.kotlin.lab_work

class insufficientBalanceException(message: String) : Exception(message)
class BankAcc {
    var accNumber: Long? = null
    var accHolder: String? = null
    var balance: Int? = null

    fun setData() {
        println("Enter Account Number : ")
        accNumber = readln().toLong()

        println("Enter Acc. Holder Name : ")
        accHolder = readln()

        println("Enter current balance : ")
        balance = readln().toInt()
    }

    fun withdraw() {
        try {
            println("enter the Withdraw Amount : ")
            var wid = readln().toInt()

            balance = balance!! - wid

            if (wid > balance!!) {
                throw insufficientBalanceException("Not enough balance !!!")
            }
        } catch (e: insufficientBalanceException) {
            println("Not Enough Balance !!")
        } catch (e: Exception) {
            println("Enter valid Amount")
        }

    }

    fun deposit() {
        println("Enter the Deposit Amount : ")
        var dep = readln().toInt()

        balance = balance!! + dep
    }

    fun display() {
        println("$accNumber $accHolder")
        println("Remaining Balance : $balance")
    }
}

fun main() {
    var b1 = BankAcc()
    b1.setData()


    do {
        println("Press 1 to withdraw ")
        println("Press 2 to Deposit ")
        println("Press 3 to Display ")
        println("Press 4 to Exit ")

        var n = readln().toInt()

        when (n) {
            1 -> {
                b1.withdraw()
            }

            2 -> {
                b1.deposit()
            }

            3 -> {
                b1.display()
            }

            else -> {
                println("Invalid choice !!")

            }

        }
    } while (n != 4)
}
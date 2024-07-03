package com.example.kotlin.lab_work

class BankAccount {
    private var accountNumber: String? = null
    private var holderName: String? = null
    private var balance: Int? = null
    private var interestRate: Double? = null

    constructor() {
        accountNumber = ""
        holderName = ""
        balance = 0
        interestRate = 0.0
    }

    fun setData() {
        print("Enter Account Number : ")
        accountNumber = readln()

        print("Enter Account Holder Name : ")
        holderName = readln()

        print("Enter Current Bank Balance : ")
        balance = readln().toInt()

        print("Enter Interest Rate : ")
        interestRate = readln().toDouble()
    }

    fun getData() {

        println("")
        println("Account Number : $accountNumber ")
        println("Account Holder Name : $holderName ")
        println("Account Balance : $balance ")
        println("Interest Rate : $interestRate ")
    }

    fun deposit() {

        var deposit = 0
        println("Enter Deposit Amount : ")
        deposit = readln().toInt()

      balance = balance!! + deposit
    }

    fun withdraw() {
        var withDraw = 0

        println("Enter Withdraw Amount : ")
        withDraw = readln().toInt()

        if (balance!! <= withDraw) {
            println("Insufficient Balance !!!")
        } else {
            balance = balance!! - withDraw
        }
    }

    fun display() {
        println("")
        println("Account Number : $accountNumber ")
        println("Account Holder Name : $holderName ")
        println("Account Balance : ${balance} ")
        println("Interest Rate : $interestRate ")
    }
}

fun main() {
    var b1 = BankAccount()

    b1.setData()
    b1.getData()

    println("")


    do {
        println("Press 1 To Deposit !")
        println("Press 2 To Withdraw !")
        println("Press 3 To Display !")

        var n = readln().toInt()
        when (n) {
            1 -> {
                b1.deposit()
            }

            2 -> {
                b1.withdraw()
            }

            3 -> {
                b1.display()
            }

            else -> {
                println("Invalid Number !!!")
            }
        }
    } while (n != 3)

}
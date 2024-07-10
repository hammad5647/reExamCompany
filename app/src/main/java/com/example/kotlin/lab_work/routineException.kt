package com.example.kotlin.lab_work

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class UnderAgeExcpetion(message: String) : Exception(message)
class PassedException(message: String) : Exception(message)

class Class {
    var id: Int = 0
    var name: String = ""
    var age: Int = 0

    var rollNo: Int = 0
    var subject: String = ""
    var marks: Int = 0

    suspend fun setData() {
        println("Enter the ID : ")
        id = readln().toInt()
        println("Enter the Name : ")
        name = readln()
        delay(1000)

        try {
            println("Enter the Age : ")
            age = readln().toInt()
            if (age < 18) {
                throw UnderAgeExcpetion("Under Age")
            } else
                println("Welcome to Class")

        } catch (e: UnderAgeExcpetion) {
            println("Under Age !!!")
        } catch (e: Exception) {
            println("Enter the Valid Age")
        }
    }

    suspend fun getData() {
        println("Enter Roll No :")
        rollNo = readln().toInt()

        delay(1000)
        println("Enter Subject :")
        subject = readln()
        try {


            delay(1000)
            println("Enter Marks :")
            marks = readln().toInt()
            if (marks > 35) {
                throw PassedException("Passed")
            } else
                println("Failed")
        } catch (e: PassedException) {
            println("Passed")
        } catch (e: Exception) {
            println("Enter the Valid Marks")
        }
        println("$id  $name  $age  $rollNo  $subject  $marks")
    }
}
fun main() {
    var c1 = Class()

    runBlocking {
        launch {
            c1.setData()
        }
        launch {
            c1.getData()
        }
    }
}
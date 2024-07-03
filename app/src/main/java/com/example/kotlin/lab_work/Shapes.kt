package com.example.kotlin.lab_work

open class Shape {
    var name: String = ""
    var color: String = ""
    var area: Double = 0.0

}

class Circle : Shape() {
    var radius = 0
    fun areaCircle() {

        println("Enter the value of radius : ")
        radius = readln().toInt()

        area = 3.14 * radius * radius

        println("Area of Circle is : $area ")
    }

    fun draw() {

    }
}

class Rectangle : Shape() {
    var length: Double = 0.0
    var width: Double = 0.0
    fun areaOfRectangle() {

        println("Enter Length And Width Of Rectangle : ")
        length = readln().toDouble()
        width = readln().toDouble()

        area = length * width

        println("Area of Rectangle is : $area")
    }
}

class Triangle : Shape() {
    var base: Double = 0.0
    var height: Double = 0.0
    fun areaOfTriangle() {

        println("Enter Base And Height of Triangle : ")
        base = readln().toDouble()
        height = readln().toDouble()

        area = 0.5 * base * height

        println("Area of Triangle is : $area")

    }
}

fun main() {

    var c1 = Circle()
    var r1 = Rectangle()
    var t1 = Triangle()

    c1.areaCircle()
    r1.areaOfRectangle()
    t1.areaOfTriangle()

}
package com.example.kotlin

fun main() {
    var studentSet = mutableSetOf<Map<String, String>>()
    var courseSet = mutableSetOf<Map<String, Any>>()

    println("Enter the Total Course")
    var n = readln().toInt()

    for (x in 0..<n) {
        var name = readln()
        var map = mutableMapOf<String, Any>("name" to name, "student" to mutableListOf<String>())
        courseSet.add(map)
    }
    println("Enter Total Student")
    var sn = readln().toInt()
    for (x in 0..<sn) {
        var name = readln()
        var map = mutableMapOf<String, String>("name" to name, "course" to "")
        studentSet.add(map)
    }
    for (x in 0..<sn) {
        for (i in 0..<n) {
            println("Press $i for ${courseSet.toList()[i].get("name")}")
        }
        println("Choose Course to Enroll")
        var ch = readln().toInt()

        var studentList = studentSet.toMutableList()

        var usMap = mutableMapOf<String, String>(
            "name" to studentList[x]["name"]!!,
            "course" to courseSet.toList()[ch]["name"]!!.toString()
        )

        studentList[x] = usMap
        studentSet = studentList.toMutableSet()

        var courseList = courseSet.toMutableList()
        var student = courseList[ch].toMutableMap()["student"] as MutableList<String>

        student.add(studentList.get(x)["name"]!!)
        var ucMap =
            mutableMapOf<String, Any>("name" to courseList[ch]["name"]!!, "student" to student)

        courseList[ch] = ucMap
        courseSet = courseList.toMutableSet()
    }
    println("==============================================================")
    println("======================= Course Data ==========================")
    println("==============================================================")

    for (j in 0..<n) {
        println("${courseSet.toList()[j]["name"]}")
        println("${(courseSet.toList()[j]["student"] as List<String>).joinToString()}")
    }
    println("==============================================================")
    println("======================= Student Data ==========================")
    println("==============================================================")

    for (j in 0..<sn) {
        println("${studentSet.toList()[j]["name"]}")
        println("${studentSet.toList()[j]["course"]}")
    }
}
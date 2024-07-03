package com.example.kotlin

fun main()
{
    var i = 1
    var j = 1

    for (i in 1..100)
    {
        for (j in 1..10)
        {
            println("$i x $j = ${i*j}")
        }
    }
}
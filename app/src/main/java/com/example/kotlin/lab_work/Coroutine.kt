package com.example.kotlin.lab_work

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class Math {
    suspend fun even() {
        for (h in 1..<20) {
            if (h%2==0){
                delay(1000)
                println(h)
            }
        }
    }

    suspend fun odd() {
        for (i in 0..20) {
            if (i%2!==0){
                println(i)
                delay(1000)
            }
        }
    }
}

fun main() {
    var m1 = Math()
    runBlocking {
        launch {
            m1.even()
        }
        launch {
            m1.odd()
        }
    }
}

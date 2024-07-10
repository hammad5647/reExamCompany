package com.example.kotlin.lab_work

class InvalidTemperatureException(message: String) : Exception(message)

class Temperature {
    var celsius: Double = 0.0
    var fahrenheit: Double = 0.0

    fun setData() {
        try {
            println("Enter Celsius : ")
            celsius = readln().toDouble()

            if (celsius <= -273.15){
                throw InvalidTemperatureException("Please Enter Valid Temperature")
            }
            else{
                fahrenheit = (celsius*9/5)+32
                println("$fahrenheit")
            }

        } catch (e:InvalidTemperatureException) {
            println("Temperature Cannot be lower than (-273.15)")
        }catch (e:Exception){
            println("Enter the Valid Temperature !!")
        }
    }
}
fun main(){
    var t1 = Temperature()

    t1.setData()
}


//fun main() {
//    try {
//        println("Enter Temperature : ")
//        var celsius = readln().toInt()
//
//        var fahrenheit = (celsius * 9 / 5) + 32
//
//        println("Fahrenheit : $fahrenheit")
//
//    } catch (e: InvalidTemperatureException) {
//        println("Enter Valid Temperature")
//    }
//}

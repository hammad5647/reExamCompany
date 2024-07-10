import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

class ATM {
    var balance = 0
    fun getData() {
        println("Enter Bank Balance : ")
        balance = readln().toInt()
    }

    suspend fun withDraw() {
        println("enter withdraw amount : ")
        var wid = readln().toInt()

        balance = balance - wid

        println("Remaining Balance : $balance")

    }
    suspend fun showBalance() {
        println(balance)
    }
}
fun main(){
    var a1 = ATM()
    a1.getData()

    println("press 1 to withdraw")
    println("press 2 to show balance")
    println("press 3 to exit")
    var n = readln().toInt()

    runBlocking {
        async(Dispatchers.IO) {
            if (n == 1) {
                a1.withDraw()
            }
        }
        async(Dispatchers.IO) {
            if (n == 2) {
                a1.showBalance()
            }
        }
    }
}
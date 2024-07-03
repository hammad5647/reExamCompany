fun main() {
    println("==========WELCOME TO OUR STORE==========")

    print("Enter Your Name : ")
    var name = readln()

    println("Enter Your Phone Number : ")
    var number = readln().toLong()

    println("Enter Total Number of Product : ")
    var n = readln().toInt()

    var productName = emptyArray<String>()
    var productPrice = emptyArray<Int>()
    var productQuantity = emptyArray<Int>()

    for (i in 1..n) {
        print("Enter Product Name : ")
        var prName = readln()

        print("Enter $prName Price : ")
        var prPrice = readln().toInt()

        print("Enter $prName Quantity : ")
        var prQuantity = readln().toInt()

        productName += prName
        productPrice += prPrice
        productQuantity += prQuantity
    }

    println("===================================")
    println("Product       Price        Quantity")
    println("===================================")

    var sum = 0
    var netPay = 0
    var discount = 0

    for (j in 0..<n) {

        println("${productName[j]}             ${productPrice[j]}             ${productQuantity[j]}")

    }
    for (k in 0..<n) {
        sum += productPrice[k]*productQuantity[k]
    }
    println("-----------------------------------")
    println("                    Total : $sum   ")


    if (sum <= 5000) {
        discount = sum*30/100
        println("         Discount : $discount(30%)")
    }
    else if (sum<=2000 && sum>4999) {
        discount = sum*20/100
        println("         Discount : $discount(20%)")
    }else if (sum<=1000 && sum>=1999){
        discount = sum*10/100
        println("         Discount : $discount(10%)")
    }else if (sum<=500 && sum>=999){
        discount = sum*2/100
        println("         Discount : $discount(2%)")
    }
    println("-----------------------------------")
    println("             To Pay : ${sum-discount}/-")


}

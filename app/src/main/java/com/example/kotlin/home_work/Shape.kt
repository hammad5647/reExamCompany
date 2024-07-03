import com.example.kotlin.lab_work.Circle

interface Drawable {
    fun draw()
    fun getDraw()
}

abstract class Shape {
    var color = ""
    var name = ""

    abstract fun area()
    abstract fun getData()
}

class Circle1 : Shape(), Drawable {
    var r = 0
    override fun area() {

        print("Enter radius of a Circle : ")
        r = readln().toInt()
    }

    override fun draw() {
        print("Enter the Name : ")
        name = readln()

        print("Enter the Color : ")
        color = readln()
    }

    override fun getData() {
        print("Area of Circle is : ${3.14 * r * r}")
    }

    override fun getDraw() {
        println("Name is $name")
        println("color is $color")
    }
}

class Rectangle : Shape(), Drawable {
    var length = 0
    var width = 0
    override fun area() {
        println("Enter the value of length and width : ")
        length = readln().toInt()
        width = readln().toInt()
    }

    override fun draw() {
        print("Enter the Name : ")
        name = readln()

        println("Enter the color : ")
        color = readln()
    }

    override fun getData() {
        print("Area of Rectangle is : ${length * width}")
    }

    override fun getDraw() {
        println("Name is :$name")
        println("Color is :$color")
    }
}

fun main() {
    var r1: Shape = Rectangle()
    var r2: Drawable = Rectangle()

    r1.area()
    r2.draw()
    r1.getData()
    r2.getDraw()

    var c1: Shape = Circle1()
    var c2: Drawable = Circle1()

    c1.area()
    c2.draw()
    c1.getData()
    c2.getDraw()
}
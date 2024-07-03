abstract class Person {
    var id:Int = 0
    var name: String = ""
    abstract fun getDetails():String

}
data class Employee(var ids:Int = 0 , var names:String = "",var age:Int = 0,var departments: String? = null):Person (){
    override fun getDetails():String {
        return "$ids $name $age $departments"
    }
}
class Company{
    private var employee = mutableListOf<Employee>()
    private var department = mutableListOf<String>()
    private var departEmployee = mutableMapOf<String,MutableList<Employee>>()

    constructor(){
        employee = mutableListOf<Employee>()
        department = mutableListOf<String>()
        departEmployee = mutableMapOf<String,MutableList<Employee>>()
    }
    fun addEmployee(employees: Employee){
        employee.add(employees)
    }
    fun addDepartment(departments: String?){
        if (departments != null) {
            department.add(departments)
        }
    }
    fun assignDepart(){
        for (i in 0 ..<department.size){
            departEmployee.put(department[i], mutableListOf<Employee>())
        }
        for (j in 0 ..<employee.size){
            println("Choose Department for ${employee[j].names}")

            for(k in 0..<department.size){
                println("Enter $k for ${department[k]}")
            }
            var ch = readln().toInt()
            var list = departEmployee.get(department[ch])
            employee[j].departments = department.toString()[ch].toString()
            list!!.add(employee[j])
            departEmployee.put(department[ch],list)
        }

    }
    fun display(){
        departEmployee.forEach { (key,value) ->
            println("$key ${value.joinToString()}")
        }
    }
}
fun main(){
    var c1 = Company()
    println("Enter the total number of Employee : ")
    var n = readln().toInt()

    for(i in 0 ..<n){
        println("Enter the Employee ID : ")
        var id = readln().toInt()

        println("Enter the Employee Name : ")
        var name = readln()

        println("Enter the Age of $name : ")
        var age = readln().toInt()

        var employee = Employee(id,name,age)
        c1.addEmployee(employee)
    }

    println("Enter the total number of Departments : ")
    var m = readln().toInt()

    for (j in 0..<m) {
        println("Enter the Department Name : ")
        var department = readln()
        c1.addDepartment(department)
    }
    c1.assignDepart()
    c1.display()
}
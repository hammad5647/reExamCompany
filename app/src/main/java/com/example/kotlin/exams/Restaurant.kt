//package com.example.kotlin.exams
//
//data class Table(
//    var tablesId: Int? = null,
//    var capacity: Int? = null,
//    var isAvailabe: Boolean? = null
//) {
//
//}
//
//data class Customers(
//    var customerID: Int? = null,
//    var name: String? = null,
//    var reservation: MutableList<Any> = mutableListOf()
//) {
//
//}
//
//class Restaurants {
//    private var table = mutableListOf<Table>()
//    private var customers = mutableListOf<Customers>()
//    private var reservations = mutableMapOf<Int, MutableList<Int>>()
//
//    constructor() {
//        table = mutableListOf<Table>()
//        customers = mutableListOf<Customers>()
//        reservations = mutableMapOf<Int, MutableList<Int>>()
//    }
//
//    fun addTable(tables: Table) {
//        table.add(tables)
//
//    }
//}
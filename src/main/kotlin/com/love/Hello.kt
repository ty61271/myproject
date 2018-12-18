package com.love

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()

//    val 不能改變資料
    val h = Human()
    h.hello()
//    var 可變資料
    var age = 19
    age = 20
    var weight = 66.5f
//    先定義後給值
    var name: String
    name = "West"
}

class Human {
    fun hello() {
        println("Hello kotlin")
    }
}
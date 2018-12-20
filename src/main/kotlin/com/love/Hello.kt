package com.love

fun main(args: Array<String>) {
//    println("Hello Kotlin")
//    Human().hello()

//    val 不能改變資料
    val h = Human(weight = 66.5f, height = 1.7f)
    println(h.bmi())

    val c='A'
    println(c.toInt()>60)
/*//    var 可變資料
    var age = 19
    age = 20
    var weight = 66.5f
//    先定義後給值
    var name: String
    name = "West"*/
}

class Human( var name: String = "",var weight: Float, var height: Float) {
    init {
        println("test $weight")
    }
//    constructor(name:String,weight: Float,height: Float) : this(weight,height)

    fun bmi(): Float {
        val bmi = weight / (height * height)
        return bmi
    }

    fun hello() {
        println("Hello kotlin")
    }
}
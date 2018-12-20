package com.love

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    val stu = Student("West", 77, 99)
    stu.print()
    println("High Score : ${stu.highest()}")
}

class Student(var name: String, var english: Int, var math: Int) {
    fun print() {
        println(
            name + "\t" + english + "\t" + math + "\t"
                    + getAverge() + "\t"
                    + if (getAverge() >= 60) "Pass" else "failed"
        )

    }

    fun getAverge(): Int {
        return (english + math) / 2
    }

    fun highest(): Int {
        var max = if (english > math) {
            println("english")
            english
        } else {
            println("math")
            math
        }
//        var max=0
//        if(english>math){
//            println("english")
//            println(english)
//        }else{
//            println("math")
//            println(math)
//        }
        return max
    }

    private fun userInput() {
        val scanner = Scanner(System.`in`)
        print("Please enter yours name ")
        val name = scanner.next()
        print("Please enter yours english ")
        val english = scanner.nextInt()
        print("Please enter yours math ")
        val math = scanner.nextInt()
        val stu = Student(name, english, math)
        stu.print()
        println(stu.highest())

    }


}
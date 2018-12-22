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
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFaild()}\t${grading()}")
    }

    fun passOrFaild()=if(getAverage()>=60) "Pass" else "Failed"

    fun grading() = when (getAverage()) {
        in 90..100 -> 'A'
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }

    fun getAverage() = (english + math) / 2

    fun highest() = if (english > math) {
        println("english")
        english
    } else {
        println("math")
        math
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
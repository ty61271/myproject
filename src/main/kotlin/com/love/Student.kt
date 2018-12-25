package com.love

import java.util.*

fun main(args: Array<String>) {
//    userInput()
    Student.pass=50
    val stu = Student("West", 60, 99)
    val stu1 = Student("Hank", 44, 68)
    val stu2 = Student("Eric", 30, 49)
    val gstu=GraduateStudent("Jack",55,65,60)
    gstu.print()
    stu.print()
    stu1.print()
    stu2.print()
    println("High Score : ${stu.highest()}")
}
class GraduateStudent(name: String,english: Int,math: Int,var thesis:Int) :Student(name,english,math){
    companion object {
        @JvmStatic
        val pass=70
    }

    override fun print() =
        println("$name\t$english\t$math\t$thesis\t${getAverage()}\t${passOrFaild()}\t${grading()}")

    override fun passOrFaild()=if(getAverage()>= pass) "Pass" else "Failed"
}
open class Student(var name: String?, var english: Int, var math: Int) {
    companion object {
        @JvmStatic
        var pass=60
        fun test(){
            println("testing")
        }
    }
   open fun print() {
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFaild()}\t${grading()}")
    }

    open fun passOrFaild()=if(getAverage()>=pass) "Pass" else "Failed"

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
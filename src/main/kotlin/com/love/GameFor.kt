package com.love

import java.util.*

fun main(args: Array<String>) {
    val secret=Random().nextInt(10)+1
    println(secret)
    val scanner=Scanner(System.`in`)
    for (i in 1..4) {
        print("please enter a number (${i}/4) :\t")
        val number = scanner.nextInt()
        println("第${i}次:\t$number")
        if(number>secret){
            println("lower")
        }else if(number<secret){
            println("higher")
        }else{
            println("Great,the number is\t$number")
            break
        }
    }
    println("結束")
}
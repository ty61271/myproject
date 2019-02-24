package com.love

import java.io.File

fun main() {
    File("data.txt").bufferedReader().lines().forEach {
        println(it)
    }
//    write()
}

private fun write() {
//    File("outputkotlin.txt").writeText("abc123")
//    File("outputkotlin.txt").printWriter().use {
//        it.println("1st line")
//        it.println("2nd line")
//        it.println("3nd line")
//    }
    File("outputkotlin.txt").bufferedWriter().use {
        it.write("1st line\n")
        it.write("2nd line\n")
        it.write("3nd line\n")
    }
}
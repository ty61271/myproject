package com.love.kotlin

import com.love.Student
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class StudentTest{
    @Test
    fun kotlinHighestTest(){
        val student=Student("West",60,80)
        Assertions.assertEquals(80,student.highest())
    }
    @Test
    fun kotlinGetAverageTest(){
        val student=Student("West",60,80)
        Assertions.assertEquals((60+80)/2,student.getAverage())
    }
    @Test
    fun kotlinGradingTest(){
        val student=Student("West",60,80)
        Assertions.assertEquals('C',student.grading())
    }
}


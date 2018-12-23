package com.love.kotlin

import com.love.Human
import com.love.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PersonTest{
    @Test
    fun kotlinHumenBmiTest(){
        val human=Human("West",66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),human.bmi())
    }
    @Test
    fun javaPersonBmiTest(){
        val person=Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f),person.bmi())
    }
}

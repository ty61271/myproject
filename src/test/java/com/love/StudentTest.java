package com.love;

import com.love.student.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {
    @Test
    public void javaHighestTest(){
        Student student=new Student("West",60,80);
        Assertions.assertEquals(80,student.highest());
    }
    @Test
    public void javaGetAverage(){
        Student student=new Student("West",60,80);
        Assertions.assertEquals((60+80)/2,student.getAverage());
    }
}

package com.love.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student.pass=50;
        Student stu=new Student("West",97,10);
        Student stu1=new Student("Hank",60,40);
        Student stu2=new Student("Eric",30,50);
        GraduateStudent gstu=new GraduateStudent("Jack",55,65,60);
        gstu.print();
        stu.print();
        stu1.print();
        stu2.print();
        System.out.println("High Score: "+stu.highest());
    }

    private static void userInput() {
        Scanner scanner=new Scanner(System.in);
        System.out.print("pleas enter yours name ");
        String name=scanner.next();
        System.out.print("pleas enter yours english ");
        int english=scanner.nextInt();
        System.out.print("pleas enter yours math ");
        int math=scanner.nextInt();
        Student stu=new Student(name,english,math);
        stu.print();
        System.out.println("High Score: "+stu.highest());
    }
}

package com.love.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
//        userInput();
        Student stu=new Student("West",77,99);
        stu.print();
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

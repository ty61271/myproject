package com.love.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {
        int max = (english > math) ? english : math;
        return max;
    }

    public void print() {
        System.out.print(name + "\t" + english + "\t" + math + "\t"
                + getAverage());
        if(getAverage()>=60){
            System.out.println("\tPass");
        }else {
            System.out.println("\tFailed");
        }
    }
    public int getAverage(){
        return (english + math) / 2;
    }
}

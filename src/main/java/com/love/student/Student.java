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
        int average=getAverage();
        System.out.print(name + "\t" + english + "\t" + math + "\t"
                + getAverage() + "\t" + ((getAverage()>=60) ? "Pass":"FAILED"));
        char grading='F';
        switch (average/10){
            case 10:
            case 9:
                grading='A';
                break;
            case 8:
                grading='B';
                break;
            case 7:
                grading='C';
                break;
            case 6:
                grading='D';
                break;
                default:
                    grading='F';
        }
        System.out.println("\t"+grading);
//        if(getAverage()>=60){
//            System.out.println("\tPass");
//        }else {
//            System.out.println("\tFailed");
//        }
    }
    public int getAverage(){
        return (english + math) / 2;
    }
}

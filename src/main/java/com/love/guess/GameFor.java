package com.love.guess;

import java.util.Random;
import java.util.Scanner;

public class GameFor {
    public static void main(String[] args) {
        int secret = new Random().nextInt(10) + 1;
        System.out.println(secret);
        Scanner scanner = new Scanner(System.in);
        for(int i=1;i<=4;i++) {
            System.out.print("please enter a number ("+i+"/4) :\t");
            int number = scanner.nextInt();
            System.out.println("第"+i+"次:\t" + number);
            if(number>secret){
                System.out.println("lower");
            }else if(number<secret){
                System.out.println("higher");
            }else {
                System.out.println("Great,the number is "+number);
                break;
            }
        }
        System.out.println("結束");
    }

}

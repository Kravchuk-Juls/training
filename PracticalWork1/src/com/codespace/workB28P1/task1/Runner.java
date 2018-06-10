package com.codespace.workB28P1.task1;

import com.codespace.workB27P1.task123.Shape;

import java.util.Scanner;

public class Runner {
    public void run(){
        DaysOfWeek[] days = DaysOfWeek.values();
//TASK1
//        for (DaysOfWeek week : days) {
//            System.out.println(week);
//        }

//TASK2
//        for (DaysOfWeek day : days) {
//            switch (day) {
//                case THURSDAY: case TUESDAY: case SATURDAY:
//                    System.out.println(day); break;
//                    default:
//                        System.out.println("No class day");
//            }
//        }

//TASK3
        Scanner sc = new Scanner(System.in);
        String day = sc.next();
        DaysOfWeek dd = DaysOfWeek.valueOf(day.toUpperCase());
        System.out.println("The next day of week is " + dd.nextDay());

    }
}

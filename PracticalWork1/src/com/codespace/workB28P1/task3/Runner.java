package com.codespace.workB28P1.task3;

import java.util.Scanner;

public class Runner {
    public void run() {
        Scanner sc = new Scanner(System.in);
//TASK1
        System.out.print("Enter the size of train schedule -> ");
        TrainSchedule schedule = new TrainSchedule(sc.nextInt());

        System.out.print("Enter the number of trains in train schedule -> ");
        int numberTrains = sc.nextInt();
        for (int i = 0; i < numberTrains; i++) {
            schedule.addTrain();
        }
        schedule.printTrains();

//TASK2
        System.out.print("Search for trains that arrive at ->");
        String searchStation = sc.next();

        System.out.print("Search for arrival week-day -> ");
        String day = sc.next().toUpperCase();
        DaysOfWeek searchDay = DaysOfWeek.valueOf(day);
        schedule.searchTrains(searchStation, searchDay);
    }
}

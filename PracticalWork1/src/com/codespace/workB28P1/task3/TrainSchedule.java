package com.codespace.workB28P1.task3;

import java.util.Scanner;

public class TrainSchedule {
    private Train[] trains;
    static int numberTrains = 0;

    public TrainSchedule(int numberOfTrains) {
        trains = new Train[numberOfTrains];
    }

    public void addTrain() {
        Train train = new Train();
        Scanner sc = new Scanner(System.in);
        System.out.print("Set train number -> "); train.setNumber(sc.nextInt());
        System.out.print("Set station dispatch -> "); train.setStationDispatch(sc.next());
        System.out.print("Set station arrival -> "); train.setStationArrival(sc.next());
        System.out.print("Set time dispatch -> "); train.setTimeDispatch(sc.next());
        System.out.print("Set time arrival -> "); train.setTimeArrival(sc.next());
        System.out.println("Set days splitting them with spaces -> ");
        sc.nextLine();
        String[] splitDays = sc.nextLine().split(" ");
        DaysOfWeek[] days = new DaysOfWeek[splitDays.length];
        for (int i = 0; i < days.length; i++) {
            days[i] = DaysOfWeek.valueOf(splitDays[i].toUpperCase());
        }
        train.setDays(days);

        if (numberTrains < trains.length) {
            trains[numberTrains++] = train;
        } else {
            System.out.println("Schedule is full.");
        }
    }


//        int countTrains = 2;
//        for (int i = 0; i<countTrains; i++) {
//            Train train = new Train();
//            System.out.print("Set train number -> "); train.setNumber(sc.nextInt());
//            System.out.print("Set station dispatch -> "); train.setStationDispatch(sc.next());
//            System.out.print("Set station arrival -> "); train.setStationArrival(sc.next());
//            System.out.print("Set time dispatch -> "); train.setTimeDispatch(sc.next());
//            System.out.print("Set time arrival -> "); train.setTimeArrival(sc.next());
////            train.setDays(DaysOfWeek.valueOf(sc.next().toUpperCase()));
//            trains[i] = train;
//        }
// }

    public void printTrains() {
        for (int i = 0; i < numberTrains; i++) {
            System.out.println(trains[i]);
        }
    }

    public void searchTrains(String searchStation, DaysOfWeek searchDay) {
        for (int i = 0; i < numberTrains; i++) {
            String arr = trains[i].getStationArrival();
            if (arr.equals(searchStation)) {
                DaysOfWeek[] dd = trains[i].getDays();
                for (DaysOfWeek days : dd) {
                    if (days.equals(searchDay)) {
                        System.out.println(trains[i]);
                        break;
                    }
                }
            } else {
                System.out.println("No trains found");
            }
        }
    }
}

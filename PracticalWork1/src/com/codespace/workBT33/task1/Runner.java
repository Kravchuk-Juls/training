package com.codespace.workBT33.task1;

public class Runner {
    public void run() throws InterruptedException {
//TASK1
//        new MyTimeBomb1().start();
//        System.out.println("End");

//TASK2
//        System.out.println("-----------");
//        new Thread(new MyTimeBomb2()).start();

//TASK3
        Thread thread = new MyTimeBomb1();
        thread.start();
        thread.join();

        System.out.println("-----------");
        new Thread(new MyTimeBomb2()).start();
    }
}

package com.codespace.workBT33.task1;

public class MyTimeBomb2 implements Runnable {
    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Cancel");
            }
        }
        System.out.println("Boom!!!");
    }
}
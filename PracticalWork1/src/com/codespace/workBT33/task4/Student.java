package com.codespace.workBT33.task4;

public class Student implements Runnable {
    private DiningHall dining;

    public Student(DiningHall dining) {
        this.dining = dining;
    }

    @Override
    public void run() {
//TASK1
        synchronized (dining) {
            dining.servePizza();
        }
    }
}

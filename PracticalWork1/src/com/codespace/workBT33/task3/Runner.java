package com.codespace.workBT33.task3;

public class Runner {
    public void run() {
        Storage storage = new Storage();
        int num = 100;
        new Thread(new Counter(storage, num)).start();
        new Thread(new Printer(storage, num)).start();


    }

}

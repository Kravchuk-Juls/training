package com.codespace.workBT33.task3;

public class Printer implements Runnable {
    private Storage storage;
    private int num;

    public Printer(Storage storage, int num) {
        this.storage = storage;
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < num; i++) {
                try {
                    while (!storage.isChangeFlag()) {
                        storage.wait();
                    }
                    System.out.println(storage.getValue());
                    storage.setChangeFlag(false);
                    storage.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

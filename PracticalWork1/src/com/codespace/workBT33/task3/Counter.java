package com.codespace.workBT33.task3;

public class Counter implements Runnable {
    private Storage storage;
    private int num;

    public Counter(Storage storage, int num) {
        this.storage = storage;
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (storage) {
            for (int i = 0; i < num; i++) {
                try {
                    while (storage.isChangeFlag()) {
                        storage.wait();
                    }
                    storage.setValue(i);
                    storage.setChangeFlag(true);
                    storage.notify();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}

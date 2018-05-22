package com.codespace.workB25P1.task3;

import java.util.Random;

public class Id {
    private static int nextId;
    private int id;

    static {
        Random random = new Random();
        nextId = random.nextInt(100) + 1;
    }

    public int getId() { return id; }

    public Id () {
        id = nextId;
        nextId++;
    }


}

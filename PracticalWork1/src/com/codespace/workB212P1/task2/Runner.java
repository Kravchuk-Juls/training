package com.codespace.workB212P1.task2;

import java.util.Set;

public class Runner {
    public void run() {
        MyNumGenerator numGenerator = new MyNumGenerator(10, 15);
        Set<?> set = numGenerator.generateSet();
        System.out.println(set);
    }
}

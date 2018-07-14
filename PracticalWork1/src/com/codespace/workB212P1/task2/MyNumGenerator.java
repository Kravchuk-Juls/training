package com.codespace.workB212P1.task2;

import java.util.HashSet;
import java.util.Set;

public class MyNumGenerator {
    private int numOfElm;
    private int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }

    public Set<Integer> generateSet() {
        Set<Integer> set = new HashSet<>();
        if (numOfElm > maxNumb) {
            throw new RuntimeException("");
        }

        for (int i = 0; i < numOfElm; i++) {
            set.add((int) (Math.random() * maxNumb));
        }
        return set;
    }
}

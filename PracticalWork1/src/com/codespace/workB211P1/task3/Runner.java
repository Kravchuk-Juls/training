package com.codespace.workB211P1.task3;

import java.util.Arrays;

public class Runner {
    public void run() {
        Integer[] integers = {1, 15, 2, -4, 8, 0};
        String[] strings = {"one", "two", "three", "four", "five", "six"};
        print(integers);
        print(strings);
        System.out.println("---------------------------------------------");

        MyMixer<Integer> i = new MyMixer<>(integers);
        MyMixer<String> s = new MyMixer<>(strings);

        i.shuffle();
        print(integers);
        s.shuffle();
        print(strings);
    }

    public <T> void print(T[] array) {
        System.out.println(array.getClass().getSimpleName() + " array elements are - " + Arrays.toString(array));
    }
}

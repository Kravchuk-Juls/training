package com.codespace.workBT33.task2;

import java.util.Arrays;
import java.util.Random;

public class Runner {
    public void run() throws InterruptedException {
        int[] myArray = createArray(15);
        System.out.println(Arrays.toString(myArray));

//TASK1
        MySumCount1 sumCount1 = new MySumCount1();
        sumCount1.setMyArray(myArray);
        sumCount1.setStartIndex(0);
        sumCount1.setStopIndex(2);
        sumCount1.start();
        sumCount1.join();
        System.out.println("sum = " + sumCount1.getResultSum());

//TASK2
        System.out.println("------------------");
        MySumCount2 mySumCount2 = new MySumCount2();
        mySumCount2.setMyArray(myArray);
        mySumCount2.setStartIndex(0);
        mySumCount2.setStopIndex(2);
        Thread sumCount2 = new Thread(mySumCount2);
        sumCount2.start();
        sumCount2.join();
        System.out.println("sum result 2 = " + mySumCount2.getResultSum());
    }

    public int[] createArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        return array;
    }
}

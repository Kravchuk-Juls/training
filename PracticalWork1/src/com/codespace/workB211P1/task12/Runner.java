package com.codespace.workB211P1.task12;

public class Runner {
    public void run() {
//TASK1
        Integer[] integers = {1, 15, 2, -4, 8, 0};
        Double[] doubles = {-10.5, 3.4, 28.9, 5.2, 0.0, 12.1};

        System.out.println("For int -> " + MyTestMethod.<Integer>calcNum(integers, 0));
        System.out.println("For double -> " + MyTestMethod.<Double>calcNum(doubles, 0.0));
        System.out.println("For byte -> " + MyTestMethod.<Byte>calcNum(new Byte[]{}, (byte) 0));

//TASK2
        System.out.println("---------------------------------------------");
        System.out.println("Sum for int -> " + MyTestMethod.<Integer>calcSum(integers, 0));
        System.out.println("Sum for int -> " + MyTestMethod.<Double>calcSum(doubles, 0.0));
        System.out.println("Sum for int -> " + MyTestMethod.calcSum(doubles, 0.0));


    }

}

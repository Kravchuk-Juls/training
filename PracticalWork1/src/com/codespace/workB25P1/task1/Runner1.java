package com.codespace.workB25P1.task1;

import java.util.Scanner;

public class Runner1 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N = ");
        int n = sc.nextInt();

        double piResult = MyCalculate.calcPi(n);
        System.out.println("Pi result = " + piResult);

    }
}

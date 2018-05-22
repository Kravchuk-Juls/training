package com.codespace.workB25P1.task1;

public class MyCalculate {
    private static final int FOUR = 4;
    public static double calcPi(int n) {
        double result = 0.0;
        double denominator = 1.0;
        int sign = 1;
        for (int i = 0; i < n; i++, denominator += 2) {
            result += FOUR / denominator * sign;
            sign = -sign;
        }
        return result;
    }
}

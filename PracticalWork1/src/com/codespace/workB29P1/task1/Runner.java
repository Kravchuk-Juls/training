package com.codespace.workB29P1.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {
//TASK1 + TASK2

//    public void run() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter a = ");
//        int a = scanner.nextInt();
//        System.out.print("Enter b = ");
//        int b = scanner.nextInt();
//        System.out.println("Result = " + divisionInt(a,b));
//
//        System.out.print("Enter a = ");
//        double c = scanner.nextDouble();
//        System.out.print("Enter b = ");
//        double d = scanner.nextDouble();
//        System.out.println("Result = " + divisionDouble(c,d));
//    }
//
//    public int divisionInt(int a, int b) {
//        int result = -1;
//        try {
//            result = Math.abs(a / b);
//        } catch (ArithmeticException e) {
//            System.err.println("Wrong argument value");
//        }
//        return result;
//    }
//
//    public int divisionDouble (double c, double d) {
//        int result = -1;
//        try{
//            if (Double.compare(d, 0.0) == 0) {
//                throw new ArithmeticException();
//            }
//
//            result = Math.abs((int)(c/d));
//        } catch (ArithmeticException e) {
//            System.err.println("Wrong argument value");
//        }
//        return result;
//    }

//TASK3

    public void run() {
        Scanner sc = new Scanner(System.in);
        int resultDivInt = 0;
        int resultDivDouble = 0;

        try {
        System.out.print("Enter int value a = "); int a = sc.nextInt();
        System.out.print("Enter int value b = "); int b = sc.nextInt();
        System.out.print("Enter double value c = "); double c = sc.nextDouble();
        System.out.print("Enter double value d = "); double d = sc.nextDouble();

            resultDivInt = divisionInt(a,b);
            resultDivDouble = divisionDouble(c,d);

            System.out.println("------------------------");
            System.out.println("Result divisionInt = " + resultDivInt);
            System.out.println("Result divisionDouble = " + resultDivDouble);
        } catch (InputMismatchException e) {
            System.err.println("Wrong input value");
        } catch (ArithmeticException e) {
            if (resultDivInt <= 0) {
                System.err.println("Int: wrong argument value - division by zero");
            }
            if (resultDivDouble <= 0) {
                System.err.println("Double: wrong argument value - division by zero");
            } else { System.out.println("Wrong argument"); }
        }

    }

    public int divisionInt(int a, int b) throws ArithmeticException {
        int result = Math.abs(a / b);
        return result;
    }

    public int divisionDouble(double c, double d) throws ArithmeticException{
        if (Double.compare(d, 0.0) == 0) {
            throw new ArithmeticException();
        }
        int result = Math.abs((int) (c / d));
        return result;
    }
}

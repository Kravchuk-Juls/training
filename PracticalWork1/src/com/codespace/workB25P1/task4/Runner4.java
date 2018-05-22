package com.codespace.workB25P1.task4;

import com.codespace.workB25P1.task4.calcarea.Calculate;

import java.util.Scanner;

public class Runner4 {
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter circle radius = ");
        double circleR = sc.nextDouble();

        System.out.print("Enter square side = ");
        int squareS = sc.nextInt();


        double areaCircle = Calculate.areaCircle(circleR);
        System.out.println("Circle area equals to - " + areaCircle);

        double areaSquare = Calculate.areaSquare(squareS);
        System.out.println("Square area equals to - " + areaSquare);

    }
}

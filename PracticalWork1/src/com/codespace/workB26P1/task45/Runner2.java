package com.codespace.workB26P1.task45;

import java.util.Arrays;

public class Runner2 {
    public void run() {
        Shape[] shapes = new Shape[9];
        shapes[0] = new Rectangle("white", 2,3);
        shapes[1] = new Rectangle("yellow", 3,3);
        shapes[2] = new Rectangle("orange");
        shapes[3] = new Rectangle(1,2);
        shapes[4] = new Circle(5);
        shapes[5] = new Circle("black",4);
        shapes[6] = new Circle();
        shapes[7] = new Triangle("blue", 4,3,6);
        shapes[8] = new Triangle("green", 3,3,3);

        calcArea(shapes);
    }

    public void calcArea(Shape[] shapes) {
        for(Shape sh : shapes) {
            System.out.println("Shape info - " + sh.toString());
            System.out.println("Shape area is " + sh.calcArea());
            System.out.println("---------------------");
        }
    }
}

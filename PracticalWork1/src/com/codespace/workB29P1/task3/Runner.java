package com.codespace.workB29P1.task3;

import java.util.Scanner;

public class Runner {
    public void run() {
//TASK1
//        Shape shape1 = null, shape2 = null, shape3 = null;
//        try { shape1 = Shape.parseShape("Triangle:RED:"); }
//        catch (InvalidShapeStringException e) { System.err.println(e.getMessage());}
//
//        try { shape2 = Shape.parseShape("Rectangle:Black:0,1"); }
//        catch (InvalidShapeStringException e) { System.err.println(e.getMessage());}
//
//        try { shape3 = Shape.parseShape("Circle::5");}
//        catch (InvalidShapeStringException e) { System.err.println(e.getMessage());}
//
//        if (shape1 != null) { System.out.println(shape1); }
//        else if (shape2 != null) { System.out.println(shape2); }
//        else if (shape3 != null) { System.out.println(shape3); }
//        else { System.out.println("No figures for print");}

//TASK2
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shapes array size -> "); int arraySize = sc.nextInt();
        Shape[] shapes = new Shape[arraySize];

        for (int i = 0; i<shapes.length; i++) {
            System.out.print("Enter shape info -> ");
            String shapeInfo = sc.next();
            try{
                shapes[i] = Shape.parseShape(shapeInfo);
            } catch(InvalidShapeStringException e) {
                System.err.println(e.getMessage());
            }
        }

        printShapes(shapes);
    }

    void printShapes (Shape[] shapes) {
        for (Shape s : shapes) {
            if (s!=null) {
                System.out.println(s);
            }
        }
    }
}

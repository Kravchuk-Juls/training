package com.codespace.workB28P1.task5;

import java.util.Scanner;

public class Runner {
    public void run() {
//TASK1
//        Shape shape1 = Shape.parseShape("Rectangle:RED:1,2");
//        System.out.println(shape1);
//        Shape shape2 = Shape.parseShape("Triangle:YELLOW:4,4,5");
//        System.out.println(shape2);
//        Shape shape3 = Shape.parseShape("Circle:WHITE:5");
//        System.out.println(shape3);

//TASK2
//        System.out.println(Shape.parseShape2("Rectangle:RED:1,2"));
//        System.out.println(Shape.parseShape2("Triangle:YELLOW:4,4,5"));
//        System.out.println(Shape.parseShape2("Circle:WHITE:5"));

//TASK3
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes that will be created -> ");
        Shape[] shapes = new Shape[sc.nextInt()];
        int countShapes = 0;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape format [shapeForm:color:size,size,size]. Enter shape -> ");
            shapes[countShapes++] = Shape.parseShape2(sc.next());
        }

        printShapes(shapes);
    }

    void printShapes(Shape[] shapes) {
        for (Shape s : shapes) {
            if (s!=null) {
                System.out.println(s);
            }
        }
    }
}

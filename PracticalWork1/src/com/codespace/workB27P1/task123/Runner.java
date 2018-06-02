package com.codespace.workB27P1.task123;

import java.util.Arrays;

public class Runner {
    public void run() throws CloneNotSupportedException{
//TASK 1, 2
        Shape[] shapes = createShapes();
        printShapes(shapes);

//TASK 3
        System.out.println("----------------------------------------------------------");
        Shape rect1 = new Rectangle("Black", 5, 8);
        Shape rect2 = new Rectangle("White", 10, 4);
        if (rect1.compareTo(rect2) > 0) {
            System.out.println("Rect1 is bigger than rect2");
        } else if (rect1.compareTo(rect2) < 0) {
            System.out.println("Rect1 is smaller than rect2");
        } else {
            System.out.println("Rectangles are equal");
        }

        System.out.println("----------------------------------------------------------");
        Arrays.sort(shapes);
        printShapes(shapes);

//TASK 4
        System.out.println("----------------------------------------------------------");
        Arrays.sort(shapes, new MyComparatorColor());
        printShapes(shapes);

        System.out.println("----------------------------------------------------------");
        System.out.println(new MyComparatorColor().compare(shapes[2], shapes[4]));

//CLONING
        System.out.println("----------------------------------------------------------");
        Circle circle = new Circle("Blue", 10);
        Circle object = (Circle)circle.clone();
        System.out.println("1) " + circle);
        System.out.println("2) " + object);
        System.out.println(circle.equals(object));                       //check object links
        System.out.println(circle.getColor().equals(object.getColor())); //check string values
        System.out.println(circle.getColor() == object.getColor());      //check string links
        object.setColor("Red");
        System.out.println("\n1) " + circle);
        System.out.println("2) " + object);
    }

    public Shape[] createShapes() {
        return new Shape[]{
                new Circle("Red", 5),
                new Rectangle("Black", 2, 3),
                new Rectangle("White", 4, 6),
                new Triangle("Yellow", 3, 4, 5),
                new Triangle("Blue", 6, 7, 10),
                new Circle("Green", 9),
                new Rectangle("Brown", 4, 9),
                new Triangle("Lemon", 5, 11, 12),
                new Circle("Purple", 23),
                new Rectangle("Blue", 1, 7)
        };
    }

//TASK 1
//    public void printShapes(Shape[] shapes) {
//        for (Shape shape : shapes) {
//            System.out.println(shape + "     -> area = " + shape.calcArea());
//        }
//    }

//TASK 2
    public void printShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
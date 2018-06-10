package com.codespace.workB28P1.task5;

import com.codespace.workB28P1.task5.Drawable;

public abstract class Shape implements Drawable, Comparable, Cloneable{
    private String color;


    public String getColor() { return color; }
    public void setColor(String color) {this.color = color; }

    public Shape(String color) { this.color = color; }
    public Shape() { this("transparent"); }


    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() + ", color=" + this.color;
    }

    public abstract double calcArea() ;

    @Override
    public void draw() {
        System.out.println(this + "; area = " + calcArea());
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Shape)) {
            System.err.println("Wrong object");
            System.exit(-1);
        }
        Shape other = (Shape)o;
        if (this.calcArea() < other.calcArea()) return -1;
        if (this.calcArea() > other.calcArea()) return 1;
        return 0;
    }

    public static Shape parseShape (String str) {
        String[] figure = str.split(":");
        Shape result;
        switch (figure[0]) {
            case "Rectangle":
                String[] size1 = figure[2].split(",");
                int width = Integer.parseInt(size1[0]);
                int height = Integer.parseInt(size1[1]);
                result = new Rectangle(figure[1],width, height); break;
            case "Circle":
                int radius = Integer.parseInt(figure[2]);
                result = new Circle(figure[1],radius); break;
            case "Triangle":
                String[] size2 = figure[2].split(",");
                int a = Integer.parseInt(size2[0]);
                int b = Integer.parseInt(size2[1]);
                int c = Integer.parseInt(size2[2]);
                result = new Triangle(); break;
            default:
                System.out.println("No figure found");
                result = null;
        }
        return result;

//TASK1 - ALTERNATIVE SOLUTION
//        String classShape = str.substring(0, str.indexOf(":"));
//        String shapeColor = str.substring(str.indexOf(":")+1, str.lastIndexOf(":"));
//        String sides = str.substring(str.lastIndexOf(":")+1);
//
//        Shape result;
//        if (classShape.toLowerCase().equals("rectangle")) {
//            int width = Integer.valueOf(sides.substring(0,sides.indexOf(",")));
//            int height = Integer.valueOf(sides.substring(sides.lastIndexOf(",")+1));
//            result = new Rectangle(shapeColor, width, height);
//        } else if (classShape.toLowerCase().equals("circle")) {
//            int radius = Integer.valueOf(sides);
//            result = new Circle(shapeColor, radius);
//        } else {
//            int a = Integer.valueOf(sides.substring(0,sides.indexOf(",")));
//            int b = Integer.valueOf(sides.substring(sides.indexOf(",")+1, sides.lastIndexOf(",")));
//            int c = Integer.valueOf(sides.substring(sides.lastIndexOf(",")+1));
//            result = new Triangle(shapeColor, a, b, c );
//        }
//
//        return result;
    }

    public static Shape parseShape2 (String str) {
        String classShape = str.substring(0, str.indexOf(":")).toLowerCase();
        switch (classShape) {
            case "rectangle":
                return Rectangle.parseRectangle(str);
            case "circle":
                return Circle.parseCircle(str);
            case "triangle":
                return Triangle.parseTriangle(str);
            default:
                System.out.println("No figure found");
        }
        return null;
    }

}

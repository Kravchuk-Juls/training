package com.codespace.workB29P1.task3;

import com.codespace.workB29P1.task3.Drawable;

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
        String classShape = str.substring(0, str.indexOf(":")).toLowerCase();
        switch (classShape) {
            case "rectangle":
                return Rectangle.parseRectangle(str);
            case "circle":
                return Circle.parseCircle(str);
            case "triangle":
                return Triangle.parseTriangle(str);
            default: throw new InvalidShapeStringException("Wrong figure input");
        }
    }

}

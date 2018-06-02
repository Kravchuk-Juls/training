package com.codespace.workB26P1.task45;

public class Shape {
    private String color;


    public String getColor() { return color; }

    public Shape(String color) { this.color = color; }
    public Shape() { this("transparent"); }


    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() + ", color=" + this.color;
    }

    double calcArea() {
        System.out.println("Figure is not defined");
        return 0.0;
    }
}

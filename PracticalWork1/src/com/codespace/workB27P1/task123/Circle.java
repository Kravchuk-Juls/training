package com.codespace.workB27P1.task123;

public class Circle extends Shape {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(String color) { super(color); }

    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(){ this(0); }

    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ", color=" + super.getColor() +
                ", radius=" + this.radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}

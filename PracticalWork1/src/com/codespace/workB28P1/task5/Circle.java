package com.codespace.workB28P1.task5;

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

    static Circle parseCircle (String str) {
        String[] figure = str.split(":");
        return new Circle(figure[1], Integer.parseInt(figure[2]));
    }

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

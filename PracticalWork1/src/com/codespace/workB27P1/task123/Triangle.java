package com.codespace.workB27P1.task123;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ", color=" + super.getColor() +
                ", sideA=" + this.a +
                ", sideB=" + this.b +
                ", sideC=" + this.c;
    }

    @Override
    public double calcArea() {
        double tmp = (a + b + c)*0.5;
        return Math.sqrt(tmp*(tmp-a)*(tmp-b)*(tmp-c));

    }
}

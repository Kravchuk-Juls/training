package com.codespace.workB27P1.task123;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color) {
        super(color);
    }

    public Rectangle() {
    }


    @Override
    public String toString(){
        return "class=" + getClass().getSimpleName() +
                ", color=" + super.getColor() +
                ", width=" + this.width +
                ", height=" + this.height;
    }

    @Override
    public double calcArea() {
        return width * height;
    }

}

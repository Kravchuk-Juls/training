package com.codespace.workB28P1.task5;

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

    static Rectangle parseRectangle (String str) {
        String[] figure = str.split(":|,");
        String color = figure[1];
        int width = Integer.parseInt(figure[2]);
        int height = Integer.parseInt(figure[3]);
        return new Rectangle(color, width, height);
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

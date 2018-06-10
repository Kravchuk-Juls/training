package com.codespace.workB29P1.task3;

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

    static Rectangle parseRectangle (String str) throws InvalidShapeStringException {
        String[] figure = str.split(":|,");
        String color = figure[1];
        int width, height;
        try {
            width = Integer.parseInt(figure[2]);
            height = Integer.parseInt(figure[3]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new InvalidShapeStringException("Invalid rectangle sides input");
        }

        if (width <= 0 | height <= 0 | color.equals("".trim()) | color == null ) {
            throw new InvalidShapeStringException("Invalid rectangle data");
        }
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

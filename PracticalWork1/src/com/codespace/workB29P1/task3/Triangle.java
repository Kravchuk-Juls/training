package com.codespace.workB29P1.task3;

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

    static Triangle parseTriangle (String str) throws InvalidShapeStringException {
        String[] figure = str.split(":|,");
        String color = figure[1];
        int a,b,c;
        try {
            a = Integer.parseInt(figure[2]);
            b = Integer.parseInt(figure[3]);
            c = Integer.parseInt(figure[4]);
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            throw new InvalidShapeStringException("Invalid triangle sides input");
        }
        if (a <= 0 | b <= 0 | c <= 0 | color.equals("".trim()) | color == null ) {
            throw new InvalidShapeStringException("Invalid triangle data");
        }
        return new Triangle(color, a, b, c);
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

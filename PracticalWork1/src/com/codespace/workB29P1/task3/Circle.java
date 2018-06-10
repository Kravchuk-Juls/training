package com.codespace.workB29P1.task3;

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

    static Circle parseCircle (String str) throws InvalidShapeStringException {
        String[] figure = str.split(":");
        String color = figure[1];
        int radius = Integer.parseInt(figure[2]);

        if (radius <=0 | color.equals("".trim()) | color == null ) {
            throw new InvalidShapeStringException("Invalid circle data");
        }
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

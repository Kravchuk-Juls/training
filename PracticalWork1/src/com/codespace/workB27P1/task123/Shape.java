package com.codespace.workB27P1.task123;

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

//soft cloning
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

//hard cloning
    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape other = (Shape)super.clone();
//        other.setColor("Blue");
        other.setColor(new String(this.getColor()));
        return other;
    }
}

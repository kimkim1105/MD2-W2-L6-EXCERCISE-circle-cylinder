package com.codegym;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolumn(){
        return super.getArea()*this.height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                super.toString()+
                ", height=" + height +
                '}';
    }
}

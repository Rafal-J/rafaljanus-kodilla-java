package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String shapeName;
    public double field;

    public Triangle(String figureName, double base, double height) {
        this.shapeName = figureName;
        this.field = base*height/2;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }
}
package com.kodilla.testing.shape;

public class Square implements Shape {
    public String shapeName;
    public double field;

    public Square(String figureName, double side) {
        this.shapeName = figureName;
        this.field = side*side;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }
}
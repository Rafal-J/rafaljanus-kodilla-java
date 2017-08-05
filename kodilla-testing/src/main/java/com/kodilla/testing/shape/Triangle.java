package com.kodilla.testing.shape;

public class Triangle implements Shape {
    public String shapeName;
    public double field;

    public Triangle(String figureName, double figureField) {
        this.shapeName = figureName;
        this.field = figureField;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }
}
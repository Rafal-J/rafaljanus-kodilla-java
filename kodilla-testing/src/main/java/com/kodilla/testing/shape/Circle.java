package com.kodilla.testing.shape;

/**
 * Created by RJanus on 05.08.2017.
 */
public class Circle implements Shape {
    public String shapeName;
    public double field;

    public Circle(String figureName, double radius) {
        this.shapeName = figureName;
        this.field = 3.14*radius*radius;
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }
}

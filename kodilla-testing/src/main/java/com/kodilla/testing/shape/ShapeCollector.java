package com.kodilla.testing.shape;

import java.util.ArrayList;

/**
 * Created by RJanus on 05.08.2017.
 */
public class ShapeCollector {
    public ArrayList<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        if (shapes.size() > 0 && shapes.contains(shape) == true) {
            shapes.remove(shape);
        }
    }

    public Shape getShapeFromList(int i) {
        if (shapes.size() > 0 && i < shapes.size()) {
            return shapes.get(i);
        }
        return null;
    }

    public String printWholeList() {
        String wholeList = "";
        for (int i = 0; i < shapes.size(); i++) {
            wholeList = wholeList + "Shape: " + shapes.get(i).getShapeName() + ". Field: " + shapes.get(i).getField() + ".";
            if (i < shapes.size() - 1) {
                wholeList = wholeList + "\n";
            }
        }
        return wholeList;
    }
}

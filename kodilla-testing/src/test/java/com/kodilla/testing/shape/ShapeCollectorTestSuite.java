package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by RJanus on 05.08.2017.
 */
public class ShapeCollectorTestSuite {

    @Test
    public void testAddShape(){
        ShapeCollector testCollection = new ShapeCollector();
        Shape testShape = new Triangle("Triangle",10,5);
        testCollection.addShape(testShape);
        Assert.assertEquals(1,testCollection.shapes.size());
    }

    @Test
    public void testRemoveShape(){
        ShapeCollector testCollection = new ShapeCollector();
        Shape testShape = new Circle("Circle",10.5);
        testCollection.addShape(testShape);
        testCollection.removeShape(testShape);
        Assert.assertEquals(0,testCollection.shapes.size());
   }

   @Test
   public void testGetFigure(){
       ShapeCollector testCollection = new ShapeCollector();
       Shape testShape = new Square("Square",8);
       testCollection.addShape(testShape);
       Assert.assertEquals("Square",testCollection.getShapeFromList(0).getShapeName());
       Assert.assertEquals(64,testCollection.getShapeFromList(0).getField());
   }

   @Test
    public void testPrintWholeList(){

   }
}


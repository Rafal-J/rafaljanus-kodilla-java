package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage(){
        int[] integers = {1,2,3,4,5,11,12,13,14,15,21,22,23,24,25,31,32,33,34,34};
        double average = ArrayOperations.getAverage(integers);
        Assert.assertEquals(17.95,average,0.01);
    }
}

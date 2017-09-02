package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {

    @Test
    public void testCalculations(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double addResult = calculator.add(5,4);
        Assert.assertEquals(9, addResult, 0.001);

        double subResult = calculator.sub(7,8);
        Assert.assertEquals(-1, subResult, 0.001);

        double mulResult = calculator.mul(6, 6);
        Assert.assertEquals(36, mulResult, 0.001);

        double divResult = calculator.div(10, 2);
        Assert.assertEquals(5, divResult, 0.001);
    }

}

package com.kodilla.patterns2.aop.calculator;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@EnableAspectJAutoProxy
public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mul(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        if(y == 0) {
            throw new ArithmeticException("Dzielenie przez zero");
        }
        return x / y;
    }

    public BigDecimal factorial(BigDecimal number) {
        if(number.compareTo(BigDecimal.ONE) > 0){
            return number.multiply(factorial(number.subtract(BigDecimal.ONE)));
        }
        else if(number.equals(BigDecimal.ONE) || number.equals(BigDecimal.ZERO)){
            return BigDecimal.ONE;
        }
        throw new ArithmeticException("Podano liczbę ujemną");
    }
}

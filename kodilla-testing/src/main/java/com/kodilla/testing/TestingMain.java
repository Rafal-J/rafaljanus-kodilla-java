package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

/**
 * Created by RJanus on 01.08.2017.
 */
public class TestingMain {
    public static void main (String[] args)
    {
        SimpleUser simpleUser = new SimpleUser("NowyUżytkownik");

        String userName = simpleUser.getUsername();

        if (userName.equals("NowyUżytkownik")) {
            System.out.println("Jest OK!");
        }

        else
        {
            System.out.println("Błąd!!!");
        }

        System.out.println("Test jednostkowy kalkulatora:");

        int sum = Calculator.addition(2,2);
        if(sum==2+2)
        {
            System.out.println("Test dodawania: OK!");
        }

        else
        {
            System.out.println("Test dodawania: błąd!!!");
        }

        int difference = Calculator.substraction(2,2);
        if (difference==2-2)
        {
            System.out.println("Test odejmowania: OK!");
        }

        else
        {
            System.out.println("Test odejmowania: błąd!!!");
        }
    }
}

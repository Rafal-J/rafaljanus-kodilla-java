package com.kodilla.testing.collection;

import java.util.ArrayList;

/**
 * Created by RJanus on 03.08.2017.
 */
public class OddNumbersExterminator {
    public static ArrayList<Integer> exterminate (ArrayList<Integer> numbers)
    {
        for(int i = 0; i < numbers.size(); i++)
        {
            if((numbers.get(i)%2!=0)
            {
                numbers.remove(i);
            }
        }

        return numbers;
    }
}

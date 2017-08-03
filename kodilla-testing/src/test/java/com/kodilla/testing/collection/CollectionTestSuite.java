package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by RJanus on 03.08.2017.
 */
public class CollectionTestSuite {
    @Before
    public void before()
    {
        System.out.println("Początek przypadku testowego exterminatora liczb nieparzystych");
    }

    @After
    public void after()
    {
        System.out.println("Koniec przypadku testowego exterminatora liczb nieparzystych");
        System.out.println();
    }

    @Test
    public void testCaseWithNumbers()
    {
        ArrayList testList = new ArrayList<Integer>();

        for(Integer i = 1; i < 10; i++)
        {
            testList.add(i);
        }

        ArrayList result = new ArrayList<Integer>();
        result = OddNumbersExterminator.exterminate(testList);

        ArrayList expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);

        Assert.assertEquals(expected,result);
    }

    @Test
    public void testCaseEmptyList()
    {
        ArrayList testList = new ArrayList<Integer>();

        ArrayList result = new ArrayList<Integer>();
        result = OddNumbersExterminator.exterminate(testList);

        ArrayList expected = new ArrayList<Integer>();

        Assert.assertEquals(expected,result);
    }
}

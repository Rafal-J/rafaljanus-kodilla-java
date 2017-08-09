package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;

public class ForumTestSuite {
    @Before
    public void before(){
        System.out.println("Przypadek testowy: początek");
    }

    @After
    public void after(){
        System.out.println("Przypadek testowy: koniec");
    }

    @BeforeClass
    public static void  beforeClass(){
        System.out.println("Zestaw testów: początek");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Zestaw testów: koniec");
    }
    @Test
    public void testCaseUsername() {
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Kevin Mitnick");
        //When
        String result = simpleUser.getUsername();
        //Then
        Assert.assertEquals("theForumUser", result);
    }

    @Test
    public void testCaseRealname(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser","Kevin Mitnick");
        //When
        String result = simpleUser.getRealname();
        //Then
        Assert.assertEquals("Kevin Mitnick", result);
    }
}
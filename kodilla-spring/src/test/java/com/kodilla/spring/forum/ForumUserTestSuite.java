package com.kodilla.spring.forum;

import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ForumUserTestSuite {

    @Test
    public void testGetUserName(){

        ApplicationContext springContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = springContext.getBean(ForumUser.class);

        String name = forumUser.getUserName();

        Assert.assertEquals("John Smith", name);

    }
}

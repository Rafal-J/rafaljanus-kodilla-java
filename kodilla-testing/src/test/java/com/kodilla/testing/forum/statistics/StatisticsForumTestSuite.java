package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsForumTestSuite {
    @Test
    // number of posts = 0
    public void calculateAdvStatisticsTest1()
    {
        Statistics testStatistics = mock(Statistics.class);
        LinkedList<String> testUsersNames = new LinkedList<String>();
        String userName;
        for(int i = 1; i < 101; i++) {
            userName = "Rafał Janus" + 1;
            testUsersNames.add(userName);
        }
        int posts = 0;
        int comments = 200;

        when(testStatistics.usersNames()).thenReturn(testUsersNames);
        when(testStatistics.postsCount()).thenReturn(posts);
        when(testStatistics.commentsCount()).thenReturn(comments);

        CalculateAdvStatistics testCalculation = new CalculateAdvStatistics();
        testCalculation.calculateAdvStatistics(testStatistics);

        testCalculation.showStatistics();

        Assert.assertEquals(0,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(0,testCalculation.averageCommentsOnPosts,0.001);

    }

    @Test
    // number of posts = 1000
    public void calculateAdvStatisticsTest2()
    {
        Statistics testStatistics = mock(Statistics.class);
        LinkedList<String> testUsersNames = new LinkedList<String>();
        String userName;
        for(int i = 1; i < 101; i++) {
            userName = "Rafał Janus" + 1;
            testUsersNames.add(userName);
        }
        int posts = 1000;
        int comments = 200;

        when(testStatistics.usersNames()).thenReturn(testUsersNames);
        when(testStatistics.postsCount()).thenReturn(posts);
        when(testStatistics.commentsCount()).thenReturn(comments);

        CalculateAdvStatistics testCalculation = new CalculateAdvStatistics();
        testCalculation.calculateAdvStatistics(testStatistics);

        Assert.assertEquals(10,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(0.2,testCalculation.averageCommentsOnPosts,0.001);
    }

    @Test
    // number of comments = 0
    public void calculateAdvStatisticsTest3()
    {
        Statistics testStatistics = mock(Statistics.class);
        LinkedList<String> testUsersNames = new LinkedList<String>();
        String userName;
        for(int i = 1; i < 101; i++) {
            userName = "Rafał Janus" + 1;
            testUsersNames.add(userName);
        }
        int posts = 1000;
        int comments = 0;

        when(testStatistics.usersNames()).thenReturn(testUsersNames);
        when(testStatistics.postsCount()).thenReturn(posts);
        when(testStatistics.commentsCount()).thenReturn(comments);

        CalculateAdvStatistics testCalculation = new CalculateAdvStatistics();
        testCalculation.calculateAdvStatistics(testStatistics);

        Assert.assertEquals(0,testCalculation.averageUserComments,0.001);
        Assert.assertEquals(0,testCalculation.averageCommentsOnPosts,0.001);
    }

    @Test
    // comments < posts
    public void calculateAdvStatisticsTest4()
    {
        Statistics testStatistics = mock(Statistics.class);
        LinkedList<String> testUsersNames = new LinkedList<String>();
        String userName;
        for(int i = 1; i < 101; i++) {
            userName = "Rafał Janus" + 1;
            testUsersNames.add(userName);
        }
        int posts = 200;
        int comments = 100;

        when(testStatistics.usersNames()).thenReturn(testUsersNames);
        when(testStatistics.postsCount()).thenReturn(posts);
        when(testStatistics.commentsCount()).thenReturn(comments);

        CalculateAdvStatistics testCalculation = new CalculateAdvStatistics();
        testCalculation.calculateAdvStatistics(testStatistics);

        Assert.assertEquals(2,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(0.5,testCalculation.averageCommentsOnPosts,0.001);
    }

    @Test
    // comments > posts
    public void calculateAdvStatisticsTest5()
    {
        Statistics testStatistics = mock(Statistics.class);
        LinkedList<String> testUsersNames = new LinkedList<String>();
        String userName;
        for(int i = 1; i < 101; i++) {
            userName = "Rafał Janus" + 1;
            testUsersNames.add(userName);
        }
        int posts = 300;
        int comments = 600;

        when(testStatistics.usersNames()).thenReturn(testUsersNames);
        when(testStatistics.postsCount()).thenReturn(posts);
        when(testStatistics.commentsCount()).thenReturn(comments);

        CalculateAdvStatistics testCalculation = new CalculateAdvStatistics();
        testCalculation.calculateAdvStatistics(testStatistics);

        Assert.assertEquals(3,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(6,testCalculation.averageUserComments, 0.001);
        Assert.assertEquals(2,testCalculation.averageCommentsOnPosts,0.001);
    }

    @Test
    public void calculateAdvStatisticsTest6()
    {
        Statistics testStatistics = mock(Statistics.class);
        LinkedList<String> testUsersNames = new LinkedList<String>();
        String userName;
        for(int i = 1; i < 0; i++) {
            userName = "Rafał Janus" + 1;
            testUsersNames.add(userName);
        }
        int posts = 300;
        int comments = 600;

        when(testStatistics.usersNames()).thenReturn(testUsersNames);
        when(testStatistics.postsCount()).thenReturn(posts);
        when(testStatistics.commentsCount()).thenReturn(comments);

        CalculateAdvStatistics testCalculation = new CalculateAdvStatistics();
        testCalculation.calculateAdvStatistics(testStatistics);

        Assert.assertEquals(0,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(0,testCalculation.averageUserComments, 0.001);
        Assert.assertEquals(2,testCalculation.averageCommentsOnPosts,0.001);
    }
}
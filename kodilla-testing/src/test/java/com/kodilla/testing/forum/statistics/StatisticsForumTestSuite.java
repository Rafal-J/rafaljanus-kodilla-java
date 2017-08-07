package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsForumTestSuite {
    @Test
    public void calculateAdvStatisticsTest()
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

        testCalculation.showStatistics();

        Assert.assertEquals(10,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(2,testCalculation.averageUserComments,0.001);

        comments = 0;
        testCalculation.calculateAdvStatistics(testStatistics);
        Assert.assertEquals(2,testCalculation.averageUserComments,0.001);
        Assert.assertEquals(0.2,testCalculation.averageCommentsOnPosts,0.001);

        testUsersNames.clear();
        testCalculation.calculateAdvStatistics(testStatistics);
        testCalculation.showStatistics();

        Assert.assertEquals(0,testCalculation.averageUserPosts,0.001);
        Assert.assertEquals(0,testCalculation.averageUserComments,0.001);
    }
}

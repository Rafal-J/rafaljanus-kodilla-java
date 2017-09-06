package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void drivingTaskTest() {
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.generatingTask(taskFactory.DRIVING);

        String taskName = drivingTask.getTaskName();
        Assert.assertEquals("Zawieźć meble", taskName);
    }

    @Test
    public void paintingTaskTest() {
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.generatingTask(taskFactory.PAINTING);

        Assert.assertTrue(paintingTask.getTaskName().equals("Obraz na zamówienie"));
    }

    @Test
    public void shoppingTaskTest() {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.generatingTask(taskFactory.SHOPPING);

        Assert.assertTrue(shoppingTask.getTaskName().equals("Zakupy dla mamy"));
    }
}

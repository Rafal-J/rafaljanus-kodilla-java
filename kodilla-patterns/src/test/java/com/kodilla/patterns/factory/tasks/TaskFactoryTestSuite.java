package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void drivingTaskTest() {
        Task drivingTask = TaskFactory.generatingTask(TaskFactory.DRIVING);

        String taskName = drivingTask.getTaskName();
        Assert.assertEquals("Zawieźć meble", taskName);
    }

    @Test
    public void paintingTaskTest() {
        Task paintingTask = TaskFactory.generatingTask(TaskFactory.PAINTING);

        Assert.assertTrue(paintingTask.getTaskName().equals("Obraz na zamówienie"));
    }

    @Test
    public void shoppingTaskTest() {
        Task shoppingTask = TaskFactory.generatingTask(TaskFactory.SHOPPING);

        Assert.assertTrue(shoppingTask.getTaskName().equals("Zakupy dla mamy"));
    }
}

package com.kodilla.hibernate.taskslist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.taskslist.TasksList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskListDaoTestSuite {
    @Autowired
    private TasksListDao tasksListDao;
    private String LISTNAME = "My taskslist";

    @Test
    public void testFindByListName() {
        TasksList tasksList = new TasksList("Do zrobienia", "Zadania do wykonania w nadchodzącym tygodniu");
        tasksListDao.save(tasksList);

        String listName = tasksList.getListName();

        Assert.assertEquals(1, tasksListDao.findByListName(listName).size());

        tasksListDao.delete(tasksList.getId());
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TasksList tasksList = new TasksList(LISTNAME, "ToDo tasks");
        tasksList.getTasks().add(task);
        tasksList.getTasks().add(task2);
        task.setTasksList(tasksList);
        task2.setTasksList(tasksList);

        //When
        tasksListDao.save(tasksList);
        int id = tasksList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //tasksListDao.delete(id);
    }
}

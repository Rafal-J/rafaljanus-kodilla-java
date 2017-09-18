package com.kodilla.hibernate.taskslist.dao;

import com.kodilla.hibernate.taskslist.TasksList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class TaskListDaoTestSuite {
    @Autowired
    private TasksListDao tasksListDao;

    @Test
    public void testFindByListName() {
        TasksList tasksList = new TasksList("Do zrobienia", "Zadania do wykonania w nadchodzącym tygodniu");
        tasksListDao.save(tasksList);

        String listName = tasksList.getListName();

        Assert.assertEquals(1, tasksListDao.findByListName(listName).size());

        tasksListDao.delete(tasksList.getId());
    }
}

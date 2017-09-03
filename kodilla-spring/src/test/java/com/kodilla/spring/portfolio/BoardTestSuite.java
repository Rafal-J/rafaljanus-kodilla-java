package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class BoardTestSuite {

    @Test
    public void taskListTest(){
        ApplicationContext boardContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board myBoard = boardContext.getBean(Board.class);

        Assert.assertTrue(myBoard.getToDoList().getTasks().contains("Zakupy"));
        Assert.assertTrue(myBoard.getInProgressList().getTasks().contains("Zmywanie"));

        int amountOfTasks = myBoard.getDoneList().getTasks().size();
        Assert.assertEquals(2, amountOfTasks);
    }

    @Test
    public void addTaskTest(){
        ApplicationContext boardContext = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board myBoard = boardContext.getBean(Board.class);

        myBoard.getToDoList().getTasks().add("Mycie okien");
        int amoutOfTasks = myBoard.getToDoList().getTasks().size();
        String tempTask = myBoard.getToDoList().getTasks().get(amoutOfTasks-1);
        Assert.assertEquals("Mycie okien", tempTask);

        myBoard.getInProgressList().getTasks().add("Wycieranie kurzy");
        amoutOfTasks = myBoard.getInProgressList().getTasks().size();
        tempTask = myBoard.getInProgressList().getTasks().get(amoutOfTasks-1);
        Assert.assertEquals("Wycieranie kurzy", tempTask);

        myBoard.getDoneList().getTasks().add("Pieczenia ciasta");
        amoutOfTasks = myBoard.getDoneList().getTasks().size();
        tempTask = myBoard.getDoneList().getTasks().get(amoutOfTasks-1);
        Assert.assertEquals("Pieczenia ciasta", tempTask);
    }
}

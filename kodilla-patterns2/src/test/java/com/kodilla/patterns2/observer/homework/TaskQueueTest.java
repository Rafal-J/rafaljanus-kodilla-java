package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TaskQueueTest {

    @Test
    public void addTaskTest() {
        //Given
        Mentor mentorKrzysztofK = new Mentor("Krzyszt K");
        Mentor mentorPiotrP = new Mentor("Piotr P");

        TaskQueue userRafalR = new TaskQueue("Rafał R");
        TaskQueue userWandaW = new TaskQueue("Wanda W");
        TaskQueue userBozenaB = new TaskQueue("Bożena B");
        TaskQueue userIrenaI = new TaskQueue("Irena I");

        userRafalR.registerObserver(mentorKrzysztofK);
        userWandaW.registerObserver(mentorKrzysztofK);
        userBozenaB.registerObserver(mentorKrzysztofK);
        userIrenaI.registerObserver(mentorKrzysztofK);

        userRafalR.registerObserver(mentorPiotrP);
        userWandaW.registerObserver(mentorPiotrP);
        userBozenaB.registerObserver(mentorPiotrP);
        userIrenaI.registerObserver(mentorPiotrP);

        //when
        userRafalR.addTask("Moduł 12.3");
        userRafalR.addTask("Moduł 12.4");
        userRafalR.addTask("Moduł 12.5");

        userWandaW.addTask("Moduł 11.1");

        userBozenaB.addTask("Moduł 12.1");
        userBozenaB.addTask("Moduł 12.2");

        userIrenaI.addTask("Moduł 12.2");
        userIrenaI.addTask("Moduł 12.3");

        //Then
        Assert.assertEquals(8, mentorKrzysztofK.getTasksToCheck().size());
        Assert.assertEquals(8, mentorPiotrP.getTasksToCheck().size());
    }

    @Test
    public void removeTaskTest() {
        //Given
        Mentor mentorKrzysztofK = new Mentor("Krzyszt K");
        Mentor mentorPiotrP = new Mentor("Piotr P");

        TaskQueue userRafalR = new TaskQueue("Rafał R");
        TaskQueue userWandaW = new TaskQueue("Wanda W");
        TaskQueue userBozenaB = new TaskQueue("Bożena B");
        TaskQueue userIrenaI = new TaskQueue("Irena I");

        userRafalR.registerObserver(mentorKrzysztofK);
        userWandaW.registerObserver(mentorKrzysztofK);
        userBozenaB.registerObserver(mentorKrzysztofK);
        userIrenaI.registerObserver(mentorKrzysztofK);

        userRafalR.registerObserver(mentorPiotrP);
        userWandaW.registerObserver(mentorPiotrP);
        userBozenaB.registerObserver(mentorPiotrP);
        userIrenaI.registerObserver(mentorPiotrP);

        //when
        userRafalR.addTask("Moduł 12.3");
        userRafalR.addTask("Moduł 12.4");
        userRafalR.addTask("Moduł 12.5");

        userWandaW.addTask("Moduł 11.1");

        userBozenaB.addTask("Moduł 12.1");
        userBozenaB.addTask("Moduł 12.2");

        userIrenaI.addTask("Moduł 12.2");
        userIrenaI.addTask("Moduł 12.3");

        String task = mentorKrzysztofK.check();
        System.out.println(task);

        task = mentorPiotrP.check();
        System.out.println(task);

        //Then
        Assert.assertEquals(6, mentorKrzysztofK.getTasksToCheck().size());
        Assert.assertEquals(6, mentorPiotrP.getTasksToCheck().size());

        Assert.assertEquals(2, userRafalR.getTaskQueue().size());
        Assert.assertEquals(0, userWandaW.getTaskQueue().size());
    }
}

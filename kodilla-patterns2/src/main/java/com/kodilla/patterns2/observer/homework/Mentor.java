package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class Mentor implements Observer {
    private Deque<TaskQueue> tasksToCheck = new ArrayDeque<>();
    private String name;

    public Mentor(String name) {
        this.name = name;
    }

    public void add(TaskQueue taskQueue) {
        tasksToCheck.offer(taskQueue);
        System.out.println("Dodano nowe zadanie do sprawdzenia użytkownika " + taskQueue.getName());
    }

    public String check() {
        List<Observer> observers = tasksToCheck.peek().getObservers();
        TaskQueue queueToCheck;
        boolean test = true;
        String taskToCheck = "";

        for(Observer observer : observers) {
            queueToCheck = observer.getTasksToCheck().poll();
            if(test == true) {
                System.out.println("Usuwanie zadania z kolejki");
                taskToCheck = queueToCheck.getTaskQueue().poll();
                test = false;
            }
        }
        return taskToCheck;
    }

    @Override
    public Deque<TaskQueue> getTasksToCheck() {
        return tasksToCheck;
    }

    public String getName() {
        return name;
    }
}
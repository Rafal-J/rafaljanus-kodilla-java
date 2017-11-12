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
        List<Observer> observers = tasksToCheck.poll().getObservers();
        TaskQueue queueToCheck;
        int count = 1;
        String taskToCheck = "";

        for(Observer observer : observers) {
            queueToCheck = observer.getTasksToCheck().poll();
            if(count == 1) {
                count++;
                taskToCheck = queueToCheck.getTaskQueue().poll();
            }
            return taskToCheck;
        }
        return "Brak zadań";
    }

    @Override
    public Deque<TaskQueue> getTasksToCheck() {
        return tasksToCheck;
    }

    public String getName() {
        return name;
    }
}
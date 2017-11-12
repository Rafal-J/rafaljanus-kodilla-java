package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class TaskQueue implements Observable {
    private Deque<String> taskQueue = new ArrayDeque<String>();
    private List<Observer> observers = new ArrayList<>();
    private String name;

    public TaskQueue(String name) {
        this.name = name;
    }

    public void addTask(String task){
        taskQueue.offer(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.add(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Deque<String> getTaskQueue() {
        return taskQueue;
    }

    public String getName() {
        return name;
    }

    public List<Observer> getObservers() {
        return observers;
    }
}
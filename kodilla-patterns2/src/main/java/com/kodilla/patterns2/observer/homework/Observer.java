package com.kodilla.patterns2.observer.homework;

import java.util.Deque;

public interface Observer {
    void add(TaskQueue taskQueue);
    Deque<TaskQueue> getTasksToCheck();
}

package com.kodilla.patterns.factory.tasks;

public class PaintingTask {
    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isExecuted = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public void executeTask() {
        System.out.println("Następujące zadanie " + taskName + " jest w trakcie realizacji...");
        isExecuted = true;
    }
    public String getTaskName() {
        return taskName;
    }

    public boolean isTaskExecuted() {
        return isExecuted;
    }
}

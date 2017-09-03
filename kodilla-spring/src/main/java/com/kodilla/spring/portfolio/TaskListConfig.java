package com.kodilla.spring.portfolio;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication

public class TaskListConfig {

    @Bean
    public TaskList tasksTodo() {
        TaskList toDo = new TaskList();
        toDo.tasks.add("Zakupy");
        toDo.tasks.add("Pranie");
        return toDo;
    }

    @Bean
    public TaskList tasksInProgress() {
        TaskList inProgress = new TaskList();
        inProgress.tasks.add("Zmywanie");
        return inProgress;
    }

    @Bean
    public TaskList tasksDone() {
        TaskList done = new TaskList();
        done.tasks.add("Odkurzanie");
        done.tasks.add("Prasowanie");
        return done;
    }

    @Bean
    public Board board(){
        return new Board(tasksTodo(),tasksInProgress(),tasksDone());
    }


}

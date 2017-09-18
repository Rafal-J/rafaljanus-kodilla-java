package com.kodilla.hibernate.taskslist.dao;

import com.kodilla.hibernate.taskslist.TasksList;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TasksListDao extends CrudRepository<TasksList, Integer> {
        List<TasksList> findByListName(String listName);
        }

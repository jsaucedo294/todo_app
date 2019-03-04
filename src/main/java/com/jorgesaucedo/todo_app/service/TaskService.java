package com.jorgesaucedo.todo_app.service;


import com.jorgesaucedo.todo_app.model.Task;

public interface TaskService {
    Iterable<Task> findAll();
    Task findOne(Long id);
    void toggleComplete(Long id);
    void deleteById(Task task);
    void save(Task task);
}

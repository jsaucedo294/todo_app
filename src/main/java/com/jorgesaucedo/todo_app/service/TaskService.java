package com.jorgesaucedo.todo_app.service;


import com.jorgesaucedo.todo_app.model.Task;

public interface TaskService {
    //Call all the task to be displayed on todo_app.html
    Iterable<Task> findAll();
    //Find a task by their unique id
    Task findOne(Long id);
    //Marks complete
    void toggleComplete(Long id);
    //Delete task by unique id
    void deleteById(Task task);
    //Save task
    void save(Task task);
}

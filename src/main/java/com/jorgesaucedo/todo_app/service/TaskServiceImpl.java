package com.jorgesaucedo.todo_app.service;

import com.jorgesaucedo.todo_app.dao.TaskDao;
import com.jorgesaucedo.todo_app.model.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    public Iterable<Task> findAll() {
        return taskDao.findAll();
    }

    @Override
    public Task findOne(Long id) {
        return taskDao.findById(id).orElse(null);
    }

    @Override
    public void toggleComplete(Long id) {
        Task task = taskDao.findById(id).orElse(null);
        task.setComplete(!task.isComplete());

        taskDao.save(task);
    }

    @Override
    public void deleteById(Task task) {
        taskDao.delete(task);
    }

    @Override
    public void save(Task task) {
        if (task.getDescription() != "") {
            taskDao.save(task);
        }
    }
}

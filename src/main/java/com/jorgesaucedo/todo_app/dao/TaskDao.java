package com.jorgesaucedo.todo_app.dao;

import com.jorgesaucedo.todo_app.model.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskDao extends CrudRepository<Task, Long> {
  @Query("SELECT t from Task t")
  List<Task> findAll();
}

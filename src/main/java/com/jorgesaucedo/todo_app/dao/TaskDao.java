package com.jorgesaucedo.todo_app.dao;

import com.jorgesaucedo.todo_app.model.Task;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public interface TaskDao extends CrudRepository<Task, Long> {
}

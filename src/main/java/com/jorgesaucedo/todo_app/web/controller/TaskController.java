package com.jorgesaucedo.todo_app.web.controller;

import com.jorgesaucedo.todo_app.model.Task;
import com.jorgesaucedo.todo_app.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;

@Controller
public class TaskController {
  @Autowired
  private TaskService taskService;

  //Call list of Tasks
  @RequestMapping({"/", "/todo"})
  public String taskList(Model model) {
    Iterable<Task> tasks = taskService.findAll();
    model.addAttribute("tasks",tasks);
    model.addAttribute("newTask", new Task());
    return "todo_app";
  }

  //Mark task as complete or incomplete
  @RequestMapping(path = "/mark", method = RequestMethod.POST)
  public String toggleComplete(@RequestParam Long id) {
    Task task = taskService.findOne(id);
    taskService.toggleComplete(id);
    return "redirect:/";
  }

  //Add a new task with createAt data and saves it.
  @RequestMapping(path = "/tasks", method = RequestMethod.POST)
  public String addTask(@ModelAttribute Task task) {
    task.setCreateAt(new Date());
    taskService.save(task);
    return "redirect:/";
  }

  //Delete task when called
  @RequestMapping("/delete/{id}")
  public String deleteTask(@PathVariable Long id){
    Task task = taskService.findOne(id);
    taskService.deleteById(task);
    return "redirect:/";
  }
}
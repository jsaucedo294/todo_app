package com.jorgesaucedo.todo_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "com.jorgesaucedo.todo_app")
public class Application {
  public static void main(String[] args) {
    //Run Spring Application
    SpringApplication.run(Application.class, args);
  }
}

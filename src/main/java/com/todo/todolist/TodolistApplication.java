package com.todo.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication // (scanBasePackages = {"com.todo"})
// @EnableAutoConfiguration
@ComponentScan({ "com.todo" })
@EnableJpaRepositories({ "com.todo" })
@EntityScan({ "com.todo" })
public class TodolistApplication {

  public static void main(String[] args) {
    SpringApplication.run(TodolistApplication.class, args);
  }
}

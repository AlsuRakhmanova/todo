package com.todo.service;

import java.util.List;

import com.todo.model.ToDoList;
import com.todo.model.User;

public interface TodoService {
  public ToDoList createTodoList(String description, User user);

  public List<ToDoList> getAll(Integer id);

}

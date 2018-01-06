package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.ToDoList;
import com.todo.model.User;
import com.todo.repo.TodoRepo;

@Service
public class TodoServiceImpl implements TodoService {
  @Autowired
  private TodoRepo todoRepo;

  public ToDoList createTodoList(String description, User user) {

    return todoRepo.save(new ToDoList(description, user));
  }

  @Override
  public List<ToDoList> getAll(Integer id) {

    return todoRepo.findAllByUser_id(id);
  }

}

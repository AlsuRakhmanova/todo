package com.todo.service;

import java.util.List;

import com.todo.model.User;

public interface UserService {
  public User createUser(User user);

  public User getUser(int id);

  public List<User> getAll();
}

package com.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.model.User;
import com.todo.repo.UserRepo;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  UserRepo userRepo;

  public User createUser(User user) {
    return userRepo.save(user);
  }

  @Override
  public User getUser(int id) {
    return userRepo.findById(id);
  }

  @Override
  public List<User> getAll() {
    return userRepo.findAll();

  }

}

package com.todo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.todo.model.User;

@RepositoryRestResource(exported = false)
public interface UserRepo extends JpaRepository<User, Integer> {

  User findById(@Param("id") Integer id);

  List<User> findAll();
}

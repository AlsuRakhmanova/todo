package com.todo.repo;

import com.todo.model.ToDoList;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(exported = false)
public interface TodoRepo extends CrudRepository<ToDoList, Integer> {

  <S extends ToDoList> S save(S s);

  <S extends ToDoList> Iterable<S> save(Iterable<S> iterable);

  List<ToDoList> findAllByUser_id(Integer id);

}

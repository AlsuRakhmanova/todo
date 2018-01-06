package com.todo.todolist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.todo.model.ToDoList;
import com.todo.model.User;
import com.todo.service.TodoService;
import com.todo.service.UserService;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TodoController {

  @Autowired
  TodoService todoService;

  @Autowired
  UserService userService;

  // @Autowired
  // public TodoController(TodoRepo todoRepo) {
  // this.todoRepo = todoRepo;
  // }

  @RequestMapping("/todo")
  public String todo(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    model.addAttribute("name", name);
    return "todo";
  }

  @RequestMapping(method = RequestMethod.POST, path = "/todo/{description}")
  @ResponseStatus(HttpStatus.CREATED)
  public void createTodo(@PathVariable(value = "description") String description) {

    // User user = new User();
    // user.setUsername("Alsu");
    // userService.createUser(user);
    // todoService.createTodoList(description, user);

    todoService.createTodoList(description, userService.getUser(1));
  }

  @RequestMapping("/allUsers")
  public List<User> getAllUsers() {
    return userService.getAll();
  }

  @RequestMapping("/allTodos")
  public List<ToDoList> getAllTodos() {
    return todoService.getAll(1);
  }

}
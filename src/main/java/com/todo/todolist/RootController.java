package com.todo.todolist;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
// @RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class RootController {

  @RequestMapping("/todo")
  public String todo(Model model, @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
    model.addAttribute("name", name);
    return "todo";
  }

}
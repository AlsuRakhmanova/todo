package com.todo.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "USER")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "username")
  @NotNull
  private String username;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user") // , cascade = CascadeType.REMOVE,
  // orphanRemoval = true)
  // @OrderBy("dateTime DESC")
  // @JsonIgnore
  protected List<ToDoList> toDoList;

  // @Column(name = "password")
  // private String password;
  //
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

}

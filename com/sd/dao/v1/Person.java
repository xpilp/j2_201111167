package com.sd.dao.v1;

public class Person {
  private int id;
  private String name;
  public Person(int id, String name) {
    this.id = id;
    this.name = name;
  }
  
  public String getName() {
    return name;
  }
  
  public int getId() {
    return id;
  }
  
  public void setName(String name) {
    this.name = name;
  }
}
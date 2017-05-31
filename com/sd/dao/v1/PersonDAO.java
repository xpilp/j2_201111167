package com.sd.dao.v1;

import java.util.List;

public interface PersonDAO {
  public void insert(Person p);
  public List<Person> findAll();
  public Person findById(int id);
  public void update(Person p);
  public void delete(int id);
  public void delete(Person p);
}
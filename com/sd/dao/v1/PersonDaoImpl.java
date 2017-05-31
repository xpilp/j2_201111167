package com.sd.dao.v1;

import java.util.List;
import java.util.ArrayList;

public class PersonDaoImpl implements PersonDAO { 
  List<Person> persons;
  public PersonDaoImpl() {
    persons = new ArrayList<Person>();
  }
  
  public void insert(Person p) {
    persons.add(p);
  }
  
  public List<Person> findAll() {
    return persons;
  }
  
  public Person findById(int id) {
   return persons.get(id);
  }
  
  public void update(Person p) {
    persons.get(p.getId()).setName(p.getName());
  }
  
  public void delete(int id) {
    persons.remove(id);
  }
  
  public void delete(Person p) {
    persons.remove(p.getId());
  }
}
  
  
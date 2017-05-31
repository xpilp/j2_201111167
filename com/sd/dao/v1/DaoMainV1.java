package com.sd.dao.v1;

import java.util.List;

public class DaoMainV1 {
    public static void main(String[] args) {
        Person p;
        PersonDAO personDao = new PersonDaoImpl();

        p = new Person(0, "v1-1");
        personDao.insert(p);
        p = new Person(1, "v1-2");
        personDao.insert(p);

        List<Person> persons = personDao.findAll();
        
        for (Person pi:persons) {
            System.out.println(pi.getId() +", "+pi.getName());
        }

        p =personDao.findAll().get(0);
        p.setName("lcw");
        personDao.update(p);

       
        p=personDao.findById(0);
        System.out.println(p.getId() +", "+p.getName());

        personDao.delete(0);
       
        for (Person pi:persons) {
            System.out.println(pi.getId() +", "+pi.getName());
        }
   }
}
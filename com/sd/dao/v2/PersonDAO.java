package com.sd.dao.v2;

import java.util.List;

public interface PersonDAO {
    public void insert(PersonVO person);
    public List<PersonVO> findAll();
    public PersonVO findById(int id);
    public void update(PersonVO person);
    public void delete(int id);
}
package com.address_book.model;

import java.util.List;

public interface AddressDAO {
	public void insert(AddressVO address);
    public List<AddressVO> findAll();
    public AddressVO findById(int id);
    public void update(AddressVO origin,AddressVO data);
    public void delete(String phone);
    public void shutdown();
}

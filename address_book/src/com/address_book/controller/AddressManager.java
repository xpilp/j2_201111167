package com.address_book.controller;

import java.util.List;

import com.address_book.view.AddressBean;

public interface AddressManager{
	public List<AddressBean> loadAddress();
	public void addAddress(AddressBean address);
	public void deleteAddress(AddressBean address);
	public void updateAddress(AddressBean origin, AddressBean data);
	public void close();
}

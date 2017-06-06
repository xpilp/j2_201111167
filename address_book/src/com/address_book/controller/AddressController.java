package com.address_book.controller;

import java.util.ArrayList;
import java.util.List;

import com.address_book.model.AddressDAO;
import com.address_book.model.AddressDAOImpl;
import com.address_book.model.AddressVO;
import com.address_book.view.AddressBean;

public class AddressController implements AddressManager{
	private AddressDAO dao;
	
	public AddressController() {
		dao = new AddressDAOImpl();
	}
	
	public List<AddressBean> loadAddress() {
		List<AddressVO> list = dao.findAll();
		List<AddressBean> addressBook = new ArrayList<AddressBean>();
		for(AddressVO data : list){
			AddressBean bean = changeToAddressBean(data);
			addressBook.add(bean);
		}
		
		return addressBook;
	}

	public void addAddress(AddressBean address) {
		AddressVO vo = changeToAddressVO(address);
		dao.insert(vo);
		
	}

	public void deleteAddress(AddressBean address) {
		AddressVO vo = changeToAddressVO(address);
		dao.delete(vo.getPhone());
	}

	public void updateAddress(AddressBean origin, AddressBean data) {
		AddressVO vo1 = changeToAddressVO(origin);
		AddressVO vo2 = changeToAddressVO(data);
		dao.update(vo1,vo2);
	}
	
	public void close(){
		dao.shutdown();
	}

	private AddressVO changeToAddressVO(AddressBean address){
		return new AddressVO(address.getName(),address.getEmail(),address.getPhone(),address.getBelong(),address.getAddress());
	}
	
	private AddressBean changeToAddressBean(AddressVO address){
		return new AddressBean(address.getName(),address.getEmail(),address.getPhone(),address.getBelong(),address.getAddress());
	}
	
}

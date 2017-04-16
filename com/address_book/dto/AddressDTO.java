package com.address_book.dto;

public class AddressDTO {
	private String name;
	private String email;
	private String phone;
	private String belong;
	
	public AddressDTO(String name,String email,String phone,String belong){
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.belong = belong;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getBelong() {
		return belong;
	}

	public void setBelong(String belong) {
		this.belong = belong;
	}
}

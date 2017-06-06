package com.address_book.model;

public class AddressVO {
		private int id;
		private String name;
		private String email;
		private String phone;
		private String belong;
		private String address;
		
		public AddressVO(String name,String email,String phone,String belong, String address){
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.belong = belong;
			this.address = address;
		}
		
		public AddressVO(int id, String name,String email,String phone,String belong,String address){
			this.id = id;
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.belong = belong;
			this.address = address;
		}
		
		public int getId() {
			return id;
		}
		
		public void setId(int id) {
			this.id = id;
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
		
		public String getAddress() {
			return address;
		}
		
		public void setAddress(String address) {
			this.address = address;
		}
		
		public void setAddressBook(String name, String email, String phone, String belong, String address){
			this.name = name;
			this.email = email;
			this.phone = phone;
			this.belong = belong;
			this.address = address;
		}
	
}

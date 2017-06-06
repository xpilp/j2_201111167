package com.address_book.model;

import java.awt.PageAttributes.OriginType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AddressDAOImpl implements AddressDAO {
	private Connection conn;
    private PreparedStatement pstmt=null;
    private ResultSet rs=null;
	
    public AddressDAOImpl() {
    	conn = ConnectionFactory.getConnection();
    }
    
	public void insert(AddressVO address) {
		try{
			pstmt = conn.prepareStatement("insert into address_book(name, email, phone, belong, address) values(?,?,?,?,?)");
			pstmt.setString(1, address.getName());
            pstmt.setString(2, address.getEmail());
            pstmt.setString(3, address.getPhone());
            pstmt.setString(4, address.getBelong());
            pstmt.setString(5, address.getAddress());
            pstmt.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public List<AddressVO> findAll() {
		 List<AddressVO> addressBook = new ArrayList<AddressVO>();
	        try {
	            pstmt = conn.prepareStatement("SELECT * FROM address_book");
	            rs = pstmt.executeQuery();
	            AddressVO vo = null;
	            while(rs.next()){
	                int id = Integer.parseInt(rs.getString("id"));
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String phone = rs.getString("phone");
	                String belong = rs.getString("belong");
	                String address = rs.getString("address");
	                vo = new AddressVO(id,name,email,phone,belong,address);
	                addressBook.add(vo);
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        } 
	        return addressBook;
	}

	public AddressVO findById(int id) {
		AddressVO vo = null;
		
		try{
			pstmt = conn.prepareStatement("select * from address_book where id = "+id);
			rs = pstmt.executeQuery();
			if(rs != null){
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String belong = rs.getString("belong");
                String address = rs.getString("address");
                vo = new AddressVO(id,name,email,phone,belong,address);
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return vo;
	}

	public void update(AddressVO origin, AddressVO data) {
		try{
			pstmt = conn.prepareStatement("update address_book set name=?,email=?,phone=?,belong=?,address=? where phone='"+origin.getPhone()+"'");
			pstmt.setString(1, data.getName());
			pstmt.setString(2, data.getEmail());
			pstmt.setString(3, data.getPhone());
			pstmt.setString(4, data.getBelong());
			pstmt.setString(5, data.getAddress());
			pstmt.executeUpdate();
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void delete(String phone) {
		try{
			pstmt = conn.prepareStatement("delete from address_book where phone = '"+phone+"'");
			int rows=pstmt.executeUpdate();
		    if (rows == 0) {  
			System.out.println("!can not delete..."+phone+" does not exist!");
		    } else if (rows > 0) {  
			System.out.println("* deleting..."+phone);
		    }
		}catch(SQLException  e){
			e.printStackTrace();
		}
	}
	
	public void shutdown() {
		close();
	}
	
	public void close() {
	     	System.out.println("* closing all...");
	        try {
	            if (rs != null) rs.close();
	            if (pstmt != null) pstmt.close();
	            if (conn != null) conn.close();
	        } catch (Exception e) {
		    e.printStackTrace();
		}
	}

}

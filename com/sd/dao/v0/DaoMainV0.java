package com.sd.dao.v0;
import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;

public class DaoMainV0 {
    public static void main (String[] args){
        Connection conn=null;
        ResultSet rs=null;
        Statement stmt=null;
        try {
            String path = System.getProperty("user.dir");
            path += "/src/mysql.properties";
            Properties prop = new Properties();
            prop.load(new FileInputStream(path));
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(
                prop.getProperty("URL")+"?useSSL=true",
                prop.getProperty("USER"),
                prop.getProperty("PASSWORD")
            );
//          String mySql="CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
//          mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
            stmt=conn.createStatement();
//          stmt.execute(mySql);       
            stmt.execute("INSERT INTO persons(name,address) VALUES('v0-4','4 Hongji Dong')");
            stmt.execute("DELETE FROM persons WHERE id=3 LIMIT 1");

            rs=stmt.executeQuery("SELECT name FROM persons WHERE id < 4 ORDER BY id");
            while (rs.next()) {
                System.out.println(rs.getString("name"));
            }
           
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                if(rs != null) rs.close();
            } catch (Exception e) {};
            try {
                if(stmt != null) stmt.close();
            } catch (Exception e) {};
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {};
        }
    }
}
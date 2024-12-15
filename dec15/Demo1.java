package com.jbk.dec15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo1 {
	public void insert() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		PreparedStatement ps = c.prepareStatement("insert into student values(? ,?, ?)");
		ps.setInt(1, 5);
		ps.setString(2, "Adarsh");
		ps.setInt(3, 27);
		ps.executeUpdate();
		System.out.println("Data Inserted Successfully...");
		c.close();
		
	}
	public void update() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		PreparedStatement ps = c.prepareStatement("update student set name =? where id =?");
		ps.setString(1, "Riya");
		ps.setInt(2, 5);
		ps.executeUpdate();
		System.out.println("Data Updated Successfully.....");
		c.close();
	}
	public void  delete() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		PreparedStatement ps = c.prepareStatement("delete from student where id =?");
		ps.setInt(1, 5);
		ps.executeUpdate();
		System.out.println("Data Deleted Successfully...");
		c.close();
	}
	public void fetchData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		PreparedStatement ps = c.prepareStatement("select * from student");
		ResultSet rs = ps.executeQuery();
		System.out.println("Data fetched Successfully...");
		while(rs.next()){
			System.out.println(" id = " + rs.getInt(1)+ "  name = " + rs.getString(2)+ "  age = " + rs.getInt(3));
		}
		c.close();
	}
	public static void main(String[] args) throws Exception{
		Demo1 d1 = new Demo1();
		//d1.insert();
		//d1.update();
		//d1.delete();
		d1.fetchData();
	}

}

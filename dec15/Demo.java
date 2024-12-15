package com.jbk.dec15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
	public void createTable() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		Statement st = c.createStatement();
		st.execute("create table student (id int primary key, name varchar(30), age int)");
		c.close();
		System.out.println("Table Created Successfully.....");
	}
	public void insert() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		Statement st = c.createStatement();
		st.executeUpdate("insert into student values(5, 'Pappe', 18)");
		c.close();
		System.out.println("Data Inserted Successfully...");
	}
	public void update() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		Statement st = c.createStatement();
		st.executeUpdate("update student set name ='Arun' where id = 5");
		c.close();
		System.out.println("Data Updated Successfully....");
	}
	public void delete() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		Statement st = c.createStatement();
		st.executeUpdate("delete from student where id= 5");
		c.close();
		System.out.println("Data deleted Successfully....");
	}
	public void fetchData() throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197","root","root");
		Statement st = c.createStatement();
		ResultSet rs = st.executeQuery("select * from student");
		System.out.println("Data fetched Successfully....");
		while(rs.next()) {
			System.out.println("id = " + rs.getInt(1)+ "  name = " + rs.getString(2)+ "  age = " + rs.getInt(3) );
		}
	}
	public static void main(String[] args) throws Exception {
		Demo d = new Demo();
		//d.createTable();
		//d.insert();
		//d.update();
		//d.delete();
		d.fetchData();
	}
}

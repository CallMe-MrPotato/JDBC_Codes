package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class EmployeeDao {
	public void createTable() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197)","root","root");
		Statement s = c.createStatement();
		s.execute("create table employees (id int primary key, name varchar(30), salary int)");
		System.out.println("Create Table successfully....");
		c.close();
	}

	public void insertData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("insert into employees values(1, 'viraj', 50000)");
		System.out.println("Data inserted Successfully...");
		c.close();
	}

	public void updateData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197)", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("update employees set name= 'Mohit' where id = 1");
		System.out.println("data updated Successfully...");
		c.close();
	}

	public void deleteData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197)", "root", "root");
		Statement s = c.createStatement();
		s.executeUpdate("delete from employees where id = 1");
		System.out.println("data Deleted Successfully....");
		c.close();
	}

	public void fetchData() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_197)", "root", "root");
		Statement s = c.createStatement();
		ResultSet rs = s.executeQuery("select * from employees");
		System.out.println("Data fetched Successfully...");
		while (rs.next()) {
			System.out.println("id = " + rs.getInt(1) + "  name = " + rs.getString(2) + "  salary = " + rs.getInt(3));
			c.close();
		}
	}

}

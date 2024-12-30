package com.jbk.dec29;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String Name;
	private int Age;
	private String Address;
	private long Mobile; 
	
	public Student() {
		
	}

	public Student(int id, String name, int age, String address, long mobile) {
		super();
		this.id = id;
		this.Name = name;
		this.Age = age;
		this.Address = address;
		this.Mobile = mobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		this.Mobile = mobile;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", Name=" + Name + ", Age=" + Age + ", Address=" + Address + ", Mobile=" + Mobile
				+ "]";
	}
	
	
}

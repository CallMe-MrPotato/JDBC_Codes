package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Hospital {
	@Id
	private String Pname;
	private int Age;
	private String Gender;
	private long mobile;
	private long  Pid;
	
	public Hospital() {
		
	}

	public Hospital(String pname, int age, String gender, long mobile, long pid) {
		super();
		this.Pname = pname;
		this.Age = age;
		this.Gender = gender;
		this.mobile = mobile;
		Pid = pid;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		this.Pname = pname;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		this.Gender = gender;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public long getPid() {
		return Pid;
	}

	public void setPid(long pid) {
		this.Pid = pid;
	}

	@Override
	public String toString() {
		return "Hospital [Pname=" + Pname + ", Age=" + Age + ", Gender=" + Gender + ", mobile=" + mobile + ", Pid="
				+ Pid + "]";
	}
	
}

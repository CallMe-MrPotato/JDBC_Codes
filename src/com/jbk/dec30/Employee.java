package com.jbk.dec30;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int Eid;
	private String Ename;
	private long Mobile;
	private String CompanyName;
	private double Salary;
	
	public Employee() {
		
	}

	public Employee(int eid, String ename, long mobile, String companyName, double salary) {
		super();
		this.Eid = eid;
		this.Ename = ename;
		this.Mobile = mobile;
		this.CompanyName = companyName;
		this.Salary = salary;
	}

	public int getEid() {
		return Eid;
	}

	public void setEid(int eid) {
		this.Eid = eid;
	}

	public String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		this.Ename = ename;
	}

	public long getMobile() {
		return Mobile;
	}

	public void setMobile(long mobile) {
		this.Mobile = mobile;
	}

	public String getCompanyName() {
		return CompanyName;
	}

	public void setCompanyName(String companyName) {
		this.CompanyName = companyName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		this.Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", Mobile=" + Mobile + ", CompanyName=" + CompanyName
				+ ", Salary=" + Salary + "]";
	}
	
}

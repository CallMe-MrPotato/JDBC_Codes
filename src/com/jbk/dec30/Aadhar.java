package com.jbk.dec30;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	@Id
	private String Aname;
	private long Anumber;
	private String Address;
	private long mobile;
	
	public Aadhar() {
		
	}

	public Aadhar(String aname, long anumber, String address, long mobile) {
		super();
		this.Aname = aname;
		this.Anumber = anumber;
		this.Address = address;
		this.mobile = mobile;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		this.Aname = aname;
	}

	public long getAnumber() {
		return Anumber;
	}

	public void setAnumber(long anumber) {
		this.Anumber = anumber;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		this.Address = address;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Aadhar [Aname=" + Aname + ", Anumber=" + Anumber + ", Address=" + Address + ", mobile=" + mobile + "]";
	}
	

}

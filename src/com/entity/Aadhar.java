package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Aid;
	private String Aname;
	private String Address;
	private long Anumber;
	
	public Aadhar() {
		
	}

	public Aadhar(int aid, String aname, String address, long anumber) {
		super();
		Aid = aid;
		Aname = aname;
		Address = address;
		Anumber = anumber;
	}

	public int getAid() {
		return Aid;
	}

	public void setAid(int aid) {
		Aid = aid;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public long getAnumber() {
		return Anumber;
	}

	public void setAnumber(long anumber) {
		Anumber = anumber;
	}

	@Override
	public String toString() {
		return "Aadhar [Aid=" + Aid + ", Aname=" + Aname + ", Address=" + Address + ", Anumber=" + Anumber + "]";
	}
	
}

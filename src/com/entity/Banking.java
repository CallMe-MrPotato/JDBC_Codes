package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Banking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Bid;
	private String Bname;
	private String Branch;
	private String AccHolder;
	
	public Banking() {
		
	}

	public Banking(int bid, String bname, String branch, String accHolder) {
		super();
		Bid = bid;
		Bname = bname;
		Branch = branch;
		AccHolder = accHolder;
	}

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public String getBname() {
		return Bname;
	}

	public void setBname(String bname) {
		Bname = bname;
	}

	public String getBranch() {
		return Branch;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getAccHolder() {
		return AccHolder;
	}

	public void setAccHolder(String accHolder) {
		AccHolder = accHolder;
	}

	@Override
	public String toString() {
		return "Banking [Bid=" + Bid + ", Bname=" + Bname + ", Branch=" + Branch + ", AccHolder=" + AccHolder + "]";
	}
	

}

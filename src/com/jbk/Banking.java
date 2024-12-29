package com.jbk;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Banking {
	@Id
	private String name;
	private long AccountNo;
	private String Bankname;
	private String IFSC;
	private String branch;
	
	public Banking() {
		
	}

	public Banking(String name, long accountNo, String bankname, String iFSC, String branch) {
		super();
		this.name = name;
		this.AccountNo = accountNo;
		this.Bankname = bankname;
		this.IFSC = iFSC;
		this.branch = branch;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNo() {
		return AccountNo;
	}

	public void setAccountNo(long accountNo) {
		this.AccountNo = accountNo;
	}

	public String getBankname() {
		return Bankname;
	}

	public void setBankname(String bankname) {
		this.Bankname = bankname;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		this.IFSC = iFSC;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Banking [name=" + name + ", AccountNo=" + AccountNo + ", Bankname=" + Bankname + ", IFSC=" + IFSC
				+ ", branch=" + branch + "]";
	}
	
}

package com.ntuc.datajpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	private int custid;
	private String custname;
	private String location;
	
	public Customers() {
		super();
	}

	public Customers(int custid, String custname, String location) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.location = location;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customers [custid=" + custid + ", custname=" + custname + ", location=" + location + "]";
	}

}

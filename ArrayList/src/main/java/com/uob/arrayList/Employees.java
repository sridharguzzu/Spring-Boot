package com.uob.arrayList;

public class Employees {
	private int eid;
	private String ename;
	private int sal;
	
	public Employees(int eid, String ename, int sal) {
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
	}

	public int getEid() {
		return eid; 
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}

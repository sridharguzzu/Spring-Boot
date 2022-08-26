package com.ntuc.crud;

public class Employees {

	private String name;
	private int id;
	private String dept;
	private double sal;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employees [name=" + name + ", id=" + id + ", dept=" + dept + ", sal=" + sal + "]";
	}
	public Employees(String name, int id, String dept, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.sal = sal;
	}
	
	
}

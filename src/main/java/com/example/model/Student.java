package com.example.model;

public class Student {
	private int id;

	public Student() {

		// TODO Auto-generated constructor stub
	}

	public Student(int id, String fName, String lname, String address) {
		super();
		this.id = id;
		this.fName = fName;
		this.lname = lname;
		this.address = address;
	}

	private String fName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	private String lname;
	private String address;
}

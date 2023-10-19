package com.cg.entity;

public class Supplier {
	
	private String sname;
	private int sid;
	private String location;
	
	Supplier(){}

	public Supplier(String sname, int sid, String location) {
		super();
		this.sname = sname;
		this.sid = sid;
		this.location = location;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Supplier [sname=" + sname + ", sid=" + sid + ", location=" + location + "]";
	}
	

}

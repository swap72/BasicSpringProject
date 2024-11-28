package org.sample;

public class Student {
	private String name;
	private long ph;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPh() {
		return ph;
	}
	public void setPh(long ph) {
		this.ph = ph;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ph=" + ph + ", id=" + id + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}

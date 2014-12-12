package com.michael.suitmedia;

public class Data {
	private String id;
	private String firstName;
	private String dob;
		
	public Data(String id,String fn,String dob){
		this.id = id;
		firstName = fn;
		this.dob = dob;
	}
	public String getid() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getdob() {
		return dob;
	}
}

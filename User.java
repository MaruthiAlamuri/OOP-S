package com.oop;

public class User {
	private String name;
	private String address;
	public User() {
		getUserDetails();
	}
	public User(String nm,String ad) {
		this.name = nm;
		this.address = ad;
	}
	
	public void getUserDetails(){
		System.out.println(name +" "+ address);
	}

}

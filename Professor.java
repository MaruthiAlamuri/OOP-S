package com.oop;

public class Professor {
	String name;
	String subject;
	
	Professor(String nm, String sub){
		this.name = nm;
		this.subject = sub;
	}
	
	void teach() {
		System.out.println("I am Professor"+" "+"I teach"+" "+subject);
	}
	
	

}

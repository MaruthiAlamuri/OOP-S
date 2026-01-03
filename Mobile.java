package com.oop;

public class Mobile extends Device{
	String simType;
	String phoneNumber;

	void call() {
		System.out.println("Calling from number: " + phoneNumber);
	}

}

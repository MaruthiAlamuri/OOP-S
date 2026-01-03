package com.oop;

public class Device {

	String brand;
	boolean powerStatus;

	void powerOn() {
		powerStatus = true;
		System.out.println("Device powered on");
	}

}

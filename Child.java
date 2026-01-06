package com.oop;

public  class Child extends Parentt{
   
	public void marry(){
		System.out.println("Boy");
	}
	
	@Override
	public void place() {
		System.out.println("Hyd");
	}
	
	public static void main(String[] args) {
		Parentt parent = new Child();
		parent.marry();
	}
	
}

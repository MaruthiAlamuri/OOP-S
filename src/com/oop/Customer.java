package com.oop;
/* What is Encapsulation?
 * ----------------------
 *  - Encapsulation = Data hiding + Behavior + Protection.
 */
public class Customer {

	private String name; // hidden data
	private int age;

	public void setAge(int age) {
		if (age > 0) { // rule enforced
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}
}

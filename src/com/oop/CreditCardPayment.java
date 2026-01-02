package com.oop;

public class CreditCardPayment implements Payment {

	@Override
	public void pay(double amount) {
		System.out.println("Paid using credit card");
	}

}

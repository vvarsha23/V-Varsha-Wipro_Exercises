package com.wipro.day6;

public class GooglePay implements PaymentGateway {

	@Override
	public void pay(double amount) {
		// TODO Auto-generated method stub
		 System.out.println("Paid ₹" + amount + " using Google Pay");

	}

}

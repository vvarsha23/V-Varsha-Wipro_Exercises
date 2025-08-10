package com.wipro.oop.test;

public class HDFC implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		System.out.println("This is Hdfc bank");
		// TODO Auto-generated method stub

	}

	@Override
	public double withdraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		return amount;
	}

}

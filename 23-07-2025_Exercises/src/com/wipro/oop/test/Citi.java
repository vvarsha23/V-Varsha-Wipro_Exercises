package com.wipro.oop.test;

public class Citi implements BankOps {

	@Override
	public void deposit(double amount, String accNumber) {
		System.out.println("This is a City bank");
		// TODO Auto-generated method stub

	}

	@Override
	public double withdraw(double amount, String accNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

}

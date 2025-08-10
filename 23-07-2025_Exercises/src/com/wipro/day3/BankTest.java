package com.wipro.day3;
import com.wipro.oop.test.*;

public class BankTest {
	public static void main(String[] args) {
		BankOps hdfc = new HDFC();
		hdfc.deposit(86878,"87guyt6");
		hdfc.withdraw(100, "87guyt6");
		Citi citi = new Citi();
		citi.deposit(89647,"8975uggv");
		citi.withdraw(200,"8975uggv");
		System.out.println(hdfc);
		System.out.println(citi);
		
		
	}

}

package com.wipro.basics;

public class exercise7 {
	public static void main(String[] args) {
		float num1=25.586f;
		float num2=25.589f;
		float numr1=Math.round(num1*1000);
		float numr2=Math.round(num2*1000);
		if(numr1==numr2) {
			System.out.println("they are same");
		}
		else {
			System.out.println("they are different");
		}
	}

}

package com.wipro.basics;

public class Confitional2 {
	public static void main(String[] args) {
		float num=-5;
		float absvalue=Math.round(num);
		if(num==0) {
			System.out.println("Zero");
		}
		else if(num<0) {
			System.out.println("Negetive");
		}
		else{
			System.out.println("positive");
		}
		if(absvalue<1) {
			System.out.println("small");
		}
		else if(absvalue>1000000) {
			System.out.println("large");
		}
		else {
			System.out.println("nothing");
		}
		
		
	}

}

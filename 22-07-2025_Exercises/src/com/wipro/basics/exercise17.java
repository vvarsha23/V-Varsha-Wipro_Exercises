package com.wipro.basics;

public class exercise17 {
	public static void main(String[] args) {
		enum Month{
			JAN,
			FEB,
			MAR,
			APL,
			MAY,
			JUN,
			JUL,
			AUG,
			SEP,
			OCT,
			NOV,
			DEC
		}
		for(Month m:Month.values()) {
			System.out.println(m);
		}
	}

}

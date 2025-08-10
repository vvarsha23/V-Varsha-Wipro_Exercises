package com.wipro.Day5;

public class LambdaMultiply {
	public static void main(String[] args) {
		Functional multiply = (a,b) -> {return a*b;};
		int result = multiply.intmultiply(5, 4);
		System.out.println(result);
	}

}

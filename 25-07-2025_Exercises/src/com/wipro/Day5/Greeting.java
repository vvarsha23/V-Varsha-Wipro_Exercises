package com.wipro.Day5;

public class Greeting {
	public static void main(String[] args) {
		LambdaExample greet = () -> {System.out.println("Hello Lambda");};
		greet.sayHello();
		
	}

}

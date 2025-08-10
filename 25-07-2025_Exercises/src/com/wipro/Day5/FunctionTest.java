package com.wipro.Day5;
import java.util.function.Function;

public class FunctionTest {
	public static void main(String[] args) {
		double input = 123.45;
		Function<Double, Double> getFractionalPart = num -> num - Math.floor(num);
		double fractional = getFractionalPart.apply(input);
        System.out.println("Fractional part: %.2f%n " + fractional);
		
	}

}

package com.wipro.day3;
import com.wipro.oop.test.*;

public class TestConverter {
	public static void main(String[] args) {
		Converter converter = new Converter();
		int square = converter.convert(5);
		System.out.println(square);
		int sum = converter.convert(5,10);
		System.out.println(sum);
		double half = converter.convert(20.0);
		System.out.println(half);
				
	}
	

}

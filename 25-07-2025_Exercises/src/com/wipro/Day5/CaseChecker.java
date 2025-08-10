package com.wipro.Day5;

import java.util.function.Predicate;

public class CaseChecker {
	public static void main(String[] args) {
		String input = "Hello";
		Predicate<String> isUpper = str -> str.equals(str.toUpperCase());
		Predicate<String> isLower = str -> str.equals(str.toLowerCase());
		if (isUpper.test(input)) {
            System.out.println("The string is in UPPERCASE.");
        } else if (isLower.test(input)) {
            System.out.println("The string is in lowercase.");
        } else {
            System.out.println("The string is a mix of uppercase and lowercase.");
        }
	}

}

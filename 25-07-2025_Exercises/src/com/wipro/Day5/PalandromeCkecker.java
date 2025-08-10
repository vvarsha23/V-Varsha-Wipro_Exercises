package com.wipro.Day5;

import java.util.Scanner;
import java.util.function.Predicate;

public class PalandromeCkecker {
	public static void main(String[] args) {
        // Define Predicate to check if a string is a palindrome
        Predicate<String> isPalindrome = str -> {
            String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            String reversed = new StringBuilder(cleaned).reverse().toString();
            return cleaned.equals(reversed);
        };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();

        // Check and print result
        if (isPalindrome.test(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
        scanner.close();
    }

        


}

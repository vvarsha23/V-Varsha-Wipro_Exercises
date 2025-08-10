package com.wipro.oop.test;

public class Exceptionhandling {
	public static void main(String[] args) {
		String fName = null;
		try {
            String upperName = fName.toUpperCase();
            System.out.println("Uppercase name: " + upperName);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: fName is null");
        }

        System.out.println("Program continues after exception handling.");
    }
}
	


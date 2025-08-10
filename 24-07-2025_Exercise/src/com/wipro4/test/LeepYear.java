package com.wipro4.test;
import java.time.LocalDate;
public class LeepYear {
	public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 2, 29);  // Change this as needed

        int year = date.getYear();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
    }
	public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}

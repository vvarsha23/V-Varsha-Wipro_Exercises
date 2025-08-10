package com.wipro4.test;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class Agecalculator {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input birthdate
        System.out.print("Enter your birth year (yyyy): ");
        int year = scanner.nextInt();

        System.out.print("Enter your birth month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter your birth day (1-31): ");
        int day = scanner.nextInt();

        LocalDate birthDate;
        try {
            birthDate = LocalDate.of(year, month, day);
            int age = getAge(birthDate);
            System.out.println("You are " + age + " years old.");
        } catch (RuntimeException e) {
            System.out.println("Invalid date entered.");
        }

        scanner.close();
    }
	public static int getAge(LocalDate dt) {
        LocalDate currentDate = LocalDate.now();
        if (dt.isAfter(currentDate)) {
            throw new IllegalArgumentException("Birthdate cannot be in the future.");
        }
        return Period.between(dt, currentDate).getYears();
    }

}

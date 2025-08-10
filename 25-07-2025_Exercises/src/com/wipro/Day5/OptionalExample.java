package com.wipro.Day5;

import java.util.Optional;

public class OptionalExample {
	public static void main(String[] args) {
        Optional<Integer> optionalInt = Optional.of(42);
        optionalInt.ifPresent(value -> System.out.println("Value is: " + value));
        Optional<String> optionalString = Optional.empty();
        String result = optionalString.orElse("Default Value");
        System.out.println("String result: " + result);
    }

}

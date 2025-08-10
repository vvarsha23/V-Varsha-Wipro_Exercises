package com.wipro.Day5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LengthOfString {
	public static void main(String[] args) {
		List<String> input = List.of("Wipro", "Training", "Day5");
		Function<List<String>, List<Integer>> getLengths = list -> {
            List<Integer> lengths = new ArrayList<>();
            for (String s : list) {
                lengths.add(s.length());
            }
            return lengths;
        };
        System.out.println(getLengths.apply(input));
	}

}

package com.wipro.basics;

public class Exercise22 {
	public static void main(String[] args) {
		String str = "anagram phrase formed rearranging letters different phrase";
		String[] words = str.split(" ");
		String shortestWord = words[0];
		for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }
        System.out.println("Shortest word: " + shortestWord);
    }
}

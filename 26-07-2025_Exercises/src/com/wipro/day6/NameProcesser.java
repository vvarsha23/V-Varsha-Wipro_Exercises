package com.wipro.day6;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class NameProcesser {
	public static void main(String[] args) {
		List<String> names = new CopyOnWriteArrayList<>(
                Arrays.asList("Amit", "Jayanta", "Esha", "Uday", "Ravi", "Irene", "Nikhil", "Om")
        );
		Thread vowelThread = new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if (startsWithVowel(name)) {
                    names.set(i, name.toUpperCase());
                }
            }
        });
		Thread nonVowelThread = new Thread(() -> {
            for (int i = 0; i < names.size(); i++) {
                String name = names.get(i);
                if (!startsWithVowel(name)) {
                    names.set(i, name.toLowerCase());
                }
            }
        });
		vowelThread.start();
        nonVowelThread.start();
        try {
            vowelThread.join();
            nonVowelThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final List: " + names);
    }
	private static boolean startsWithVowel(String name) {
        if (name == null || name.isEmpty()) return false;
        char firstChar = Character.toLowerCase(name.charAt(0));
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' ||
               firstChar == 'o' || firstChar == 'u';
    }
}


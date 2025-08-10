package com.wipro.day6;

public class ThreadExample {
	public static void main(String[] args) {
		Thread numberThread = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Number: " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
		Thread alphabetThread = new Thread(() -> {
            for (char ch = 'A'; ch <= 'J'; ch++) {
                System.out.println("Alphabet: " + ch);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        numberThread.start();
        alphabetThread.start();
	}

}

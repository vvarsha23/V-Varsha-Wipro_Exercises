package com.wipro4.test;

import java.util.HashSet;
import java.util.Set;

public class SetDifference {
	public static void main(String[] args) {
		 Set<Integer> set1 = new HashSet<>();
	        set1.add(1);
	        set1.add(2);
	        set1.add(3);
	        set1.add(4);
	        set1.add(5);
	        
	     Set<Integer> set2 = new HashSet<>();
	        set2.add(3);
	        set2.add(4);
	        set2.add(6);
	     Set<Integer> difference = new HashSet<>(set1);
	        difference.removeAll(set2);
	        System.out.println("Set 1: " + set1);
	        System.out.println("Set 2: " + set2);
	        System.out.println("Difference (Set1 - Set2): " + difference);
	}

}

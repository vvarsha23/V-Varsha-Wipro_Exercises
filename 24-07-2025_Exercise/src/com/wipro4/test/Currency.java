package com.wipro4.test;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Currency {
	public static void main(String[] args) {
	Map<String, String> currencyMap = new HashMap<>();
    currencyMap.put("USD", "United States Dollar");
    currencyMap.put("EUR", "Euro");
    currencyMap.put("JPY", "Japanese Yen");
    currencyMap.put("GBP", "British Pound");
    currencyMap.put("INR", "Indian Rupee");
	
    List<Map.Entry<String, String>> entryList = new ArrayList<>(currencyMap.entrySet());
    entryList.sort(Map.Entry.comparingByValue());
    for (Map.Entry<String, String> entry : entryList) {
        System.out.println(entry.getKey() + " - " + entry.getValue());
    }
	}
}

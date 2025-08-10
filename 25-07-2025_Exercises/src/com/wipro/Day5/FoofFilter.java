package com.wipro.Day5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FoofFilter {
	public static void main(String[] args) {
		List<FoodItems> foodList = Arrays.asList(
	            new FoodItems("Spring Rolls", "Veg", "Chinese", 5.99),
	            new FoodItems("Pad Thai", "Veg", "Thai", 7.99),
	            new FoodItems("Kung Pao Chicken", "Non Veg", "Chinese", 8.99),
	            new FoodItems("Pasta Alfredo", "Veg", "Continental", 6.99),
	            new FoodItems("Sweet and Sour Pork", "Non Veg", "Chinese", 9.49)
	        );
		List<FoodItems> chineseFoods = foodList.stream()
	            .filter(item -> item.getCuisine().equalsIgnoreCase("Chinese"))
	            .collect(Collectors.toList());
	        System.out.println("Chinese Food Items:");
	        chineseFoods.forEach(item -> System.out.println(item));
	        
	        List<FoodItems> ExpensivechineseFoods = foodList.stream()
	                .filter(item -> item.getCuisine().equalsIgnoreCase("Chinese"))
	                .collect(Collectors.toList());

	            if (chineseFoods.isEmpty()) {
	                System.out.println("No Chinese dishes found.");
	            } else {
	                FoodItems mostExpensive = ExpensivechineseFoods.get(0);
	                for (FoodItems item : ExpensivechineseFoods) {
	                    if (item.getPrice() > mostExpensive.getPrice()) {
	                        mostExpensive = item;
	                    }
	                }
	                System.out.println("Most Expensive Chinese Dish:");
	                System.out.println(mostExpensive);
	            }
	}

}

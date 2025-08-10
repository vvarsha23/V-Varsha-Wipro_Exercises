package com.wipro.day3;
import com.wipro.oop.test.*;
public class TestAnimals {
	public static void main(String[] args) {
		Animal[] animals = {
	            new Human("Alice", 30),
	            new Bird("Tweety", 2),
	            new Dog("Buddy", 5)
	        };

	        for (Animal animal : animals) {
	            System.out.println(animal.getName() + " (" + animal.getClass().getSimpleName() + ") - Age: " + animal.getAge());
	            System.out.println(animal.speak());
	            System.out.println(animal.move());
	            System.out.println("--------------------------------");
	        }
	}

}

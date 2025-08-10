package com.wipro.oop.test;

public class Dog extends Animal {

	public Dog(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return name+"barks";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return name+"runs";
	}

}

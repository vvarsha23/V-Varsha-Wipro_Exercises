package com.wipro.oop.test;

public class Bird extends Animal {

	public Bird(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return name+"chirps";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return name+"flies";
	}

}

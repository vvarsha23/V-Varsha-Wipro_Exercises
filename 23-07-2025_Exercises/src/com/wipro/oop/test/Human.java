package com.wipro.oop.test;

public class Human extends Animal {

	public Human(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String speak() {
		// TODO Auto-generated method stub
		return name+"says:hello";
	}

	@Override
	public String move() {
		// TODO Auto-generated method stub
		return name+"walks";
	}

}

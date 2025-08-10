package com.wipro4.test;

public class GenDemoTest {
public static void main(String[] args) {
		
		GenDemo<Integer> demo2= new GenDemo<Integer>(1);
		GenDemo<String> demo1= new GenDemo<String>("1");
		System.out.println(demo1.getData());
	}

}

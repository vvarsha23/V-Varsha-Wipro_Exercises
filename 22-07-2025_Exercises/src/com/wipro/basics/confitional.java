package com.wipro.basics;

public class confitional {
	public static void main(String[] args) {
		char shape = 'c';
//		if(shape=='R') {
//			System.out.println("Rectangle");
//		}
//		else if(shape=='c') {
//			System.out.println("Circle");
//		}
//		else if(shape=='S') {
//			System.out.println("Square");
//		}
//		else {
		//	System.out.println("not defined");
//		}
		switch(shape) {
		case 'R':
			System.out.println("Rectangle");
			break;
		case 'c':
			System.out.println("circle");
			break;
		default:
			System.out.println("unknown");
			break;
		}
	}

}

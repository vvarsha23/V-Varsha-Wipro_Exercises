package com.wipro4.test;

public class Box <T>{
	public T item;
    public void set(T item) {
        this.item = item;
    }
    public T get() {
        return item;
    }

}
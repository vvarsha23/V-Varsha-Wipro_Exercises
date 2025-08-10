package com.wipro.oop.test;

public class Restaurant {
	String name;
    String address;
    String cuisineType;
    boolean isOpen;
    
    public Restaurant(String name, String address, String cuisineType, boolean isOpen) {
        this.name = name;
        this.address = address;
        this.cuisineType = cuisineType;
        this.isOpen = isOpen;
    }
    public String getName() {
    	return name;
    	
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCuisineType() {
        return cuisineType;
    }
    public void setCuisineType(String cuisineType) {
        this.cuisineType = cuisineType;
    }
    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
}

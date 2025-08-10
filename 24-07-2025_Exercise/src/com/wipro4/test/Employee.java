package com.wipro4.test;

public class Employee {
	String empId;
    String empName;
    int empAge;
    double empSalary;
	public Employee(String empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	public double getSalary() {
        return empSalary;
    }
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
	

}

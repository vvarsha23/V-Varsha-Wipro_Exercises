package com.wipro4.test;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import java.util.List;
public class EmployeeTest {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E001", "Alice", 30, 75000));
        employees.add(new Employee("E002", "Bob", 25, 50000));
        employees.add(new Employee("E003", "Charlie", 28, 60000));
        employees.add(new Employee("E004", "Diana", 35, 85000));
//        for (int i = 0; i < employees.size() - 1; i++) {
//            for (int j = 0; j < employees.size() - i - 1; j++) {
//                if (employees.get(j).empSalary < employees.get(j + 1).empSalary) {
//                    Employee temp = employees.get(j);
//                    employees.set(j, employees.get(j + 1));
//                    employees.set(j + 1, temp);
//                }
//            }
//        }
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
//        System.out.println("Before removal:");
//        employees.forEach(System.out::println);
//
//        for (Employee emp : employees) {
//            if (emp.getSalary() > 80000) {
//                employees.remove(emp);
//            }
//        }
//
//        System.out.println("\nAfter removal of employees earning > 80000:");
//        for (Employee emp : employees) {
//            System.out.println(emp);
//        }
        employees.sort((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        // Print sorted list
        for (Employee emp : employees) {
            System.out.println(emp);
        }
	}

}

package com.wipro.Employee.service;
import java.util.List;

import com.wipro.Employee.model.Employee;
public interface EmployeeService {
	Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
    List<Employee> getAllEmployees();
    Employee updateEmployee(Long id, Employee employee);
    void deleteEmployee(Long id);

}

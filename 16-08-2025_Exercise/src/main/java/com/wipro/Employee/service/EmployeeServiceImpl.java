package com.wipro.Employee.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Employee.model.Employee;
import com.wipro.Employee.repository.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
    private EmployeeRepository employeeRepo;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepo.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        Employee existing = employeeRepo.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(employee.getName());
            existing.setSalary(employee.getSalary());
            existing.setAddress(employee.getAddress());
            existing.setDepartment(employee.getDepartment());
            return employeeRepo.save(existing);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepo.deleteById(id);
    }

}

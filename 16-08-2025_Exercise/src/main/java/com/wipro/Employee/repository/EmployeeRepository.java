package com.wipro.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

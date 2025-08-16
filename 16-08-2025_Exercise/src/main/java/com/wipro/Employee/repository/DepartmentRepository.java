package com.wipro.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Employee.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}

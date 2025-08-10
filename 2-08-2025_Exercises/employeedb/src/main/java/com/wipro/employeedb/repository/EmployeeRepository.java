package com.wipro.employeedb.repository;
import com.wipro.employeedb.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

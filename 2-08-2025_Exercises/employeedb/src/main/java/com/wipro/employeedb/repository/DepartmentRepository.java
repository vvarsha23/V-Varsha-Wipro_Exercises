package com.wipro.employeedb.repository;
import com.wipro.employeedb.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepository extends JpaRepository<Department, Long>{

}

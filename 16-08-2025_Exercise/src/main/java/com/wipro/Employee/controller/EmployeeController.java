package com.wipro.Employee.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.wipro.Employee.model.Address;
import com.wipro.Employee.model.Department;
import com.wipro.Employee.model.Employee;
import com.wipro.Employee.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
    private EmployeeService employeeService;

    @GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAllEmployees());
        return "employee-list";
    }

    @GetMapping("/new")
    public String showForm(Model model) {
    	Employee e = new Employee();
        e.setAddress(new Address());
        e.setDepartment(new Department());
        model.addAttribute("employee", e);
        return "employee-form";
    }

    @PostMapping
    public String addEmployee(@ModelAttribute Employee employee) {
    	System.out.println(">>> Inside addEmployee: " + employee.getName());
        employeeService.saveEmployee(employee);
        return "redirect:/employees/list";

    }

    @GetMapping("/edit/{id}")
    public String editEmployee(@PathVariable Long id, Model model) {
    	Employee e = employeeService.getEmployeeById(id);

        if (e.getAddress() == null) e.setAddress(new Address());
        if (e.getDepartment() == null) e.setDepartment(new Department());

        model.addAttribute("employee", e);
        return "employee-form";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id, @ModelAttribute Employee employee) {
        employeeService.updateEmployee(id, employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
        return "redirect:/employees/list";
    }
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }


}

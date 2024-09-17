package com.cgi.springJDBC.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.springJDBC.model.Employee;
import com.cgi.springJDBC.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	// Create Employee
	@PostMapping
	public String createEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		return "Employee created successfully!";
	}
	
	// Get Employee by ID
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.findById(id);
	}
	
	// Update Employee
	@PutMapping("/{id}")
	public String updateEmployee(
			@PathVariable Long id,
			@RequestBody Employee employee
			) {
		employee.setId(id);
		employeeService.update(employee);
		return "Employee updated successfully!";
	}
	
	// Delete Employee by ID
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteById(id);
		return "Employee deleted successfully!";
	}
	
	// Get All Employees
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.findAll();
	}
}

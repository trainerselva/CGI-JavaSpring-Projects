package com.cgi.MongoDBCrudDemo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.MongoDBCrudDemo.model.Employee;
import com.cgi.MongoDBCrudDemo.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	// Create a new employee
	@PostMapping
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		Employee createdEmployee = employeeService.createEmployee(employee);
		return ResponseEntity.ok(createdEmployee);
	}
	
	// Get all employees
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> employees = employeeService.getAllEmployees();
		return ResponseEntity.ok(employees);
	}
	
	// Get employee by ID
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable String id) {
		Optional<Employee> employee = employeeService.getEmployeeById(id);
		
		if (employee.isPresent()) {
			return ResponseEntity.ok(employee.get());
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	// Update an employee
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(
				@PathVariable String id,
				@RequestBody Employee employee
			) {
		Employee updatedEmployee = employeeService.updateEmployee(id, employee);
		return ResponseEntity.ok(updatedEmployee);
	}
	
	// Delete an employee
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable String id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.noContent().build();
	}
}

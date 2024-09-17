package com.cgi.springDataJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.springDataJPA.model.Employee;
import com.cgi.springDataJPA.service.EmployeeService;

@RestController
@CrossOrigin
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	// Create Employee
	@PostMapping
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	// Get Employee by ID
	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	// Update Employee
	@PutMapping("/{id}")
	public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee employee) {
		employee.setId(id);
		return employeeService.updateEmployee(employee);
	}
	
	// Delete Employee by ID
//	@DeleteMapping(value = "/{id}", produces = {MediaType.TEXT_PLAIN_VALUE})
	@DeleteMapping("/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployeeById(id);
		return "Employee deleted successfully!";
	}
	
	// Get All Employees
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	// Get employees by department
	@GetMapping("/department/{department}")
	public List<Employee> getEmployeesByDepartment(@PathVariable String department) {
		return employeeService.findEmployeesByDepartment(department);
	}
	
	// Get employees with salary greater than a specific value
	@GetMapping("/salary/{salary}")
	public List<Employee> getEmployeesWithHighSalary(@PathVariable Double salary) {
		return employeeService.findEmployeesWithHighSalary(salary);
	}
	
	// Get employees within a salary range
	@GetMapping("/salary-range")
	public List<Employee> getEmployeesWithinSalaryRange(
			@RequestParam Double minSalary,
			@RequestParam Double maxSalary
			) {
		return employeeService.findEmployeesWithinSalaryRange(minSalary, maxSalary);
	}
}

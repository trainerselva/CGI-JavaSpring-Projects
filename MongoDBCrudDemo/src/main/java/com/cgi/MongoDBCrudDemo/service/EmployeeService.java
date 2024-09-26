package com.cgi.MongoDBCrudDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.MongoDBCrudDemo.model.Employee;
import com.cgi.MongoDBCrudDemo.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	// Create operation
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	// Read operation
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(String id) {
		return employeeRepository.findById(id);
	}
	
	// Update operation
	public Employee updateEmployee(String id, Employee updatedEmployee) {
		Optional<Employee> existingEmployee = employeeRepository.findById(id);
		
		if (existingEmployee.isPresent()) {
			Employee emp = existingEmployee.get();
			emp.setFirstName(updatedEmployee.getFirstName());
			emp.setLastName(updatedEmployee.getLastName());
			emp.setEmail(updatedEmployee.getEmail());
			return employeeRepository.save(emp);
		} else {
			throw new RuntimeException("Employee not found");
		}
	}
	
	// Delete operation
	public void deleteEmployee(String id) {
		employeeRepository.deleteById(id);
	}
}

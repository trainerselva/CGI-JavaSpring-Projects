package com.cgi.springDataJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.springDataJPA.model.Employee;
import com.cgi.springDataJPA.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}
	
	public Employee getEmployeeById(Long id) {
		return employeeRepository.findById(id).orElse(null);
	}
	
	public void deleteEmployeeById(Long id) {
		employeeRepository.deleteById(id);
	}
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}
	
	// Calling custom methods in the repository
	public List<Employee> findEmployeesByDepartment(String department) {
		return employeeRepository.findByDepartment(department);
	}
	
	public List<Employee> findEmployeesWithHighSalary(Double salary) {
		return employeeRepository.findBySalaryGreaterThan(salary);
	}
	
	public List<Employee> findEmployeesWithinSalaryRange(Double minSalary, Double maxSalary) {
		return employeeRepository.findEmployeesWithinSalaryRange(minSalary, maxSalary);
	}
}

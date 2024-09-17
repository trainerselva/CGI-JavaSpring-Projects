package com.cgi.springJDBC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.springJDBC.dao.EmployeeDAO;
import com.cgi.springJDBC.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	public int save(Employee employee) {
		return employeeDAO.save(employee);
	}
	
	public int update(Employee employee) {
		return employeeDAO.update(employee);
	}
	
	public Employee findById(Long id) {
		return employeeDAO.findById(id);
	}
	
	public int deleteById(Long id) {
		return employeeDAO.deleteById(id);
	}
	
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}
}

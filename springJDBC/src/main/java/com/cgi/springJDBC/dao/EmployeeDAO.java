package com.cgi.springJDBC.dao;

import java.util.List;

import com.cgi.springJDBC.model.Employee;

public interface EmployeeDAO {
	int save(Employee employee);
	int update(Employee employee);
	Employee findById(Long id);
	int deleteById(Long id);
	List<Employee> findAll();
}

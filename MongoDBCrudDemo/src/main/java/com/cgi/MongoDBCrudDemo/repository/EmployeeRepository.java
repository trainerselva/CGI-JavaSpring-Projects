package com.cgi.MongoDBCrudDemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cgi.MongoDBCrudDemo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
	// Custom query methods can be added here if needed
}

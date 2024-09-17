package com.cgi.springDataJPA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cgi.springDataJPA.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	// Find employees by Department
	List<Employee> findByDepartment(String department);
	
	// Generates a query similar to
	// SELECT * FROM employee WHERE department = ?;
	
	// Find employees with salary greater than a specific value
	List<Employee> findBySalaryGreaterThan(Double salary);
	
	// Generates a query similar to
	// SELECT * FROM employee WHERE salary > ?;
	
	
	/////////////////////////////
	// Using custom query with @Query annotation
	// We will use JPQL query instead of Native SQL query
	
	@Query("SELECT e FROM Employee e WHERE e.salary BETWEEN :minSalary AND :maxSalary")
	List<Employee> findEmployeesWithinSalaryRange(
			@Param("minSalary") Double minSalary,
			@Param("maxSalary") Double maxSalary
			);
	
}

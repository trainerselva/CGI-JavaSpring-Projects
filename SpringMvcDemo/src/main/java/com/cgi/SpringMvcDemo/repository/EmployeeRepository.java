package com.cgi.SpringMvcDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cgi.SpringMvcDemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}

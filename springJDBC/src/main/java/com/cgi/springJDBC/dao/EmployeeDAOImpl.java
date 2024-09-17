package com.cgi.springJDBC.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.cgi.springJDBC.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	// Save Employee
	@Override
	public int save(Employee employee) {
		// TODO Auto-generated method stub
		String query = 
				"INSERT INTO employee (name, department, salary) VALUES (?, ?, ?)";
		return jdbcTemplate.update(
				query,
				employee.getName(), employee.getDepartment(), employee.getSalary()
				);
	}

	// Update Employee
	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String query = 
				"UPDATE employee SET name = ?, department = ?, salary = ? WHERE id = ?";
		return jdbcTemplate.update(
				query,
				employee.getName(), employee.getDepartment(), employee.getSalary(), employee.getId()
				);
	}

	// Find Employee by ID
	@Override
	public Employee findById(Long id) {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM employee WHERE id = ?";
		return jdbcTemplate.queryForObject(query, new Object[] {id}, new EmployeeRowMapper());
	}

	// Delete Employee by ID
	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		String query = "DELETE FROM employee WHERE id = ?";
		return jdbcTemplate.update(query, id);
	}

	// Find All Employees
	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		String query = "SELECT * FROM employee";
		return jdbcTemplate.query(query, new EmployeeRowMapper());
	}
	
	// RowMapper for Employee
	private static class EmployeeRowMapper implements RowMapper<Employee> {

		@Override
		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Employee employee = new Employee();
			employee.setId(rs.getLong("id"));
			employee.setName(rs.getString("name"));
			employee.setDepartment(rs.getString("department"));
			employee.setSalary(rs.getDouble("salary"));
			return employee;
		}
		
	}

}

package com.cgi.SpringMvcDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cgi.SpringMvcDemo.entity.Employee;
import com.cgi.SpringMvcDemo.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	// Get All Employees
	@GetMapping
	public String getAllEmployees(Model model) {
		model.addAttribute("employees", employeeService.getAllEmployees());
		return "employees";
	}
	
	// Create Employee Form
	@GetMapping("/new")
	public String createEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "create_employee";
	}
	
	// Save New Employee
	@PostMapping
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	// GET Employee By ID for EDIT
	@GetMapping("/edit/{id}")
	public String editEmployeeForm(@PathVariable Long id, Model model) {
		Employee employee = 
				employeeService.getEmployeeById(id).orElseThrow();
		model.addAttribute("employee", employee);
		return "edit_employee";
	}
	
	// Update Employee
	@PostMapping("/{id}")
	public String updateEmployee(@PathVariable Long id,
			@ModelAttribute("employee") Employee employee) {
		employee.setId(id);
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
	
	// Delete Employee
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return "redirect:/employees";
	}
}

package com.cgi.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.microservice.exception.CustomerNotFoundException;
import com.cgi.microservice.model.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerController {
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerController() {
		customers.add(new Customer(111L, "Customer-1", "first@gmail.com"));
		customers.add(new Customer(222L, "Second Customer", "second@yahoo.com"));
	}

	// Get all customers
	@GetMapping
	public List<Customer> getAllCustomers() {
		return customers;
	}
	
	// Get customer by ID
	@GetMapping("/{id}")
	public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
		Customer customer = customers
				.stream()
				.filter(cust -> cust.getId().equals(id))
				.findFirst()
				.orElseThrow(
						() -> new CustomerNotFoundException(
								"Customer with id: " + id + " was not found!"
						));
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	// Create a new customer
	@PostMapping
	public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
		customers.add(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
	}
	
	// Update an existing customer by ID
	@PutMapping("/{id}")
	public ResponseEntity<Customer> updateCustomer(
			@PathVariable Long id,
			@RequestBody Customer customerDetails
			) {
		Customer customer = customers
				.stream()
				.filter(cust -> cust.getId().equals(id))
				.findFirst()
				.orElseThrow(
						() -> new CustomerNotFoundException(
								"Customer with id: " + id + " not found!"
								));
		customer.setName(customerDetails.getName());
		customer.setEmail(customerDetails.getEmail());
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
	
	// Delete a customer by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Long id) {
		boolean removed = customers.removeIf(cust -> cust.getId().equals(id));
		
		if (!removed) {
			throw new CustomerNotFoundException(
					"Customer with id: " + id + "not found!"
					);
		}
		
		return new ResponseEntity<String>(
				"Customer with id: " + id + " deleted!",
				HttpStatus.OK);
	}
}

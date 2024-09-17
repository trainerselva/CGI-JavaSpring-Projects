package com.cgi.microservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.microservice.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

	private List<Student> students = new ArrayList<Student>();
	
	// Constructor
	public StudentController() {
		students.add(new Student(101L, "First", "first@gmail.com"));
		students.add(new Student(102L, "Second", "second@yahoo.com"));
	}
	
	
	// Get all the students
	
	// localhost:8080/students
	
//	@RequestMapping(method = RequestMethod.GET, path = "/students")
//	@GetMapping
//	public List<Student> getAllStudents() {
//		return students;
//	}
	
	
	// Get a list of student by email address (as a query string)
	
	@GetMapping
	public List<Student> getStudentsByEmail(
			@RequestParam(required = false) String email) {
		if (email != null) {
			return students
					.stream()
					.filter(s -> s.getEmail().equalsIgnoreCase(email))
					.toList();
		}
		return students;
	}
	
	// Get a student by ID
	
	// localhost:8080/students/student-id
	// localhost:8080/students/101
	
//	@GetMapping(path = "/{id}", produces = {"application/xml", "application/json"})
	@GetMapping(path = "/{id}", 
			produces = {
					MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE
			})
	public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
		Student returnValue = students.stream()
				.filter(student -> student.getId().equals(id))
				.findFirst()
				.orElse(null);
		if (returnValue != null) 
			return new ResponseEntity<Student>(returnValue, HttpStatus.OK);

		return new ResponseEntity<Student>(HttpStatus.NOT_FOUND);
	}
	
	
	// Create a new student
	
	@PostMapping(
			consumes = {
					MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE
			},
			produces = {
					MediaType.APPLICATION_JSON_VALUE,
					MediaType.APPLICATION_XML_VALUE
			})
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		students.add(student);
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
	
	// Update an existing student by ID
	@PutMapping("/{id}")
	public Student updateStudent(@PathVariable Long id,
			@RequestBody Student studentDetails) {
		Student student = students
				.stream()
				.filter(s -> s.getId().equals(id))
				.findFirst()
				.orElse(null);
		if (student != null) {
			student.setName(studentDetails.getName());
			student.setEmail(studentDetails.getEmail());
		}
		return student;
	}
	
	// Change the email address of a student (identified by id)
	@PatchMapping("/{id}")
	public Student changeEmailOfStudent(
			@PathVariable Long id,
			@RequestBody String email
			) {
		Student student = students
				.stream()
				.filter(s -> s.getId().equals(id))
				.findFirst()
				.orElse(null);
		if (student != null) {
			student.setEmail(email);
		}
		return student;
		
	}
	
	// Delete a student by ID using PathVariable
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable Long id) {
		students.removeIf(student -> student.getId().equals(id));
		return "Student with ID: " + id + " deleted";
	}
}

package com.chandu.mysqldemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandu.mysqldemo.model.Employee;
import com.chandu.mysqldemo.service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@PostMapping("/create")
	public ResponseEntity<Employee> create(@RequestBody Employee employee) {
		return ResponseEntity.ok(employeeService.createEmployee(employee));
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getByID(@PathVariable("id") int id) {
		return ResponseEntity.ok(employeeService.getEmployeeByID(id));

	}

}

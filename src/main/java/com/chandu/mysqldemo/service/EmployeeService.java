package com.chandu.mysqldemo.service;

import org.springframework.stereotype.Service;

import com.chandu.mysqldemo.model.Employee;

public interface EmployeeService {
	Employee createEmployee(Employee employee);

	Employee getEmployeeByID(int id);
}

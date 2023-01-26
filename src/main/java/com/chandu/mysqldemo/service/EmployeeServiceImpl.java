package com.chandu.mysqldemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandu.mysqldemo.model.Employee;
import com.chandu.mysqldemo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.createEmployee(employee);
	}

	@Override
	public Employee getEmployeeByID(int id) {
		return employeeRepository.getEmployeeByID(id);
	}

}

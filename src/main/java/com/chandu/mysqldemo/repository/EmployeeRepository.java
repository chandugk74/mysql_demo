package com.chandu.mysqldemo.repository;

import com.chandu.mysqldemo.model.Employee;

public interface EmployeeRepository {
	Employee createEmployee(Employee employee);

	Employee getEmployeeByID(int id);

}

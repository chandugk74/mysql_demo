package com.chandu.mysqldemo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chandu.mysqldemo.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Autowired
	JdbcTemplate JdbcTemplate;

	@Override
	public Employee createEmployee(Employee employee) {
		String quirey = "insert into employee values(?,?,?)";
		JdbcTemplate.update(quirey, employee.getId(), employee.getName(), employee.getAge());
		return employee;
	}

	@Override
	public Employee getEmployeeByID(int id) {
		String quirey = "Select * from employee where id = ?";
		return JdbcTemplate.queryForObject(quirey, new Object[] { id },
				(rs, rowdown) -> new Employee(rs.getInt("id"), rs.getString("name"), rs.getInt("age")));
	}

}

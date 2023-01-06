package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {

	//Get a single Employee by Id
	List<Employee> listAllEmployees();
	
	//Get a list of Employees by id
	Employee searchByPhoneNumber(String _phoneNumber);
	
	//Add a new Employee
	Employee addEmployee(Employee employee);
	
	//Update an Employee
	
	//Delete an Employee
}

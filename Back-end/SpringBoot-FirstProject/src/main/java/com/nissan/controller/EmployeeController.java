package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;
@CrossOrigin
@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	IEmployeeService employeeService;
	
	//Get a list of Employee http://localhost:9091/api/employees
	@GetMapping("employees")
	public List<Employee> getAllEmployee(){
		return employeeService.listAllEmployees();
	}
	
	//Get single employee by Phone Number
	// http://localhost:9091/api/employees/8156732893
	@GetMapping("employees/{_phoneNumber}")
	public Employee searchByPhoneNumber(@PathVariable String _phoneNumber) {
		return employeeService.searchByPhoneNumber(_phoneNumber);
	}
	
	
	@PostMapping("employees")
	public Employee insertEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
	}
	
	
	
	
	
}

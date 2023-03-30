package com.example.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.entity.Employee;

@Component
public interface EmployeeService {
	
	Employee createEmployee(Employee emp);
	
	List<Employee> getAllEmployee();
	
	Employee getAnEmployee(int empid);
	
	Employee update (Employee emp, int empid);
	
	String delete (int empid);
}

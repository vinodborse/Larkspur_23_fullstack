package com.ts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ts.model.Employee;

@Service
public class EmployeeService {

	public Employee getEmp(int empId) {
		
		Employee e1 = new Employee(1, "Vinod", "IT", 10000);
		Employee e2 = new Employee(2, "Don", "Faltu", 420);
		Employee e3 = new Employee(3, "Anarkali", "Gov.", 12000);
		Employee e4 = new Employee(5, "Aliya", "Movie", 200);
		Employee e5 = new Employee(6, "Shiv", "IT", 100000);
		Employee e6 = new Employee(7, "Dhondu", "IT", 4000);
		
		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5, e6);
		
		Employee tempEmp = new Employee();
		for(Employee emp : employees) {
			if(emp.getId() == empId) {
				tempEmp = emp;
				break;
			}
		}
		
		return tempEmp;
	}
}

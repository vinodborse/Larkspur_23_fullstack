package com.ts.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Employee;
import com.ts.service.EmployeeService;

@RestController
public class EmployeeController {

		
	@GetMapping("/get-emp")
	public Employee getEmployee(@RequestParam("empId")int empId) {
		
		EmployeeService empService = new EmployeeService();
		
		return empService.getEmp(empId);
		
	}
}

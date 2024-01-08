package com.ts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;

@RestController
public class StudentController {

	@GetMapping("/msg")
	public Student msg() {
		
		Student s = new Student(1, "Vinod", "Pune");
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		
		return s;
	}
	
	
	@PostMapping("/std")
	public Student addStd(@RequestBody Student std) {
		
		return std;
	}
}

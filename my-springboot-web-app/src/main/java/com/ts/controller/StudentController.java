package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping("/msg")
	public String msg() {
		return "Hello";
	}
	
	@GetMapping("/student")
	public Student std() {
		Student std = studentService.getStudent();
		return std;
	}
	
	@PostMapping("/save-student")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentService.saveStudent(student);

	}
	
	@GetMapping("/get-student")
	public Student getStudent(@RequestParam("rollno") Long rollno) {
		return studentService.getStudent(rollno);
	}
	
}












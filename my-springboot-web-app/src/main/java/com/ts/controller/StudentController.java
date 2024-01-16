package com.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
@CrossOrigin("*")
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
	
	@GetMapping("/get-all-students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/get-student-by-name")
	public List<Student> getStudentByaddress(@RequestParam("address") String address) {
		return studentService.getStudentByAddress(address);
	}
	
	@GetMapping("/and")
	public List<Student> byAnd(@RequestParam("name") String name,
							   @RequestParam("address") String address) {
		
		return studentService.byAnd(name, address);
	}
	
	@GetMapping("/or")
	public List<Student> byOr(@RequestParam("name") String name,
							   @RequestParam("address") String address) {
		
		return studentService.byOr(name, address);
	}
}












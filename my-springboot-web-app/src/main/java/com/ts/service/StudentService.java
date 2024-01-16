package com.ts.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.model.Student;
import com.ts.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public Student getStudent() {
		Student s = new Student(1L, "Vinod", "Pune");
		return s;
	}
	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);		
	}
	
	public Student getStudent(Long rollno) {
		return studentRepository.findById(rollno).get();
	}
	
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}
	
	public List<Student> getStudentByAddress(String address) {		
		return studentRepository.findByAddress(address);
	}
	
	
	public List<Student> byAnd(String name, String address) {		
		return studentRepository.findByNameAndAddress(name, address);
	}
	
	public List<Student> byOr(String name, String address) {		
		return studentRepository.findByNameOrAddress(name, address);
	}
}







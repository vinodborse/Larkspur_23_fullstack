package com.ts.service;


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
}






package com.ts.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	public List<Student> findByAddress(String address);
	
	public List<Student> findByNameAndAddress(String name, String address);
	
	public List<Student> findByNameOrAddress(String name, String address);
}
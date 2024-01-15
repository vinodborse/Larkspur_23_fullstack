package com.ts.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long rollno;
	private String name;
	private String address;
	
	public Long getRollno() {
		return rollno;
	}
	public void setRollno(Long rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student() {}

	public Student(Long rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	
}

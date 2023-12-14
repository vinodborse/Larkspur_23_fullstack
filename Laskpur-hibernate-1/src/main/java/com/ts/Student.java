package com.ts;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "std")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	@Column(name = "student_name")
	private String name;
	
	@Column(name= "city")
	private String address;
	
	@Temporal(TemporalType.TIME)
	private Date dob;
	
	
	
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
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
	
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public Student(String address, int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public Student(String name, String address, Date dob) {
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
}

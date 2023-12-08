package com.ts;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int teacherId;
	private String name;
	private String batch;
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	
	public Teacher() {}
	
	public Teacher(int teacherId, String name, String batch) {
		this.teacherId = teacherId;
		this.name = name;
		this.batch = batch;
	}
	
	
}

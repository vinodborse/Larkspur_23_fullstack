package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {

	private Teacher t;
	
	
	
	public Teacher getT() {
		return t;
	}



	public void setT(Teacher t) {
		this.t = t;
	}

	

	public Student() {}
	
	public Student(Teacher t) {
		this.t = t;
	}



	public void stdName() {
		System.out.println("Hello Students...!!!!!");
		
		t.tchName();
	}

}

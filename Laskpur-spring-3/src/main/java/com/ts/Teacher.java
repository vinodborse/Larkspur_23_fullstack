package com.ts;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	@Autowired
	Student std;
	
	public void tchmethod() {
		System.out.println("WooooooW,We are in tchmethod..!");		
		std.stdmethod();
	}
}

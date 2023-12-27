package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Sample {

	@GetMapping("/user")
	public void test(){
		System.out.println("WE ARE IN DOGET METHOD...");
	}
	
	@	PostMapping("/user")
	public void test1(){
		System.out.println("Sir kuch samjh nahi aa rha...");
	}

}
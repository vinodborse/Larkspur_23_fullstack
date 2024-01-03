package com.ts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //-> @Controller + @ResponseBody
public class Sample {

	@GetMapping("/vinod") //---> localhost:8080/app/vinod (API)
	public String test(){
		System.out.println("WE ARE IN DOGET METHOD...");
		return "WE ARE IN DOGET METHOD...";
	}
	
	@PostMapping("/don")
	public String test1(){
		System.out.println("Sir kuch samjh nahi aa rha...");
		return "Sir kuch samjh nahi aa rha...";
	}

}
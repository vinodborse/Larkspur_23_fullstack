package com.ts;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class User {

	@GetMapping("/uname")
	public String displayUserName1() {
		return "Hello User from GET";
	}
	
	@PostMapping("/uname")
	public String displayUserName2() {
		return "Hello User from POST";
	}
	
	@PutMapping("/uname")
	public String displayUserName3() {
		return "Hello User from PUT";
	}
	
	@DeleteMapping("/uname")
	public String displayUserName4() {
		return "Hello User from DELETE";
	}
	
	
	@GetMapping("/user-name-pv/{nm}") //--> loclahost:8080/app-name/user-name/don
	public String dun1(@PathVariable("nm") String name) {
		return "HELLO "+ name;
	}
	
	
	@GetMapping("/user-name-rp") //--> loclahost:8080/app-name/user-name?nm=don
	public String dun2(@RequestParam("nm") String name) {
		return "HELLO "+ name;
	}
	
	@GetMapping("/search")//-> localhost:8080/app-name/search?q=cricket
	public String googleMethod(@RequestParam("q") String query) {
		return "WOOOW";
	}
	
}


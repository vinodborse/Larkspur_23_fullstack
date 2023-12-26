package com.ts;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Sample {


	@Before("execution(public void tchmethod())")
	public void s1() {
		System.out.println("Welcome-----");
	}
	
	@After("execution(public void tchmethod())")
	public void s2() {
		System.out.println("--END--");
	}

}

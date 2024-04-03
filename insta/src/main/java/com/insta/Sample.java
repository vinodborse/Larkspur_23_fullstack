package com.insta;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sample extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp){
		
		int a = 45;
		int b = 5;
		
		System.out.println(a+b);
	}
	
}

package com.insta;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Math extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int a = 80;
		int b = 35;
		String result = "Result is " + (a+b);
		System.out.println(result);
		
		request.setAttribute("data", result);
		request.getRequestDispatcher("display.jsp").forward(request, response);
	}

}

package com.ts;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/vinod")
public class Sample extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pdata = request.getParameter("username");
		String name = pdata + " tum kesi ho";
		System.out.println(name);
		
		request.setAttribute("data", name);
		request.getRequestDispatcher("dhondu.jsp").forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	        throws ServletException, IOException
	    {
		
		String pdata = req.getParameter("username");
		String name = pdata + " bahot acchi hai";
		System.out.println(name);
		
		req.setAttribute("data", name);
		req.getRequestDispatcher("dhondu.jsp").forward(req, resp);
		
	    }

}

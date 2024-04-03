package com.insta;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/search")
public class UserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//				<"q", "Don">	
		String val = request.getParameter("q");//5, 67, 344
	    String userName = null;
		//----------------
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	        String url = "jdbc:mysql://localhost:3306/tsdb";
	        String username = "root";
	        String password = "root";
	        Connection connection = DriverManager.getConnection(url, username, password);
	        Statement stmt = connection.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM student WHERE rollno = "+ val);
	    
	    
	        while(rs.next()) {
	        	userName = rs.getString("name");
	    
	        }
	        
	        connection.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        

		//----------------
		request.setAttribute("data", userName);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("POST method has been called");
	}

}

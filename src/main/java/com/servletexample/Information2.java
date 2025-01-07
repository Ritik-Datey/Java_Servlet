package com.servletexample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Information2 extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		System.out.println("information 2 m3 bhi");
        // Set response content type
        resp.setContentType("text/html");

        
        PrintWriter out = resp.getWriter();
        out.println("<h1>Your data has been submitted successfully!</h1>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Password: " + password + "</p>");
        
        
	}

}

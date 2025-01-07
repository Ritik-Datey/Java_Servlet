package com.servletexample;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Information extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//super.doPost(req, resp);
		
	    String email = req.getParameter("email");
       // System.out.println("Email: " + email);

        String password = req.getParameter("password");
       // System.out.println("Password: " + password);

        System.out.println("mao information 1 me aaya aur....");

        RequestDispatcher rd = req.getRequestDispatcher("ragna");
        rd.forward(req, resp);
	}
	
}

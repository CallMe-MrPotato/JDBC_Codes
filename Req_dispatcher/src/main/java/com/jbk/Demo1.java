package com.jbk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/redirection")
public class Demo1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String email = req.getParameter("Email1");
	String pass = req.getParameter("Pass1");
	
	System.out.println(email);
	System.out.println(pass);
	
	if(email.equals("virajkadbe123@gmail.com") && pass.equals("viraj@123")) {
		System.out.println("Login Successfully...");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<h1>Login Successfully...</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("/Profile.jsp");
		rd.include(req, resp);
	}else {
		System.out.println("Username and Password did not match");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<h1>Username and Password did not match</h1>");
		RequestDispatcher rd = req.getRequestDispatcher("/login.html");
		rd.include(req, resp);
	}
	}
}

package com.jbk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/registerform")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  String Fname = request.getParameter("FName1");
	  System.out.println(Fname);
	  String Lname = request.getParameter("LName1");
	  System.out.println(Lname);
	  String Email = request.getParameter("Email1");
	  System.out.println(Email);
	  String Mobile = request.getParameter("Mobile1");
	  System.out.println(Mobile);
	  String Address = request.getParameter("Address1");
	  System.out.println(Address);
	  String dob = request.getParameter("DOB1");
	  System.out.println(dob);
	  String city = request.getParameter("City1");
	  System.out.println(city);
	  String State = request.getParameter("State1");
	  System.out.println(State);
	  String Country = request.getParameter("Country1");
	  System.out.println(Country);
	  String Age = request.getParameter("Age1");
	  System.out.println(Age);
	  String Degree = request.getParameter("Degree1");
	  System.out.println(Degree);
	  String Passing = request.getParameter("Passing1");
	  System.out.println(Passing);
	  String pass = request.getParameter("Pass1");
	  System.out.println(pass);
	  
	  
	 PrintWriter out = response.getWriter();
	 
	 out.print(Fname);
	 out.print(Lname);
	 out.print(Email);
	 out.print(Mobile);
	 out.print(Address);
	 out.print(dob);
	 out.print(city);
	 out.print(State);
	 out.print(Country);
	 out.print(Age);
	 out.print(Degree);
	 out.print(Passing);
	 out.print(pass);
	 
	}
}

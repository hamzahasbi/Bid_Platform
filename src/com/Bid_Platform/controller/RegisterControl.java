package com.Bid_Platform.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bid_Platform.model.Candidate;
import com.Bid_Platform.model.Expert;
import com.Bid_Platform.model.Owner;
import com.Bid_Platform.model.Person;

/**
 * Servlet implementation class RegisterControl
 */
public class RegisterControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] fullname=request.getParameter("fullname").split("\\s+");
		String email=request.getParameter("email");
		int age=Integer.parseInt(request.getParameter("age"));
		String num_tel=request.getParameter("num_tel");
		String nationnalité=request.getParameter("country");
		String mdp=request.getParameter("password");
		String role=request.getParameter("role");
		String cat=request.getParameter("categorie");
		if(role.equalsIgnoreCase("Owner")) {
			Owner person=new Owner(email,fullname[0],fullname[1],num_tel,nationnalité,mdp,age,null);
			person.insert();
			response.sendRedirect("/Bid_Platform/Login.jsp");
		}
		else if(role.equalsIgnoreCase("Candidate")){
			Candidate person=new Candidate(email,fullname[0],fullname[1],num_tel,nationnalité,mdp,age);
			person.insert();
			response.sendRedirect("/Bid_Platform/Login.jsp");
		}
		else if(role.equalsIgnoreCase("Expert")) {
			Expert person=new Expert(email,fullname[0],fullname[1],num_tel,nationnalité,mdp,age,cat);
			person.insert();
			response.sendRedirect("/Bid_Platform/Login.jsp");
		}
		else response.sendRedirect("test.jsp");
		
	}

}

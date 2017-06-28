package com.Bid_Platform.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.Bid_Platform.model.Data_base_utils;
import com.Bid_Platform.model.Person;

/**
 * Servlet implementation class LoginControl
 */
@WebServlet("/LoginControl")
public class LoginControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Data_base_utils data_base_utils=new Data_base_utils();
		response.getWriter().append(request.getParameter("username")+"<br/>"+request.getParameter("password")+"<br/>");
		List<Person> pp=data_base_utils.verif_login(request.getParameter("username"), request.getParameter("password"));
		if(pp.size()>0) {
			HttpSession session=request.getSession();
			session.setAttribute("current", pp.get(0));
			response.sendRedirect("/Bid_Platform/onepage-index.jsp");
		}
		else response.sendRedirect("/Bid_Platform/Login.jsp");
	}

}

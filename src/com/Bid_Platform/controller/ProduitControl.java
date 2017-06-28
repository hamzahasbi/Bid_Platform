package com.Bid_Platform.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.Bid_Platform.model.Candidate;
import com.Bid_Platform.model.Data_base_utils;
import com.Bid_Platform.model.Person;
import com.Bid_Platform.model.Produit;

/**
 * Servlet implementation class ProduitControl
 */
public class ProduitControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		Candidate person=(Candidate) session.getAttribute("current");
		//System.out.println(person.getEmail());
		if(person.is_class().equals("Candidate")) {
		
		
			Data_base_utils data_base_utils=new Data_base_utils();
			data_base_utils.begin();
			Produit produit=(Produit) data_base_utils.getM().find(Produit.class, (String) request.getParameter("id"));
			produit.setPrix(produit.getPrix()+50);
			Candidate candidate=(Candidate) data_base_utils.getM().find(Candidate.class, (String) person.getEmail());
			System.out.println(produit.getSerie()+" "+candidate.getEmail());
			candidate.getWanted().add(produit);
			data_base_utils.commit();
			response.sendRedirect("/Bid_Platform/produit.jsp");
		}
		
	}

	

}

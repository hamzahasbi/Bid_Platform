package com.Bid_Platform.controller;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bid_Platform.model.Candidate;
import com.Bid_Platform.model.Data_base_utils;
import com.Bid_Platform.model.Expert;
import com.Bid_Platform.model.Owner;
import com.Bid_Platform.model.Produit;

/**
 * Servlet implementation class Produit_DB_Controller
 */
public class Produit_DB_Controller extends HttpServlet implements Serializable{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Produit_DB_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s="Moto";
		
	
		
		Owner ow=new Owner("hamza526@gmail.com","hasbi","hamza","0669940695","Marocain","123",22,null);
		Produit p=new Produit("At665A","Z800","zojuine","../ok.pnj","Deuxieme main",
				ow,50000,s,1);
		List<Produit> uList=new ArrayList<Produit>();
		uList.add(p);
		Candidate c=new Candidate("badr@gmail.com","Adnan","Badr","0669940695","Marocain","123",22);
		List<Candidate> cList=new ArrayList<Candidate>();
		cList.add(c);
		Expert e=new Expert("mmax@gmail.com","leblanc","max","0669940695","Marocain","123",22,"Moto");
		
		ow.setMyproducts(uList);
		p.setParticipants(cList);
		
		//response.getWriter().append(ow.insert()+" "+p.insert()+" "+c.insert()+" "+e.insert()+"<br/>");
		
		Data_base_utils data_base_utils=new Data_base_utils();
		
		List<Produit> res=data_base_utils.owners(ow.getEmail());
		List<Produit> rep=data_base_utils.all_products();
		
		for(int i=0;i<res.size();i++){
			response.getWriter().append(res.get(i).getOwner().getEmail()+"<br/>");
		}
		
		for(int i=0;i<rep.size();i++){
			List<Candidate> tmp=rep.get(i).getParticipants();
			for(Candidate candidate:tmp){
				response.getWriter().append(rep.get(i).getNom()+"==>"+candidate.getEmail()+"<br/>");
			}
		}
		response.sendRedirect("/Bid_Platform/Login.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

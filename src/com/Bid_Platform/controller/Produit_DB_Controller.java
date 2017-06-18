package com.Bid_Platform.controller;

import java.io.IOException;
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
import com.Bid_Platform.model.Owner;
import com.Bid_Platform.model.Produit;

/**
 * Servlet implementation class Produit_DB_Controller
 */
public class Produit_DB_Controller extends HttpServlet {
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
		String s="Moto,Vehicule";
		
		
		Produit p=new Produit("AtA","Z800","zojuine","02/10/2017","03/11/2017","../ok.pnj","Deuxieme main",s,
				"hamza",50000,1);
		
		Produit pc=new Produit("AtlA","Z800","z'ouine","02/10/2017","03/11/2017","../ok2.pnj","Deuxieme main",s,
				"hamza",50000,1);
		
		Owner ow=new Owner("hamza1@gmail.com","hasbi","hamza","0669940695","Marocain","123",22,"wakha","AA");
		Owner ox=new Owner("mehdi5@gmail.com","hasbi","mehdi","0669940695","Marocain","123",22,"wakha","AA");
		
		Candidate candidate=new Candidate("klk@gmail.com","hasbi","mehdi","0669940695","Marocain","123",22,"wakha","AA");
		//Person person=new Person("hamza@gmail.com","hasbi","hamza","0669940695","Marocain","123",22);
		EntityManagerFactory em=Persistence.createEntityManagerFactory("maxDars");
		EntityManager m=em.createEntityManager();
		
		
		/*m.getTransaction().begin();
		m.persist(p);
		m.persist(pc);
		m.persist(ow);
		m.persist(ox);
		m.persist(candidate);
		m.getTransaction().commit();*/
		Data_base_utils dbu=new Data_base_utils(m);
		List<Owner>pp=dbu.owners();
		for(int i=0;i<pp.size();i++){
			response.getWriter().append(pp.get(i).toString()+"<br/>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

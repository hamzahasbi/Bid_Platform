package com.Bid_Platform.model;

import java.util.*;

import javax.persistence.EntityManager;


public class Data_base_utils {
	//private EntityManagerFactory em;
	private EntityManager m;
	
	
	
	public Data_base_utils(EntityManager m) {
		super();
		//this.em = em;
		this.m = m;
	}
	/*public EntityManagerFactory getEm() {
		return em;
	}
	public void setEm(EntityManagerFactory em) {
		this.em = em;
	}*/
	public EntityManager getM() {
		return m;
	}
	public void setM(EntityManager m) {
		this.m = m;
	}
	
	public List<Produit> all_products(){
		return (List<Produit>) m.createNamedQuery("all_products").getResultList();
	}
	public List<Produit> products_by_serie(String se){
		return (List<Produit>) m.createNamedQuery("products_by_serie").setParameter("serie", se).getResultList();
	}
	public List<Produit> products_by_owner(String own){
		return (List<Produit>) m.createNamedQuery("products_by_owner").setParameter("own", own).getResultList();
	}
	public List<Produit> products_by_name(String name){
		return (List<Produit>) m.createNamedQuery("products_by_name").setParameter("name", name).getResultList();
	}
	public List<Produit> products_by_type(String type){
		return (List<Produit>) m.createNamedQuery("products_by_type").setParameter("type", type).getResultList();
	}
	public List<Produit> products_by_price(double inf,double sup){
		return (List<Produit>) m.createNamedQuery("products_by_price").setParameter("inf", inf).setParameter("sup", sup).getResultList();
	}
	public List<Produit> products_by_begin_date(String beg_date){
		return (List<Produit>) m.createNamedQuery("products_by_begin_date").setParameter("beg_date", beg_date).getResultList();
	}
	public List<Produit> products_by_end_date(String end_date){
		return (List<Produit>) m.createNamedQuery("products_by_end_date").setParameter("end_date", end_date).getResultList();
	}
	public List<Produit> poducts_by_cat_price(String type,double inf,double sup){
		return (List<Produit>) 
				m.createNamedQuery("poducts_by_cat_price").setParameter("type", type).setParameter("inf", inf).setParameter("sup", sup).getResultList();
	}
	public List<Produit> products_by_cat_begin_date(String type,String beg_date){
		return (List<Produit>) 
				m.createNamedQuery("products_by_cat_begin_date").setParameter("type", type).setParameter("beg_date", beg_date).getResultList();
	}
	public List<Produit> products_by_cat_end_date(String type,String end_date){
		return (List<Produit>) 
				m.createNamedQuery("products_by_cat_end_date").setParameter("type", type).setParameter("end_date", end_date).getResultList();
	}
	public List<Produit> products_by_cat_name(String type,String name){
		return (List<Produit>) 
				m.createNamedQuery("products_by_cat_end_date").setParameter("type", type).setParameter("name", name).getResultList();
	}
	public List<Owner> owners(){
		return (List<Owner>) m.createNamedQuery("Owners").getResultList();
	}
}

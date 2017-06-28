package com.Bid_Platform.model;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Data_base_utils {
	
	final  EntityManagerFactory em=Persistence.createEntityManagerFactory("maxDars");
	private EntityManager m;
	

	public Data_base_utils() {
		super();
		
		this.m = em.createEntityManager();
	}
	
	public void  begin() {
		this.getM().getTransaction().begin();
		
	}
	public void  commit() {
		this.getM().getTransaction().commit();
	}
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
	public List<Produit> owners(String a){
		return (List<Produit>) m.createNamedQuery("products_by_owner").setParameter("mail", a).getResultList();
	}
	public List<Produit> candidates(String a){
		return (List<Produit>) m.createNamedQuery("products_by_candidate").setParameter("mail", a).getResultList();
	}
	
	public List<Person> verif_login(String mail,String psswd) {
		List<Person> res=new ArrayList<Person>();
		res.addAll( (List<Person>) m.createNamedQuery("verif_owner").setParameter("mail", mail).setParameter("psswd", psswd).getResultList());
		res.addAll( (List<Person>) m.createNamedQuery("verif_expert").setParameter("mail", mail).setParameter("psswd", psswd).getResultList());
		res.addAll( (List<Person>) m.createNamedQuery("verif_cand").setParameter("mail", mail).setParameter("psswd", psswd).getResultList());
		return res;
	}
}

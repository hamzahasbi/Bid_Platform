package com.Bid_Platform.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Expert")
public class Expert extends Person{
	
	public Expert() {
		super();
	}
	private String description,serie;
	public Expert(String email, String nom, String prenom, String num_tel, String nationnalite, String mdp,
			int age,String description,String serie) {
		super(email, nom, prenom, num_tel, nationnalite, mdp, age);
		
		this.description=description;
		this.serie=serie;
		// TODO Auto-generated constructor stub
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}


}

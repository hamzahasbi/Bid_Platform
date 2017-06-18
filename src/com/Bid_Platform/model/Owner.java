package com.Bid_Platform.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Product Owner")
@NamedQueries({
		@NamedQuery(name="Owners",query="select o from Owner o "),
		@NamedQuery(name="Owner_by_name",query="select o from Owner o where o.nom= :name")
})
public class Owner extends Person{
	
	public Owner() {
		super();
	}
	private String description,serie;
	public Owner(String email, String nom, String prenom, String num_tel, String nationnalite, String mdp,
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
	@Override
	public String toString() {
		return "Owner [description=" + description + ", serie=" + serie + ", email=" + email + ", nom=" + nom
				+ ", prenom=" + prenom + ", num_tel=" + num_tel + ", nationnalite=" + nationnalite + ", mdp=" + mdp
				+ ", age=" + age + "]";
	}
	
	

}

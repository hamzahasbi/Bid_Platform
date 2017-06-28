package com.Bid_Platform.model;





import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.eclipse.persistence.jpa.config.Cascade;


@Entity
@NamedQueries({
		@NamedQuery(name="all_products",query="select pr from Produit pr "),
		@NamedQuery(name="products_by_serie",query="select pr from Produit pr where pr.serie= :serie"),
		@NamedQuery(name="products_by_name",query="select pr from Produit pr where pr.nom= :name"),
		@NamedQuery(name="products_by_cat",query="select pr from Produit pr where pr.categorie= :cat"),
		@NamedQuery(name="products_by_type",query="select pr from Produit pr where pr.categorie= :type"),
		@NamedQuery(name="products_by_price",query="select pr from Produit pr where pr.prix>= :inf and pr.prix<= :sup"),
		@NamedQuery(name="poducts_by_cat_price",query="select pr from Produit pr where pr.categorie= :type "
				+ "and pr.prix>= :inf and pr.prix<= :sup"),
		@NamedQuery(name="products_by_cat_name",query="select pr from Produit pr where pr.categorie= :type "
				+ "and pr.nom= :name"),
		
		@NamedQuery(name="products_by_owner",query="select pr from Produit pr JOIN pr.owner hada where hada.email = :mail"),
		@NamedQuery(name="products_by_candidate",query="select pr from Produit pr JOIN pr.participants hadou where hadou.email= :mail"),
		
})
public class Produit {
	
	@Id
	private String serie;
	private String nom,description,photo,etat;
	@ManyToOne(cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	//@JoinColumn(name="pr_fk")
	private Owner owner;
	private double prix;
	private String categorie;
	private long counted;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Candidate> participants;
	
	
	
	public Produit(String serie, String nom, String description, String photo, String etat, Owner owner, double prix, String categorie, long counted) {
		this.serie = serie;
		this.nom = nom;
		this.description = description;
		this.photo = photo;
		this.etat = etat;
		this.owner = owner;
		this.prix = prix;
		this.categorie = categorie;
		this.counted = counted;
		this.participants = new ArrayList<>();
	}
	
	public Produit() {
		super();
	}

	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public long getCounted() {
		return counted;
	}
	public void setCounted(long counted) {
		this.counted = counted;
	}
	public List<Candidate> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Candidate> participants) {
		this.participants = participants;
	}
	
	public int  insert() {
		Data_base_utils data_base_utils=new Data_base_utils();
		try{
			data_base_utils.begin();
			data_base_utils.getM().persist(this);
			data_base_utils.commit();
		}catch (Exception e){
			return -1;
		}
		return 1;
	}
	
}

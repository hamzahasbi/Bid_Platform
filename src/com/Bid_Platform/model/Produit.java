package com.Bid_Platform.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Produit {
	
	public Produit() {
		super();
	}
	@Id
	private String serie;
	@Column
	private String nom,description,date_debut,date_fin,photo,etat,owner;
	private double prix;
	private String categorie;
	public Produit(String serie, String nom, String description, String date_debut, String date_fin, String photo,
			String etat, String categorie, String owner, double prix) {
		super();
		this.serie = serie;
		this.nom = nom;
		this.description = description;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.photo = photo;
		this.etat = etat;
		this.categorie = categorie;
		this.owner = owner;
		this.prix = prix;
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
	public String getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}
	public String getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
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
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	

}

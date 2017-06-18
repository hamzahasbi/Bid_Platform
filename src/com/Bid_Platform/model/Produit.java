package com.Bid_Platform.model;





import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
@NamedQueries({
		@NamedQuery(name="all_products",query="select pr from Produit pr "),
		@NamedQuery(name="products_by_serie",query="select pr from Produit pr where pr.serie= :serie"),
		@NamedQuery(name="products_by_owner",query="select pr from Produit pr where pr.owner= :own"),
		@NamedQuery(name="products_by_name",query="select pr from Produit pr where pr.nom= :name"),
		@NamedQuery(name="products_by_type",query="select pr from Produit pr where pr.categorie= :type"),
		@NamedQuery(name="products_by_price",query="select pr from Produit pr where pr.prix>= :inf and pr.prix<= :sup"),
		@NamedQuery(name="products_by_begin_date",query="select pr from Produit pr where pr.date_debut= :beg_date"),
		@NamedQuery(name="products_by_end_date",query="select pr from Produit pr where pr.date_fin= :end_date"),
		@NamedQuery(name="poducts_by_cat_price",query="select pr from Produit pr where pr.categorie= :type "
				+ "and pr.prix>= :inf and pr.prix<= :sup"),
		@NamedQuery(name="products_by_cat_begin_date",query="select pr from Produit pr where pr.categorie= :type "
				+ "and pr.date_debut= :beg_date"),
		@NamedQuery(name="products_by_cat_end_date",query="select pr from Produit pr where pr.categorie= :type "
				+ "and pr.date_fin= :end_date"),
		@NamedQuery(name="products_by_cat_name",query="select pr from Produit pr where pr.categorie= :type "
				+ "and pr.nom= :name"),
		
		
})
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
	private long counted;
	public long getCounted() {
		return counted;
	}
	public void setCounted(long counted) {
		this.counted = counted;
	}
	public Produit(String serie, String nom, String description, String date_debut, String date_fin, String photo,
			String etat, String categorie, String owner, double prix,long counted) {
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
		this.counted=counted;
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
	@Override
	public String toString() {
		return "Produit [serie=" + serie + ", nom=" + nom + ", description=" + description + ", date_debut="
				+ date_debut + ", date_fin=" + date_fin + ", photo=" + photo + ", etat=" + etat + ", owner=" + owner
				+ ", prix=" + prix + ", categorie=" + categorie + ", counted=" + counted + "]";
	}
	
}

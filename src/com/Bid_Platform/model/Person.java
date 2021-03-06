package com.Bid_Platform.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//@DiscriminatorColumn(name="Role")
//@DiscriminatorValue("USER")


public abstract class Person {
	
	@Id
	protected String email;
	@Column
	protected String nom,prenom,num_tel,nationnalite,mdp;
	protected int age;
	
	public Person() {
		
	}
	public Person(String email, String nom, String prenom, String num_tel, String nationnalite, String mdp, int age) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.num_tel = num_tel;
		this.nationnalite = nationnalite;
		this.mdp = mdp;
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNum_tel() {
		return num_tel;
	}
	public void setNum_tel(String num_tel) {
		this.num_tel = num_tel;
	}
	public String getnationnalite() {
		return nationnalite;
	}
	public void setnationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [email=" + email + ", nom=" + nom + ", prenom=" + prenom + ", num_tel=" + num_tel
				+ ", nationnalite=" + nationnalite + ", mdp=" + mdp + ", age=" + age + "]";
	}


	public abstract String is_class();
	

}

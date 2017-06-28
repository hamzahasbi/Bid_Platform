package com.Bid_Platform.model;

import java.util.List;

import javax.persistence.*;

@Entity
//@DiscriminatorValue("Product Owner")
@NamedQueries({
		@NamedQuery(name="Owners",query="select o from Owner o "),
		@NamedQuery(name="Owner_by_name",query="select o from Owner o where o.nom= :name"),
		@NamedQuery(name="Owner_by_country",query="select o from Owner o where o.nationnalite= :country"),
		@NamedQuery(name="Owner_login",query="select o from Owner o where o.email= :mail and o.mdp= :psswd"),
		@NamedQuery(name="Owner_by_num",query="select o from Owner o where o.num_tel= :num"),
		@NamedQuery(name="Owner_by_email",query="select o from Owner o where o.email= :mail"),
		@NamedQuery(name="verif_owner",query="select o from Owner o where o.email= :mail and o.mdp= :psswd"),
		@NamedQuery(name="login_owner",query="select o from Owner o where o.email= :mail")
		
})
public class Owner extends Person{
	
	public Owner() {
		super();
	}
	@OneToMany(mappedBy="owner")
	private List<Produit> myproducts;
	public Owner(String email, String nom, String prenom, String num_tel, String nationnalite, String mdp,
			int age,List<Produit> myproducts) {
		super(email, nom, prenom, num_tel, nationnalite, mdp, age);
		
		this.myproducts=myproducts;
		// TODO Auto-generated constructor stub
	}

	public List<Produit> getMyproducts() {
		return myproducts;
	}
	public void setMyproducts(List<Produit> myproducts) {
		this.myproducts = myproducts;
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

	@Override
	public String is_class() {
		
		return "Owner";
	}

	
	

}

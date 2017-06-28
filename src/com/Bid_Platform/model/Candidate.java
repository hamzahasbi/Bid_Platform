package com.Bid_Platform.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@DiscriminatorValue("Candidate")
@NamedQueries({
	@NamedQuery(name="all_candidates",query="select c from Candidate c"),
	@NamedQuery(name="Candidate_by_email",query="select c from Candidate c where c.email= :mail"),
	@NamedQuery(name="verif_cand",query="select c from Candidate c where c.email= :mail and c.mdp= :psswd"),
	@NamedQuery(name="login_cand",query="select c from Candidate c where c.email= :mail")
})
public class Candidate extends Person{
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Produit> wanted;
	
	
	public Candidate() {
		super();
	}

	

	public Candidate(String email, String nom, String prenom, String num_tel, String nationnalite, String mdp, int age
			 ) {
		super(email, nom, prenom, num_tel, nationnalite, mdp, age);
		this.wanted = new ArrayList<>();
	}



	public List<Produit> getWanted() {
		return wanted;
	}


	public void setWanted(List<Produit> wanted) {
		this.wanted = wanted;
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
		return "Candidate";
	}

}

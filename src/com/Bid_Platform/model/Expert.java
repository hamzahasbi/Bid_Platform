package com.Bid_Platform.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
//@DiscriminatorValue("Expert")
@NamedQueries({
	@NamedQuery(name="Expert_cat",query="select ex from Expert ex where ex.categorie= :cat"),
	@NamedQuery(name="all_experts",query="select ex from Expert ex"),
	@NamedQuery(name="verif_expert",query="select ex from Expert ex where ex.email= :mail and ex.mdp= :psswd"),
	@NamedQuery(name="login_expert",query="select ex from Expert ex where ex.email= :mail")
})
public class Expert extends Person{
	
	public Expert() {
		super();
	}
	private String categorie;
	public Expert(String email, String nom, String prenom, String num_tel, String nationnalite, String mdp,
			int age,String categorie) {
		super(email, nom, prenom, num_tel, nationnalite, mdp, age);
	
		this.categorie=categorie;
	
	}
	
	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
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
		return "Expert";
	}


}

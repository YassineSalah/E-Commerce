package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class User {
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String nomUser) {
		super();
		
		this.nomUser = nomUser;
		Panier p=new Panier();
		
		this.panier = p;
	}
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idUser;
	@Column
	String nomUser;
	@OneToOne
	@JoinColumn(name="idPanier")
	Panier panier;

}

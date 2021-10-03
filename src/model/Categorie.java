package model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idCat;
	@Column 
	String nomCat;
	@OneToMany
	List<Produit> produits;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
	}
	public String getNomCat() {
		return nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	public Categorie( String nomCat) {
		super();
		
		this.nomCat = nomCat;
	}


}

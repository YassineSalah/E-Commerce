package model;

import javax.persistence.*;

    @Entity
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idProd;
	@Column 
	private String nomProd;
	@Column
	private double prix;
	@Column
	private String quantite;
	@ManyToOne
	@JoinColumn(name="idCat")
	private Categorie catg;
	public Produit(int idProd, String nomProd, double prix, String quantite, Categorie catg, Panier panier) {
		super();
		this.idProd = idProd;
		this.nomProd = nomProd;
		this.prix = prix;
		this.quantite = quantite;
		this.catg = catg;
		this.panier = panier;
	}
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getQuantite() {
		return quantite;
	}
	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}
	public Categorie getCatg() {
		return catg;
	}
	public void setCatg(Categorie catg) {
		this.catg = catg;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	@ManyToOne
	@JoinColumn(name="idPanier")
	private Panier panier;
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package model;

import javax.persistence.*;

@Entity
public class LignePanier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idLignePanier;
	@OneToOne 
	@JoinColumn(name="idProd")
	Produit prod;
	@Column
	int quantite;
	@Column
	double prixTot;
	public int getIdLignePanier() {
		return idLignePanier;
	}
	public void setIdLignePanier(int idLignePanier) {
		this.idLignePanier = idLignePanier;
	}
	public Produit getProd() {
		return prod;
	}
	public void setProd(Produit prod) {
		this.prod = prod;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public double getPrixTot() {
		return prixTot;
	}
	public void setPrixTot(double prixTot) {
		this.prixTot = prixTot;
	}
	public LignePanier(int idLignePanier, Produit prod, int quantite, double prixTot) {
		super();
		this.idLignePanier = idLignePanier;
		this.prod = prod;
		this.quantite = quantite;
		this.prixTot = prixTot;
	}
	public LignePanier() {
		super();
		// TODO Auto-generated constructor stub
	}


}

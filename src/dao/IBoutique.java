package dao;

import java.util.List;

import model.*;

public interface IBoutique {
	public void ajouterPanier(Panier p);
	public void supprimerPanier(Panier p);
	public List<Produit> getAllProdByCateg(Categorie c);
	public void AjouterUser(User u);

}

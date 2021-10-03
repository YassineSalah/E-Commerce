package dao;

import java.util.List;

import javax.persistence.*;

import model.Categorie;
import model.Panier;
import model.Produit;
import model.User;

public class BoutiqueImp implements IBoutique {
	EntityManager em;

	public BoutiqueImp() {
		super();
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("test1");
        em = factory.createEntityManager();	
	}

	@Override
	public void ajouterPanier(Panier p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}

	@Override
	public void supprimerPanier(Panier p) {
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Produit> getAllProdByCateg(Categorie c) {
		Query q = em.createNativeQuery("select * from Produit where idCat=?", model.Produit.class);
	    q.setParameter(1,c.getIdCat());
		List<Produit> prodList = q.getResultList();

		return prodList;
	}

	@Override
	public void AjouterUser(User u) {
		em.getTransaction().begin();
		em.persist(u);
		em.getTransaction().commit();
		
	}

}

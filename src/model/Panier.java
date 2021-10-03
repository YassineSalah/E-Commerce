package model;

import java.util.List;

import javax.persistence.*;


@Entity
public class Panier {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    int idPanier;
	@OneToOne
	@JoinColumn(name="idUser")
	User user;
	@OneToMany
	List<LignePanier> list_LignePanier;
	public int getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(int idPanier) {
		this.idPanier = idPanier;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Panier(User user) {
		super();
		this.user = user;
	}
	public Panier() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Panier(int idPanier,User u) {
		super();
		this.idPanier=idPanier;
		this.user=u;
		// TODO Auto-generated constructor stub
	}
		
	
}

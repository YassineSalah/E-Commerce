package controlleur;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.Session;

import dao.BoutiqueImp;
import model.Panier;
import model.User;

public class PrincipaleServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 EntityManager em;
    
    public PrincipaleServ() {
    	
    	 super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		User u=new User("yas");
		BoutiqueImp BoutImp=new BoutiqueImp();
		BoutImp.AjouterUser(u);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}

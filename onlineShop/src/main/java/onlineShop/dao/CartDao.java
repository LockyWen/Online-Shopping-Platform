package onlineShop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import onlineShop.model.Cart;

@Repository
public class CartDao {
	
	@Autowired 
	private SessionFactory sessionFactory;
	
	public Cart getCartId(int cartId) {
		Cart cart = null;
		try(Session session = sessionFactory.openSession()){
			session.beginTransaction();
			cart = (Cart) session.get(Cart.class, cartId);
			session.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return cart;
	}
}	

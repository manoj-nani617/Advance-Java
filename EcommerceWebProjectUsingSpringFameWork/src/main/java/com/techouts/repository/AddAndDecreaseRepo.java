package com.techouts.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Cart;
import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AddAndDecreaseRepo {
	@PersistenceContext
	EntityManager entityManager;
	public void increment(int id,User user) {
		Session session = entityManager.unwrap(Session.class);
		Cart cart = session.createQuery(
			    "from Cart where user.userId = :uid and product.productId = :pid", Cart.class)
			    .setParameter("pid", id).setParameter("uid", user.getUserId())
			    .uniqueResult();
		if(cart != null) {
		cart.setProductCount(cart.getProductCount()+1);
		session.merge(cart);
		}	
	}
	public void decrement(int id,User user) {
		Session session = entityManager.unwrap(Session.class);
		Cart cart = session.createQuery(
			    "from Cart where user.userId = :uid and product.productId = :pid", Cart.class)
			    .setParameter("pid", id).setParameter("uid", user.getUserId())
			    .uniqueResult();
		if(cart != null) {
			int count = cart.getProductCount();
			if(count <= 0) session.remove(cart);
			else {
			cart.setProductCount(count-1);
			session.merge(cart);
			}
		}
			
		
	}
	public void delete(int id,User user) {
		Session session = entityManager.unwrap(Session.class);
		Cart cart = session.createQuery(
			    "from Cart where user.userId = :uid and product.productId = :pid", Cart.class)
			    .setParameter("pid", id).setParameter("uid", user.getUserId())
			    .uniqueResult();
		if(cart != null) {
			session.remove(cart);
			session.flush();
			}
		
		
	}

}

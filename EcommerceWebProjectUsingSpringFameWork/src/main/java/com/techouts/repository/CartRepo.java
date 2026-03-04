package com.techouts.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Cart;
import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CartRepo {

	@PersistenceContext
	EntityManager entityManager;
	public List<Cart> getCart(User user) {
		Session session = entityManager.unwrap(Session.class);
		
		return session.createQuery("from Cart where user.userId = :uid" ,Cart.class).setParameter("uid", user.getUserId()).list();
	}
	
}

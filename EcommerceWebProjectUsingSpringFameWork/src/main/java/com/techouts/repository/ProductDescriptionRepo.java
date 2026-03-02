package com.techouts.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class ProductDescriptionRepo {
	@PersistenceContext
	EntityManager entityManager;
	public Products checkProduct(int id) {
		Session session = entityManager.unwrap(Session.class);
		Products p = session.find(Products.class, id);
		return p;
	}
	public Cart checkProductPresence(int id, int userId) {
		Session session = entityManager.unwrap(Session.class);
		Cart existingCart = session.createQuery(
			    "from Cart where user.userId = :uid and product.productId = :pid", Cart.class)
			    .setParameter("pid", id).setParameter("uid", userId)
			    .uniqueResult();
		
		
//		If Product is present Add the Count
		if(existingCart != null) {
			existingCart.setProductCount(existingCart.getProductCount()+1);
			session.persist(existingCart);
		}
		
		
//		If Cart is not there Create New product Cart
		else {
			Cart newCart = new Cart();
			newCart.setProductCount(1);
			newCart.setProduct(p);
			newCart.setUser(u);
			session.persist(newCart);


			
		}
		return existingCart;
	}
	
}

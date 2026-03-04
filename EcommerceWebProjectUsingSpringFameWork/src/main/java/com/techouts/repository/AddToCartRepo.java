package com.techouts.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Transactional
@Repository
public class AddToCartRepo {
	@PersistenceContext
	EntityManager entityManager;

	public Products checkProduct(int id) {
		Session session = entityManager.unwrap(Session.class);
		Products product = session.find(Products.class,id);
		return product;
	}

	public Cart checkExistingProduct(Products product,User user) {
		
		Session session = entityManager.unwrap(Session.class);
		return session.createQuery("from Cart where user.userId = :uid and product.productId = :pid",Cart.class).
								setParameter("uid",user.getUserId())
								.setParameter("pid", product.getProductId()).uniqueResult();
		
	}

	public void saveToCart(Cart newCart) {
		Session session = entityManager.unwrap(Session.class);
		session.persist(newCart);
		
	}

	public void increaseCountOfProduct(Cart existingProduct) {
		Session session = entityManager.unwrap(Session.class);
		existingProduct.setProductCount(existingProduct.getProductCount()+1);
		session.merge(existingProduct);

	}
}

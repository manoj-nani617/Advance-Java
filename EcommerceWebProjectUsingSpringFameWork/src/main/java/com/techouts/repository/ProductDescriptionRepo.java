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
	
}

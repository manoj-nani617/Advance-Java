package com.techouts.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Products;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class ProductRepo {
	@PersistenceContext
	private EntityManager entityManager;

	public List<Products> getProducts() {
		Session session = entityManager.unwrap(Session.class);
		List<Products> product = session.createQuery("from Products",Products.class).list();
		return product;
	}

}

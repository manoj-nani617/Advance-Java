package com.techouts.repository;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class LoginRepo {
	@PersistenceContext
	private EntityManager entityManager;
	public User findByEmail(String email, String password) {
		
		Session session = entityManager.unwrap(Session.class);
		User user = session.createQuery("from User where email = :email and password = :password",User.class)
				.setParameter("email", email)
				.setParameter("password", password)
				.uniqueResult(); 
		return user;
	}

}

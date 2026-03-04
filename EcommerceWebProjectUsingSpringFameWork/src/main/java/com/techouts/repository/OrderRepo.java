package com.techouts.repository;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.techouts.entity.Orders;
import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class OrderRepo {
	
	@PersistenceContext
	EntityManager entityManager;

	public List<Orders> getOrders(Orders order,User user) {
		Session session =entityManager.unwrap(Session.class);
		return  session.createQuery(
			    "select o from Orders o join fetch o.product where o.user = :user",
			    Orders.class)
			    .setParameter("user", user)
			    .list();
		
		
	}

	public void deleteOrder(int id) {
		Session session = entityManager.unwrap(Session.class);
		Orders order = session.find(Orders.class, id);
		session.remove(order);
		
		
	}
	
}

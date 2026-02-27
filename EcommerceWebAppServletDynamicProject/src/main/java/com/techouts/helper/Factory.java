package com.techouts.helper;



import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
	private static SessionFactory factory;
	static {
		Configuration config = new Configuration()
				.addAnnotatedClass(com.techouts.entity.Products.class)
				.addAnnotatedClass(com.techouts.entity.Cart.class)
				.addAnnotatedClass(com.techouts.entity.User.class)
				.addAnnotatedClass(com.techouts.entity.Orders.class)
				.configure("hibernate.config.xml");
		factory = config.buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		
		return factory;
	}

}

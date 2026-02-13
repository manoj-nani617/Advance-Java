package com.techouts;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static SessionFactory getFactory() {
		Configuration config = new Configuration()
				.addAnnotatedClass(com.techouts.UserDetails.class)
				.addAnnotatedClass(com.techouts.AddToCart.class)
				.configure("hibernate.config.xml");
		SessionFactory factory = config.buildSessionFactory();
		return factory;
	}

}

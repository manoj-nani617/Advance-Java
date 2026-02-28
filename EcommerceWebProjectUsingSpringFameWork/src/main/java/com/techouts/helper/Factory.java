package com.techouts.helper;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Factory {
	private static SessionFactory factory;
	static {
		Configuration config = new Configuration().addAnnotatedClass(com.techouts.entity.User.class).configure("hibernate.config.xml");
		factory = config.buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return factory;
	}

}

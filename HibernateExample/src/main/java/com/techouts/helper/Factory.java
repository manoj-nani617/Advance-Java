package com.techouts.helper;

import com.techouts.HibernateExample;
import com.techouts.onetoonerelationship.IdCard;
import com.techouts.onetoonerelationship.Student;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Factory {
    public static SessionFactory getFactory() {
        Configuration config = new Configuration()
                .addAnnotatedClass(IdCard.class)
                .addAnnotatedClass(Student.class)
                .configure("hibernate.config.xml");
        System.out.println("Created Successfully");
        return config.buildSessionFactory();
    }
}

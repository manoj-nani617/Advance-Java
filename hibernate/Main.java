package com.techouts.hibernate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {
    public static void main(String[] args) {
        Configuration config = new Configuration().addAnnotatedClass(com.techouts.hibernate.Laptop.class)
                .addAnnotatedClass(com.techouts.hibernate.Students.class)
                .configure("hibernate.config.xml");
        try(
                SessionFactory factory = config.buildSessionFactory();
                Session session = factory.openSession();
            )
        {
            Transaction transaction  = session.beginTransaction();

//            Query q = session.createNativeQuery("alter table students drop column laptop_id");
//            q.executeUpdate();
            Laptop l = new Laptop();
            l.setName("Macbook");

//
            Students s = new Students();
            s.setName("Manideep");
            s.getLaptop().add(l);
//
            session.persist(l);
            session.persist(s);
//
//            Query q  = session.createNativeQuery(");
//            q.executeUpdate();
            transaction.commit();
        }
    }
}

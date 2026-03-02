package com.techouts.repository;


import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.techouts.entity.User;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class RegisterRepo {

    @PersistenceContext
    private EntityManager entityManager;

    public User findByEmail(User user, String confirmPassword) {
  
        Session session = entityManager.unwrap(Session.class);
        String email = user.getEmail();

         User existingUser =  session.createQuery("FROM User WHERE email = :email", User.class)
                .setParameter("email",email)
                .uniqueResult(); 
        return existingUser;
    }

    public void save(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.persist(user);
        
    }

}
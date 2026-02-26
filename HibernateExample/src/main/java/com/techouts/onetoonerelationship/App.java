package com.techouts.onetoonerelationship;

import com.techouts.helper.Factory;
import jakarta.persistence.Id;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.io.File;
import java.util.List;

public class App {
    public static void main(String[] args) throws LifecycleException {
            try(Session session = Factory.getFactory().openSession())
            {
                Transaction transaction = session.beginTransaction();

//                Insertion
                Student s = new Student();
                s.setId(1);
                s.setMarks(90);

                IdCard idcard = new IdCard();
                idcard.setName("manoj");
                idcard.setRollNo(1);

                idcard.setStudent(s);
                s.setIdCard(idcard);

                session.persist(s);
                session.persist(idcard);



                transaction.commit();
//                Update
//                Student student2 = session.createQuery("from Student where name = :marks",Student.class)
//                                    .setParameter("name",90).getSingleResult();
//                student2.setMarks(97);
//
////                Reading
                List<IdCard> idCards = session.createQuery("from IdCard",IdCard.class).list();
                for(IdCard idCard : idCards) {
                    System.out.println(idCard.getName());
                    System.out.println(idCard.getRollNo());
                }





            }
    }
}

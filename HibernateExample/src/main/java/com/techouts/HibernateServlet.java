package com.techouts;

import com.techouts.helper.Factory;
import com.techouts.onetoonerelationship.Student;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;


public class HibernateServlet extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) {
        try(Session session = Factory.getFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            List<Student> students = session.createQuery("from Student",Student.class).list();
            for(Student s : students){
                System.out.println(s.getId());
                System.out.println(s.getMarks());
            }
            transaction.commit();
            System.out.println(students.size());


//            Student s = new Student();
//            s.setMarks(100);
//            s.setName("Vinay");
//            s.setId(4);
//            session.persist(s);



        }

    }
}

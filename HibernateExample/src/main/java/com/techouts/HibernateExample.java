package com.techouts;

import com.techouts.helper.Factory;
import com.techouts.onetoonerelationship.Student;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class HibernateExample {
    public static void main(String[] args) {
        try(Session session = Factory.getFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            Student s = new Student();
            s.setId(1);
            s.setMarks(45);
            session.persist(s);

            Course c1 = new Course();
            c1.setCid(4);
            c1.setCname("React");

            session.persist(c1);

//            Course c = new Course();
//            c.setCid(3);
//            c.setCname("Blockchain");

//
//            session.persist(c);
//            System.out.println(c);

            transaction.commit();
        }
    }

    @Entity
    public static class Course {
        @Id
        private int cid;
        private String cname;

        @ManyToMany(mappedBy = "course")

        List<Student> student;

        public String getCname() {
            return cname;
        }

        public void setCname(String cname) {
            this.cname = cname;
        }


        public int getCid() {
            return cid;
        }

        @Override
        public String toString() {
            return "Course{" +
                    "cid=" + cid +
                    ", cname='" + cname + '\'' +
                    '}';
        }

        public void setCid(int cid) {
            this.cid = cid;
        }

    }
}

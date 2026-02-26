package com.techouts.onetoonerelationship;

import com.techouts.HibernateExample;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Student {
    @Id
    int id;
    int marks;
    @OneToOne(mappedBy = "student")
    IdCard idCard;

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", marks=" + marks +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}

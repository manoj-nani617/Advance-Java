package com.techouts.onetoonerelationship;

import jakarta.persistence.*;
import org.hibernate.annotations.Cascade;

@Entity
public class IdCard {
    @Id
    @Column(name="rollno")
    int rollNo;
    String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Student student;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", student=" + student +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }


}

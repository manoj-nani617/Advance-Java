package com.techouts.SpringJdbcConnectivity.service;

import com.techouts.SpringJdbcConnectivity.modal.Student;
import com.techouts.SpringJdbcConnectivity.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentService {
    private StudentRepository repo;

    public StudentRepository getRepo() {
        return repo;
    }
    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }


    public void addStudent(Student s) {
        repo.save(s);

    }

    public List<Student> getStudents() {
        return repo.findAll();

    }
}

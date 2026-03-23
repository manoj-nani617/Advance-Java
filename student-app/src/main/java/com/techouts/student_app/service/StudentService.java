package com.techouts.student_app.service;

import com.techouts.student_app.dao.StudentDao;
import com.techouts.student_app.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<Student> getStudents() {
        return studentDao.findAll();
    }

    public Student addStudent(Student student) {
        studentDao.save(student);
        return student;
    }
}

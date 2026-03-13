package com.techouts.spring_security.controller;

import com.techouts.spring_security.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    List<Student> students = new ArrayList<>(
                    List.of(new Student(1,"manoj","Python"),
                    new Student(2,"Vinay","Java"),
                    new Student(3,"Shivaji","BlockChain")
                    )
                    );
    @GetMapping("/getStudents")
    public List<Student> getStudents() {
        return students;
    }
    @GetMapping("csrf-token")
    public CsrfToken getToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }
    @PostMapping("/addStudent")
    public String add(@RequestBody Student student){
        students.add(student);
        return "Success";
    }

}

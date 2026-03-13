package com.techouts.spring_security.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        return "Hello"+request.getSession().getId();
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request) {
        return "Manoj"+request.getSession().getId();
    }
}

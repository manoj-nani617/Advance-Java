package com.techouts.spring_security.controller;

import com.techouts.spring_security.model.Employee;
import com.techouts.spring_security.service.EmployeeService;
import com.techouts.spring_security.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    JwtService jwtService;

    @Autowired
    AuthenticationManager authenticationManager;
    @PostMapping("/register")
    public Employee add(@RequestBody Employee employee)
    {
        return employeeService.save(employee);
    }
    @GetMapping("/getEmployees")
    public List<Employee> getAllEmployees() {
       return employeeService.getAllEmployees();
    }
    @PostMapping("/login")
    public String login(@RequestBody Employee employee) {
        System.out.println(employee.getUsername());
        System.out.println(employee.getPassword());
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(employee.getUsername(),employee.getPassword()));
        System.out.println(authentication.isAuthenticated()+"Failure");
        if(authentication.isAuthenticated())
            return jwtService.generateToken(employee.getUsername());
        else return "Failure";

    }



}

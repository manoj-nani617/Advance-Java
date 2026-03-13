package com.techouts.spring_security.service;

import com.techouts.spring_security.dao.UserRepo;
import com.techouts.spring_security.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    UserRepo userRepo;
    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
    public Employee save(Employee employee) {
        employee.setPassword(encoder.encode(employee.getPassword()));
        userRepo.save(employee);
        return employee;

    }

    public List<Employee> getAllEmployees() {
        return userRepo.findAll();
    }
}

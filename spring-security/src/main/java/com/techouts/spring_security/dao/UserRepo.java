package com.techouts.spring_security.dao;

import com.techouts.spring_security.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public interface UserRepo extends JpaRepository<Employee,Integer> {
    Employee findByUsername(String username);
}

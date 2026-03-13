package com.techouts.spring_security.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private int id;
    private String username;
    private String password;
}

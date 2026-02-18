package com.techouts.SpringBootDemo.repo;

import org.springframework.stereotype.Repository;

@Repository("repo")

public class LaptopRepository {
    public void repo() {
        System.out.println("Saved successfully in database..");
    }
}

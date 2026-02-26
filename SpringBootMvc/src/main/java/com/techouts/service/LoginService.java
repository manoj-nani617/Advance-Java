package com.techouts.service;


import com.techouts.model.Users;
import com.techouts.repo.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LoginService {
    @Autowired
    private Repo userRepo;

    public List<Users> getUsers() {
        return userRepo.getList();
    }
    public void addUsers(Users user) {
        userRepo.addList(user);
    }



}


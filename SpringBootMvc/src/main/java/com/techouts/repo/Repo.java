package com.techouts.repo;

import com.techouts.model.Users;
import com.techouts.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class Repo {
    List<Users> users = new ArrayList<>();

    public void addList(Users u) {
        System.out.println("Service is comming into the repo and adding"+u.getPassword()+u.getUsername());
        users.add(u);
    }
    public List<Users> getList() {
        System.out.println("Service is comming into the repo and returning");
        return users;
    }
}

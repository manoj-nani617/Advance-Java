package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techouts.entity.User;
import com.techouts.repository.RegisterRepo;


@Service
public class RegisterService {

    @Autowired
    private RegisterRepo registerRepo;

    public void saveUser(User user,String confirmPassword) {
    	if(user.getPassword().equals(confirmPassword)) 
    		registerRepo.save(user);
    }

    public User checkEmail(User user,String confirmPassword) {
    	User existingUser = registerRepo.findByEmail(user,confirmPassword);
    	if(existingUser != null) {
    		 
    		 return null;
    	}
    	saveUser(user,confirmPassword);
        return user;
    }


}
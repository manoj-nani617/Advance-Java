package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.techouts.entity.User;
import com.techouts.repository.UserRepository;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user,String confirmPassword) {
    	if(user.getPassword().equals(confirmPassword)) 
    		userRepository.save(user);
    }

    public boolean authenticate(User user,String confirmPassword) {
    	System.out.println("Entering into the user authenticate method");
    	User existingUser = userRepository.findByEmail(user,confirmPassword);
    	if(existingUser == null) {
    		 
    		 return false;
    	}
    	saveUser(user,confirmPassword);
        return true;
    }
}
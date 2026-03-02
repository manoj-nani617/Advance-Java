package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.User;
import com.techouts.repository.LoginRepo;

@Service
public class LoginService {
	@Autowired
	private LoginRepo loginRepo;
	public User authenticateUser(String email, String password) {

		return loginRepo.findByEmail(email,password);
	}

}

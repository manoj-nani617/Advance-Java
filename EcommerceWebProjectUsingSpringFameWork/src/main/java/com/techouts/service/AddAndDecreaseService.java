package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.techouts.entity.User;
import com.techouts.repository.AddAndDecreaseRepo;

@Controller
public class AddAndDecreaseService {
	@Autowired
	AddAndDecreaseRepo addAndDecreaseRepo;
	public void increment(int id,User user) {
		System.out.println("comming into the serivemethod");
		addAndDecreaseRepo.increment(id,user);
	}
	public void decrement(int id,User user) {
		addAndDecreaseRepo.decrement(id,user);
	}
	public void delete(int id,User user) {
		addAndDecreaseRepo.delete(id,user);
	}

}

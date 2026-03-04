package com.techouts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Cart;
import com.techouts.entity.User;
import com.techouts.repository.CartRepo;

@Service
public class CartService {
	@Autowired
	CartRepo cartRepo;

	public List<Cart> getCart(User user) {
		// TODO Auto-generated method stub
		return cartRepo.getCart(user);
	}

}

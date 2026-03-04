package com.techouts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Cart;
import com.techouts.entity.Orders;
import com.techouts.entity.User;
import com.techouts.repository.PlaceOrderRepo;

@Service
public class PlaceOrderService {
	@Autowired
	PlaceOrderRepo placeOrderRepo;

	public boolean  getCartItems(User user,String address) {
		// TODO Auto-generated method stub
		List<Cart>cartItems =  placeOrderRepo.getCartItems(user);
		if(cartItems == null) {
			return false;
		}
		
		for(Cart cart : cartItems) {
			Orders existingOrder = placeOrderRepo.checkOrder(user,cart);

			    if(existingOrder != null){
			    	placeOrderRepo.setOrderCount(existingOrder,cart);
			        // 🔥 If already exists → increment quantity
			        
			    } else {
			    	
			    	placeOrderRepo.createOrder(user,cart,address);
			        
			    }
			
		}
		return true;
	}

}

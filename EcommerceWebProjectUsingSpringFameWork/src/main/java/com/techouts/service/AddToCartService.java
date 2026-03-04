package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.repository.AddToCartRepo;


@Service
public class AddToCartService {
	@Autowired
	AddToCartRepo addToCartRepo;

	public Products checkProduct(int id) {
		return addToCartRepo.checkProduct(id);
	}


	public Cart checkExistingProduct(Products product, User user) {
		return addToCartRepo.checkExistingProduct(product,user);
	}


	public void saveToCart(User user, Products product) {
		Cart newCart = new Cart();
		newCart.setUser(user);
		newCart.setProduct(product);
		newCart.setProductCount(1);
		addToCartRepo.saveToCart(newCart);
		
	}


	public void increseCountOfProduct(Cart existingProduct) {
		System.out.println("Entering into the service method");
		addToCartRepo.increaseCountOfProduct(existingProduct);
		
	}



}

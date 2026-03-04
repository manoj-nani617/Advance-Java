package com.techouts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.repository.ProductDescriptionRepo;

import jakarta.servlet.http.HttpSession;


@Service
public class ProductDescriptionService {
	@Autowired
	private ProductDescriptionRepo productDescriptionRepo;
	public Products checkProduct(int id) {
		Products product =  productDescriptionRepo.checkProduct(id);

		return product;
	}

}

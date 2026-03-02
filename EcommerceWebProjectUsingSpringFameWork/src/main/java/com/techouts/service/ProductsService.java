package com.techouts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techouts.entity.Products;
import com.techouts.repository.ProductRepo;

@Service
public class ProductsService {
	@Autowired
	private ProductRepo productRepo;

	public List<Products> getProducts() {
		
		return productRepo.getProducts();
		
	}

}

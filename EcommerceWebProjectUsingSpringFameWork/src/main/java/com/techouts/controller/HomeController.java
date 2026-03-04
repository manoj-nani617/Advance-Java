package com.techouts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techouts.entity.Products;
import com.techouts.service.ProductsService;

@Controller
public class HomeController {
	@Autowired
	private ProductsService productService;
	
	@GetMapping({"/","/home"})
	public String home(Model model) {
		
		List<Products> products = productService.getProducts();
		model.addAttribute("product",products);
		return "HomePage";
	}
	
}
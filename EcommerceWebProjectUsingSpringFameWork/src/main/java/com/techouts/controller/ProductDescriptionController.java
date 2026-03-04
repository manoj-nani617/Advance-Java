package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.service.ProductDescriptionService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProductDescriptionController {
	@Autowired
	ProductDescriptionService productDescriptionService;
	@GetMapping("/productdescription")
	public String productDescription(@RequestParam("id") int id,
				Model model,HttpSession httpSession) {

			Products product = productDescriptionService.checkProduct(id);
			model.addAttribute("product", product);
			return "productDescriptionPage";
		
	}
}

package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.Products;
import com.techouts.service.ProductDescriptionService;

@Controller
public class ProductDescriptionController {
	@Autowired
	ProductDescriptionService productDescriptionService;
	@GetMapping("/productdescription")
	public String productDescription(@RequestParam("id") String idString,
				Model model) {
		if(idString != null) {
			int id = Integer.parseInt("id");
			Products product = productDescriptionService.checkProduct(id);
			
			
		}
		return "ProductDescriptionPage";
	}
}

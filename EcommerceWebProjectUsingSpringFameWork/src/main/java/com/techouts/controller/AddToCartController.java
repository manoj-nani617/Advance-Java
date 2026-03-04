package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.service.AddToCartService;
import com.techouts.service.ProductDescriptionService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddToCartController {
	
	@Autowired
	AddToCartService addToCartService;
	@GetMapping("/addtocart")
	public String productDescription(@RequestParam("id") int  id,
				HttpSession httpSession) {
			User user = (User) httpSession.getAttribute("user");
			if(user == null) 
			{
				httpSession.setAttribute("url", "addtocart");
				httpSession.setAttribute("productId", id);
				return "Login";
				
			}
			Products product = addToCartService.checkProduct(id);
			
			Cart existingProduct = addToCartService.checkExistingProduct(product, user);
			
			if(existingProduct == null)
				addToCartService.saveToCart(user,product);
			else 
				addToCartService.increseCountOfProduct(existingProduct);
				
			return "redirect:/productdescription?id="+id;
			
			
		

		
	}

}

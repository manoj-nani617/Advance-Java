package com.techouts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.techouts.entity.Cart;
import com.techouts.entity.Products;
import com.techouts.entity.User;
import com.techouts.service.CartService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ViewCartController {
	@Autowired
	CartService cartService;
	
	@GetMapping("/viewcart")
	public String viewCart(HttpSession httpSession) {
		User user = (User)httpSession.getAttribute("user");
		if(user == null) 
		{
			httpSession.setAttribute("url", "viewcart");
			return "Login";
			
		}
		List<Cart> cartItems =  cartService.getCart(user);
		httpSession.setAttribute("cartItems", cartItems);
        int total = 0;
		for(Cart c : cartItems) {
			Products p = c.getProduct();
			int quantity = c.getProductCount();
			int productPrice = Integer.parseInt(p.getProductPrice());
			total += (productPrice*quantity);
			System.out.println("Entering");
		}
		System.out.println(total);
		httpSession.setAttribute("price", total);
		httpSession.setAttribute("cartItems", cartItems);
		return "AddToCart";
	}

}

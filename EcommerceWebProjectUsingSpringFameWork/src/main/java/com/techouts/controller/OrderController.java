package com.techouts.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.Orders;
import com.techouts.entity.User;
import com.techouts.service.OrderService;

import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public String placeOrder(HttpSession httpSession,Model model) {

		
		User user = (User) httpSession.getAttribute("user");
		
		if(user == null) {
			httpSession.setAttribute("url", "placeorder");
			return "Login";
		}
		else {
			Orders order = new Orders();
			List<Orders> orders = orderService.getOrders(order,user);
			
			model.addAttribute("orders", orders);
		}
		return "Orders";
	}
	@GetMapping("/deleteorder")
	public String deleteOrder(@RequestParam("id") int id) {
		orderService.deleteOrder(id);
		return "redirect:/orders";
	}

}

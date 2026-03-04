package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.User;
import com.techouts.service.AddAndDecreaseService;

import jakarta.servlet.http.HttpSession;

@Controller
public class AddAndDecreaseProductsController {
	@Autowired
	AddAndDecreaseService addAndDecrease;
	@GetMapping("/increment")
	public String increment(@RequestParam("id") int id,HttpSession httpSession) {
		User user = (User)httpSession.getAttribute("user");
		addAndDecrease.increment(id,user);
		return "redirect:/viewcart";
	}
	@GetMapping("/decrement")
	public String decrement(@RequestParam("id") int id,HttpSession httpSession) {

		User user = (User)httpSession.getAttribute("user");
		addAndDecrease.decrement(id,user);
		return "redirect:/viewcart";
	}
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id,HttpSession httpSession) {
			User user = (User)httpSession.getAttribute("user");
			addAndDecrease.delete(id,user);
			return "redirect:/viewcart";
	}
}

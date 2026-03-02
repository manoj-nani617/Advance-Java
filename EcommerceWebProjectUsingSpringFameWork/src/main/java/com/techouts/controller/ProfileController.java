package com.techouts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.techouts.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class ProfileController {
	@GetMapping("/profile")
	public String profile(HttpSession session) {
		User user = (User)session.getAttribute("user");
		if(user == null) {
			return "redirect:/login";
		}
		return "Profile";
	}

}

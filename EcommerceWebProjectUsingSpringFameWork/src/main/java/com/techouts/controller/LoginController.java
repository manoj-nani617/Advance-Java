package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.User;
import com.techouts.service.LoginService;
import com.techouts.service.RegisterService;

import jakarta.servlet.http.HttpSession;

@Controller

public class LoginController {
	@Autowired
	private LoginService loginService;
	
	
	@GetMapping("/login")
	public String getLogin() {
		return "Login";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("email") String email,
						@RequestParam("password") String password,
						Model model,HttpSession httpSession) 
	{
		User user  = loginService.authenticateUser(email,password);
		if(user != null)
		{
			httpSession.setAttribute("user", user);
			String url = (String) httpSession.getAttribute("url");
			Integer productId = (Integer) httpSession.getAttribute("productId");

			if(url != null && productId != null) {
			httpSession.removeAttribute("url");
			httpSession.removeAttribute("productId");
			
			return "redirect:/"+url+"?id="+productId;
			}
			else if(url != null) {
				httpSession.removeAttribute(url);
				return "redirect:/"+url;
			}
			else {
				return "redirect:/home";
			}
					
		}
		else {
			model.addAttribute("message","Email or Password Invalid");
			return "Login";
		}
	
	}
	


}
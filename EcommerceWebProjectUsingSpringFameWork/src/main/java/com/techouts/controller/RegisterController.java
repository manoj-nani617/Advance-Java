package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.User;
import com.techouts.service.RegisterService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;


    @GetMapping("/register")
    public String getRegister() {
    	return "Register";
    }
    @PostMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password,
                           @RequestParam("confirmPassword") String confirmPassword,
                           @RequestParam("phonenumber") String phoneNumber,
                           Model model,HttpSession session) {
    
    	User user = new User();
    	user.setEmail(email);
    	user.setPassword(password);
    	user.setPhoneNumber(phoneNumber);
    	user.setUserName(username);
    

        user = registerService.checkEmail(user, confirmPassword);
        if(user != null) {
        	session.setAttribute("user", user);
        	return "redirect:/home";
        }
        else {
        	model.addAttribute("message","Email Already Exist"); 
        	return "Register";
        }
    }
}
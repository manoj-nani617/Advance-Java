package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.User;
import com.techouts.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
    	return "Login";
    }
    
    @GetMapping("/register")
    public String getRegister() {
    	return "Register";
    }
    @PostMapping("/register")
    public String register(@RequestParam("username") String username,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password,
                           @RequestParam("confirmPassword") String confirmPassword) {
    

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);

        boolean userFound = userService.authenticate(user, confirmPassword);
        if(userFound) {
        	return "redirect:/HomePage";
        }
        return "redirect:/login";
    }
}
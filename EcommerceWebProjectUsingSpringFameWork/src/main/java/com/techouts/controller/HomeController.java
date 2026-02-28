package com.techouts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


    @RequestMapping({"/","/home"})
    public String home() {
        return "HomePage";
    }
    @RequestMapping("/cart")
    public String cart() {
    	return "CartPage";
    }
}
package com.techouts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techouts.entity.User;
import com.techouts.service.PlaceOrderService;

import jakarta.servlet.http.HttpSession;

@Controller
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService placeOrderService;
   
    @PostMapping("/placeorder")
    public String placeOrder(@RequestParam("phonenumber") String phonenumber,
            				@RequestParam("payment") String payment,
            				@RequestParam("address") String address,
            HttpSession session) {
        User user = (User) session.getAttribute("user");
        if (user == null) {
            // User not logged in -> redirect to login page
            session.setAttribute("url", "placeorder"); // optional: store intended URL
            return "Login";
        }

        boolean orderPlaced = placeOrderService.getCartItems(user, address);
        if (orderPlaced) {
            // Redirect to GET /orders to show orders
            return "redirect:/orders";
        } else {
            // If cart empty, redirect to view cart page
            return "redirect:/viewcart";
        }
    }
}
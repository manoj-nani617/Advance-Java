package com.techouts;

import com.techouts.model.Users;
import com.techouts.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private  LoginService service;
//    HomeController(LoginService service) {
//        this.service = service;
//    }
    @RequestMapping({"/","home"})
    public String home() {
        return "HomePage";
    }

    @RequestMapping("/login")
    public String login() {
        return "Login";
    }

    @RequestMapping("/register")
    public String register() {
        return "Register";
    }

    @RequestMapping("/result")
    public String result(HttpSession session, HttpServletRequest request)
    {
        Users u = new Users();

        String username = (String) request.getParameter("email");
        String password = (String) request.getParameter("password");
        System.out.println(username);
        System.out.println(password);
        u.setUsername(username);
        u.setPassword(password);

        service.addUsers(u);
        session.setAttribute("users",service.getUsers());
        return "result";
    }

}
package com.techouts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/HomePage")
    public ModelAndView home(ModelAndView mv)
    {
        mv.setViewName("HomePage");
        return mv;
    }
    @RequestMapping("AddToCart")
    public ModelAndView addToCart(ModelAndView mv) {
        mv.setViewName("AddToCart");
        return mv;
    }
    @RequestMapping("Register")
    public ModelAndView register(ModelAndView mv) {
        mv.setViewName("Register");
        return mv;
    }
    @RequestMapping("/")
    public ModelAndView login(ModelAndView mv) {
        mv.setViewName("Login");
        return mv;
    }

}

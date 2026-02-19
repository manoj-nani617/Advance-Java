package com.techouts;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
@Controller
public class HomeController{

    @RequestMapping("/")
    public ModelAndView home(ModelAndView mv) {
        mv.setViewName("index");
        return mv;


    }

    @ModelAttribute
    public String courseName() {
        return "Java";
    }

    @RequestMapping("add")
    public ModelAndView result(@ModelAttribute("alien1") Alien alien, ModelAndView mv) throws IOException {
        mv.addObject("alien1",alien);
         mv.setViewName("Result");



        return mv;
    }
}

package com.techouts;

import com.techouts.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(com.techouts.config.AppConfig.class);
//        Desktop obj = context.getBean(Desktop.class);
//        obj.compile();
        Alien a = context.getBean("alien ",Alien.class);
        a.method();





//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//
//        Alien a = (Alien)context.getBean("alien");
//        a.method();
    }
}
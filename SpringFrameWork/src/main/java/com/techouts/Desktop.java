package com.techouts;


import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {
//    int  a = 10;
//    public Desktop() {
//        System.out.println("Constructor is created");
//        a++;
//    }
    @Override
    public void compile() {
        System.out.println("Executing in Desktop ");

    }
}
